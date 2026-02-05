package edu.unl.cc.smilehub.view.security;

import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.servlet.ServletException;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import java.util.logging.Logger;

@Named
@ViewScoped
public class UserListController implements Serializable {

    private static final Logger logger = Logger.getLogger(UserListController.class.getName());

    @NotNull @NotEmpty @Size(min=5, message = "Usuario muy corto")
    private String username;

    @NotNull @NotEmpty @Size(min=4, message = "Contraseña muy corta")
    private String password;

    @Inject
    private UserSession userSession; // Esta es la otra clase que debemos crear

    public String login() {
        logger.info("Intento de login para: " + username);

        // LÓGICA DE PRUEBA (Sustituye esto por tu consulta a Base de Datos luego)
        if ("admin123".equals(username) && "clave123".equals(password)) {

            // Simulamos un usuario para la sesión
            setHttpSession(username);

            return "dashboard.xhtml?faces-redirect=true";
        } else {
            // Aquí podrías usar FacesUtil si ya tienes esa clase de utilidad
            return null;
        }
    }

    private void setHttpSession(String user) {
        FacesContext context = FacesContext.getCurrentInstance();
        // Guardamos el nombre en el mapa de sesión para que el Topbar lo vea
        context.getExternalContext().getSessionMap().put("user", user);
    }

    public String logout() throws ServletException {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.getExternalContext().invalidateSession();
        return "/index.xhtml?faces-redirect=true";
    }

    // Getters y Setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}