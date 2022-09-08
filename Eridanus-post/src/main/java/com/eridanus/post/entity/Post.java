package com.eridanus.post.entity;

import com.eridanus.post.model.ComentarioDTO;
import com.eridanus.post.model.PostDTO;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Post")
@Table(name = "post")
public class Post implements Serializable {
    private static final long serialVersionUID = -7456717342332461895L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(updatable = false)
    private Integer id;

    @Column(nullable = false, name = "usuarioId")
    private Integer usuarioId;

    @Column(nullable = false, name = "contenidoTexto")
    private String contenidoTexto;

    @ManyToOne
    @JoinColumn(name = "comentario_id")
    private Comentario comentario;


    public static Post from(PostDTO postDTO) {
        Post post = new Post();
        post.setId(postDTO.getId());
        post.setUsuarioId(postDTO.getUsuarioId());
        post.setContenidoTexto(postDTO.getContenidoTexto());
        post.setComentario(postDTO.getComentario());
        return post;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getContenidoTexto() {
        return contenidoTexto;
    }

    public void setContenidoTexto(String contenidoTexto) {
        this.contenidoTexto = contenidoTexto;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", usuarioId=" + usuarioId +
                ", contenidoTexto='" + contenidoTexto + '\'' +
                ", comentario=" + comentario +
                '}';
    }

    public PostDTO to() {
        PostDTO postDTO = new PostDTO();
        postDTO.setId(getId());
        postDTO.setUsuarioId(getUsuarioId());
        postDTO.setContenidoTexto(getContenidoTexto());

        return postDTO;
    }
}
