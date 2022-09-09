package com.eridanus.usuario.repository;

import com.eridanus.usuario.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    Usuario findById(int id);
    Usuario findByUsuario(String usuario);
}
