package com.eridanus.usuario.model;

import org.springframework.http.HttpStatus;

import java.util.Date;

public class Response {
    private Date timestamp;
    private String mensaje;
    private HttpStatus codigo;

    public Response() {
    }

    public Response(Date timestamp, String mensaje, HttpStatus codigo) {
        this.timestamp = timestamp;
        this.mensaje = mensaje;
        this.codigo = codigo;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public HttpStatus getCodigo() {
        return codigo;
    }

    public void setCodigo(HttpStatus codigo) {
        this.codigo = codigo;
    }
}
