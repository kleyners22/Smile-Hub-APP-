package edu.unl.cc.smilehub.business.service;

import edu.unl.cc.smilehub.domain.security.Usuario;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.*;

@Stateless
public class UserRepository {

    @PersistenceContext
    private EntityManager em;

    public Usuario findByCedula(String cedula) {
        try {
            return em.createQuery(
                            "SELECT u FROM Usuario u WHERE u.cedula = :cedula",
                            Usuario.class
                    ).setParameter("cedula", cedula)
                    .getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}
