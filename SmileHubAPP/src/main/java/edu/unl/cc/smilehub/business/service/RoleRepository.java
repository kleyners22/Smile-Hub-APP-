package edu.unl.cc.smilehub.business.service;
import edu.unl.cc.smilehub.domain.security.TipoRol;
import jakarta.ejb.Stateless;

import java.util.List;

@Stateless
public class RoleRepository {

    public List<TipoRol> findAll() {
        return List.of(
                TipoRol.DOCTOR,
                TipoRol.PACIENTE,
                TipoRol.SECRETARIA
        );
    }
}