package com.eridanus.usuario.entity;

import com.eridanus.post.entity.Post;
import com.eridanus.usuario.model.UsuarioDTO;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name ="Usuario")
@Table(name = "Usuario")
public class Usuario implements Serializable {
    private static final long serialVersionUID = -7456719845332461895L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "sexo")
    private byte sexo;

    @JoinColumn (name = "post_id")
    private Integer postId;

    public Usuario() {
    }

    public Usuario(Integer id, String usuario, String nombre, String apellido, byte sexo, Integer postId) {
        this.id = id;
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.postId = postId;
    }

    public static Usuario from(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setId(usuarioDTO.getId());
        usuario.setUsuario(usuarioDTO.getUsuario());
        usuario.setNombre(usuarioDTO.getNombre());
        usuario.setApellido(usuarioDTO.getApellido());
        usuario.setSexo(usuarioDTO.getSexo());
        usuario.setPostId(usuarioDTO.getPost_id());
        return usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public byte getSexo() {
        return sexo;
    }

    public void setSexo(byte sexo) {
        this.sexo = sexo;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UsuarioDTO to() {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setId(getId());
        usuarioDTO.setUsuario(getUsuario());
        usuarioDTO.setNombre(getNombre());
        usuarioDTO.setApellido(getApellido());
        usuarioDTO.setSexo(getSexo());
        usuarioDTO.setPost_id(getPostId());

        return usuarioDTO;
    }
}
