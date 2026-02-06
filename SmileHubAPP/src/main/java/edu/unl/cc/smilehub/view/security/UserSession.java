package edu.unl.cc.smilehub.view.security;

import edu.unl.cc.smilehub.domain.security.Usuario;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import jakarta.faces.context.FacesContext;
import jakarta.faces.application.NavigationHandler;
import java.io.Serializable;

@Named("userSession")
@SessionScoped
public class UserSession implements Serializable {

    private static final long serialVersionUID = 1L;
    private Usuario usuario;

    public void postLogin(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean isLogged() {
        return usuario != null;
    }

    /**
     * MÉTODO DE SEGURIDAD MEJORADO
     * Se ejecuta antes de cargar el dashboard.
     * Si no hay sesión, fuerza la salida al login.
     */
    public void checkLogin() {
        if (!isLogged()) {
            FacesContext context = FacesContext.getCurrentInstance();
            NavigationHandler handler = context.getApplication().getNavigationHandler();

            // Forzamos la redirección inmediata
            handler.handleNavigation(context, null, "/login.xhtml?faces-redirect=true");
            context.renderResponse();
        }
    }

    public boolean hasRole(String role) {
        // En el futuro aquí validarás contra usuario.getRole()
        return isLogged();
    }

    // El Topbar busca "userSession.user.name"
    public Usuario getUser() {
        return usuario;
    }

    public String getName() {
        return (usuario != null) ? usuario.getName() : "Invitado";
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}