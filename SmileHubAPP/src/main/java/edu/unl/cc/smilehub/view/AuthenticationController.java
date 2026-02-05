package edu.unl.cc.smilehub.view;

import edu.unl.cc.smilehub.domain.security.Usuario;
import edu.unl.cc.smilehub.faces.FacesUtil;
import edu.unl.cc.smilehub.view.security.UserPrincipalDTO;
import edu.unl.cc.smilehub.view.security.UserSession;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class AuthenticationController implements Serializable {

    private String username;
    private String password;

    @Inject
    private UserSession userSession;

    public String login() {
        if ("admin".equals(username) && "12345678".equals(password)) {

            Usuario user = new Usuario();
            user.setUsername(username);
            user.setPassword(password);

            user.setName("Secretaria SmileHub");
            setHttpSession(user);

            userSession.postLogin(user);

            FacesUtil.addSuccessMessageAndKeep("¡Bienvenida!", user.getName());

            return "/dashboard.xhtml?faces-redirect=true";
        } else {
            FacesUtil.addErrorMessage("Error", "Credenciales incorrectas");
            return null;
        }
    }

    private void setHttpSession(Usuario user) {
        FacesContext context = FacesContext.getCurrentInstance();
        UserPrincipalDTO userPrincipal = new UserPrincipalDTO(user);
        context.getExternalContext().getSessionMap().put("user", userPrincipal);
    }

    public String logout() {
        //todo
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "/login.xhtml?faces-redirect=true";
    }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
