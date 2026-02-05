package edu.unl.cc.smilehub.view.security;

import edu.unl.cc.smilehub.domain.security.Usuario;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import jakarta.faces.context.FacesContext; // Importante para la redirección
import java.io.Serializable;

@Named("userSession")
@SessionScoped
public class UserSession implements Serializable {

    private Usuario usuario;

    public void postLogin(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean isLogged() {
        return usuario != null;
    }

    // MÉTODO DE SEGURIDAD: Evita que entren al dashboard sin loguearse
    public String checkLogin() {
        if (!isLogged()) {
            return "/login.xhtml?faces-redirect=true";
        }
        return null;
    }

    // MÉTODO PARA ROLES: El topbar del ingeniero pregunta por esto
    public boolean hasRole(String role) {
        // Por ahora, como estamos probando, devolvemos true
        return isLogged();
    }

    // ALIAS PARA COMPATIBILIDAD: El topbar busca "user.name"
    public Usuario getUser() {
        return usuario;
    }

    public String getName() {
        return (usuario != null) ? usuario.getName() : "Invitado";
    }

    // Getters y Setters estándar
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}