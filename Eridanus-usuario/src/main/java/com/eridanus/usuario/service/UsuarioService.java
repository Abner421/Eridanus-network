package com.eridanus.usuario.service;

import com.eridanus.usuario.entity.Usuario;
import com.eridanus.usuario.model.UsuarioDTO;

import java.util.List;

public interface UsuarioService {
    List<Usuario> obtenerUsuarios();
    Usuario crearUsuario(UsuarioDTO usuarioDTO);
    Usuario obtenerUsuarioId(int id);

    Usuario obtenerUsuarioNombre(String usuario);
}
