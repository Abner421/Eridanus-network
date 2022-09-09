package com.eridanus.usuario.api;

import com.eridanus.usuario.entity.Usuario;
import com.eridanus.usuario.model.Response;
import com.eridanus.usuario.model.UsuarioDTO;
import com.eridanus.usuario.service.UsuarioImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("usuario/v1")
public class UsuarioController {
    private static final Logger LOGGER = Logger.getLogger(UsuarioController.class);

    @Autowired
    private UsuarioImpl usuarioService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/crearUsuario")
    @ResponseStatus(HttpStatus.OK)
    public Response crearUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        Response r = new Response();
        LOGGER.info(":: Creación de Usuario ::");
        List<Usuario> usuariosActuales = obtenerUsuarios();
        if(usuariosActuales.size() > 0) {
            for(Usuario u : usuariosActuales) {
                if(u.getUsuario().equalsIgnoreCase(usuarioDTO.getUsuario())) {
                    LOGGER.error(":: Usuario duplicado ::");
                    r.setTimestamp(new Date());
                    r.setCodigo(HttpStatus.FORBIDDEN);
                    r.setMensaje("Usuario duplicado :" + usuarioDTO.getUsuario());

                }

                r.setTimestamp(new Date());
                r.setCodigo(HttpStatus.CREATED);
                r.setMensaje("¡Usuario creado exitosamente!");
            }
        }

        r.setTimestamp(new Date());
        r.setCodigo(HttpStatus.CREATED);
        r.setMensaje("¡Usuario creado exitosamente!");

        return r;
    }

    @GetMapping("/usuario/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UsuarioDTO obtenerUsuario(@PathVariable("id") int id) {
        LOGGER.info(":: Obtención de Usuario ::");
        return usuarioService.obtenerUsuarioId(id).to();
    }

    @GetMapping("/usuarios")
    @ResponseStatus(HttpStatus.OK)
    public List<Usuario> obtenerUsuarios() {
        LOGGER.info(":: Obteniendo Usuarios ::");
        return usuarioService.obtenerUsuarios();
    }

    @GetMapping("/monitoreo")
    @ResponseStatus(HttpStatus.OK)
    public HttpStatus monitoreo() {
        LOGGER.info(":: Servicio Usuario Ejecutándose ::");
        return HttpStatus.OK;
    }
}
