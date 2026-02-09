package edu.unl.cc.smilehub.business.security;

import edu.unl.cc.smilehub.domain.admin.Usuario;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.NoResultException;

@Stateless
public class UserRepository {

    @PersistenceContext
    private EntityManager em;

    public Usuario findByIdentificacion(String identificacion) {
        try {
            return em.createQuery(
                            "SELECT u FROM Usuario u WHERE u.identificacion = :id", Usuario.class)
                    .setParameter("id", identificacion)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}
