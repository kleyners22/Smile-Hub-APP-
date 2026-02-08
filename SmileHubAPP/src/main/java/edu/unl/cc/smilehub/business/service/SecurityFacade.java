package edu.unl.cc.smilehub.business.service;

import edu.unl.cc.smilehub.domain.security.TipoRol;
import edu.unl.cc.smilehub.domain.security.Usuario;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class SecurityFacade {

    @Inject
    private UserRepository userRepository;

    public Usuario authenticate(String cedula, String password) {

        Usuario user = userRepository.findByCedula(cedula);

        if (user == null) {
            return null;
        }

        if (!user.getPassword().equals(password)) {
            return null;
        }

        return user;
    }

    public boolean isDoctor(Usuario u) {
        return u.getRol() == TipoRol.DOCTOR;
    }

    public boolean isPaciente(Usuario u) {
        return u.getRol() == TipoRol.PACIENTE;
    }

    public boolean isSecretaria(Usuario u) {
        return u.getRol() == TipoRol.SECRETARIA;
    }
}