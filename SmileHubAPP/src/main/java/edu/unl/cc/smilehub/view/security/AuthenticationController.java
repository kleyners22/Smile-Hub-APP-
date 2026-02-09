package edu.unl.cc.smilehub.view.security;

import edu.unl.cc.smilehub.business.security.SecurityFacade;
import edu.unl.cc.smilehub.domain.admin.Usuario;
import edu.unl.cc.smilehub.domain.admin.TipoRol;
import edu.unl.cc.smilehub.exception.CredentialInvalidException;
import edu.unl.cc.smilehub.exception.EntityNotFoundException;
import edu.unl.cc.smilehub.faces.FacesUtil;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.logging.Logger;

@Named
@ViewScoped
public class AuthenticationController implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final Logger logger =
            Logger.getLogger(AuthenticationController.class.getName());

    private String username;
    private String password;

    @Inject
    private SecurityFacade securityFacade;

    @Inject
    private UserSession userSession;

    /**
     * Método para login
     */
    public String login() {
        try {
            Usuario user = securityFacade.authenticate(username, password);
            userSession.login(user);

            FacesUtil.addSuccessMessageAndKeep(
                    "Inicio de sesión",
                    "Bienvenido a SmileHub"
            );

            // Redireccionar según rol
            switch (user.getRol()) {
                case PACIENTE:
                    return "/pages/paciente/citas.xhtml?faces-redirect=true";
                case DOCTOR:
                    return "/pages/doctor/citas-hoy.xhtml?faces-redirect=true";
                case SECRETARIA:
                    return "/pages/secretaria/agendar-citas.xhtml?faces-redirect=true";
                default:
                    logger.warning("Rol desconocido: " + user.getRol());
                    return "/index.xhtml?faces-redirect=true";
            }

        } catch (CredentialInvalidException | EntityNotFoundException e) {
            FacesUtil.addErrorMessage("Error", e.getMessage());
            return null;
        }
    }

    /**
     * Método para logout
     */
    public String logout() {
        userSession.logout();
        return "/index.xhtml?faces-redirect=true";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
