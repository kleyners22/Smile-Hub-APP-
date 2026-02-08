package edu.unl.cc.smilehub.domain.security;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Rol {

    private Long id;
    private TipoRol tipoRol;

    public Rol() {}

    public Rol(Long id, TipoRol tipoRol) {
        this.id = id;
        this.tipoRol = tipoRol;
    }

    public Long getId() {
        return id;
    }

    public TipoRol getTipoRol() {
        return tipoRol;
    }
}
