package com.eridanus.usuario.service;

import com.eridanus.usuario.entity.Usuario;
import com.eridanus.usuario.model.UsuarioDTO;
import com.eridanus.usuario.repository.UsuarioRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioImpl implements UsuarioService{

    private static final Logger LOGGER = Logger.getLogger(UsuarioImpl.class);

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> obtenerUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario crearUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioRepository.save(Usuario.from(usuarioDTO));
        return usuario;
    }

    @Override
    public Usuario obtenerUsuarioId(int id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario obtenerUsuarioNombre(String usuario) {
        return usuarioRepository.findByUsuario(usuario);
    }

    public UsuarioImpl(UsuarioRepository usuarioRepository) { this.usuarioRepository = usuarioRepository; }
}
