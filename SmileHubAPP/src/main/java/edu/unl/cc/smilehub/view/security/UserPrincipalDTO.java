package edu.unl.cc.smilehub.view.security;

import edu.unl.cc.smilehub.domain.security.Usuario;
import java.io.Serializable;
import java.security.Principal;

public class UserPrincipalDTO implements Principal, Serializable {
    private final Usuario usuario;

    public UserPrincipalDTO(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String getName() {
        return (usuario != null) ? usuario.getName() : "Sin Nombre";
    }

    public Usuario getUsuario() {
        return usuario;
    }
}