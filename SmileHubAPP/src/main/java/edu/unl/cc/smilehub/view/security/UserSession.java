package edu.unl.cc.smilehub.view.security;

import edu.unl.cc.smilehub.domain.admin.Usuario;
import edu.unl.cc.smilehub.domain.admin.TipoRol;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@SessionScoped
public class UserSession implements Serializable {

    private static final long serialVersionUID = 1L;

    private Usuario usuario;

    public void login(Usuario usuario) {
        this.usuario = usuario;
    }


    public void logout() {
        this.usuario = null;
    }

    public boolean isLogged() {
        return usuario != null;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public TipoRol getRol() {
        return usuario != null ? usuario.getRol() : null;
    }

    // Ayuda para vistas
    public boolean isPaciente() {
        return usuario != null && usuario.getRol() == TipoRol.PACIENTE;
    }

    public boolean isDoctor() {
        return usuario != null && usuario.getRol() == TipoRol.DOCTOR;
    }

    public boolean isSecretaria() {
        return usuario != null && usuario.getRol() == TipoRol.SECRETARIA;
    }
}
