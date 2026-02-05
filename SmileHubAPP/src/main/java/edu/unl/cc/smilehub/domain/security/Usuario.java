package edu.unl.cc.smilehub.domain.security;

import edu.unl.cc.smilehub.gestion.EntidadLegal;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String username;
    private String password;
    private EntidadLegal persona;
    private String name; // Agregamos este campo para persistir el nombre personalizado

    public Usuario() {
    }

    public Usuario(String username, String password, EntidadLegal persona) {
        this.username = username;
        this.password = password;
        this.persona = persona;
    }

    // Lógica mejorada: Si hay un nombre manual, úsalo; si no, ve a persona; si no, usa el username
    public String getName() {
        if (name != null && !name.isEmpty()) return name;
        return (persona != null) ? persona.getRazonSocial() : username;
    }

    // Setter para el nombre (Esto quitará el error rojo en tu AuthenticationController)
    public void setName(String name) {
        this.name = name;
    }

    // Getters y Setters estándar
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public EntidadLegal getPersona() { return persona; }
    public void setPersona(EntidadLegal persona) { this.persona = persona; }
}
