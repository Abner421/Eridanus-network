package com.eridanus.post.entity;

import javax.persistence.*;

@Entity
@Table(name = "comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "usuarioId")
    private Integer usuarioId;

    @Column(name = "comentarioTexto")
    private String comentarioTexto;

    public Comentario() {
    }

    public Comentario(Integer id, Integer usuarioId, String comentarioTexto) {
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
        return "Comentario{" +
                "id=" + id +
                ", usuarioId=" + usuarioId +
                ", comentarioTexto='" + comentarioTexto + '\'' +
                '}';
    }
}