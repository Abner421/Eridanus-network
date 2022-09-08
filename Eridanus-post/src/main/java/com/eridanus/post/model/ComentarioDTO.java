package com.eridanus.post.model;

public class ComentarioDTO {
    private Integer id;
    private Integer usuarioId;
    private String comentarioTexto;

    public ComentarioDTO() {
    }

    public ComentarioDTO(Integer id, Integer usuarioId, String comentarioTexto) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.comentarioTexto = comentarioTexto;
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

    public String getComentarioTexto() {
        return comentarioTexto;
    }

    public void setComentarioTexto(String comentarioTexto) {
        this.comentarioTexto = comentarioTexto;
    }

    @Override
    public String toString() {
        return "ComentarioDTO{" +
                "id=" + id +
                ", usuarioId=" + usuarioId +
                ", comentarioTexto='" + comentarioTexto + '\'' +
                '}';
    }
}
