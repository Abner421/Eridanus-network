package com.eridanus.post.model;

import com.eridanus.post.entity.Comentario;

public class PostDTO {
    private Integer id;
    private Integer usuarioId;
    private String contenidoTexto;
    private Comentario comentario;

    public PostDTO() {
    }

    public PostDTO(Integer id, Integer usuarioId, String contenidoTexto, Comentario comentario) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.contenidoTexto = contenidoTexto;
        this.comentario = comentario;
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

    public void setComentarioDTO(Comentario comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "PostDTO{" +
                "id=" + id +
                ", usuarioId=" + usuarioId +
                ", contenidoTexto='" + contenidoTexto + '\'' +
                ", comentarioDTO=" + comentario +
                '}';
    }
}
