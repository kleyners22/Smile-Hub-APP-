package edu.unl.cc.smilehub.domain.security;

public class Usuario {

    private Long id;
    private String cedula;
    private String password;
    private TipoRol rol;

    public Usuario(Long id, String cedula, String password, TipoRol rol) {
        this.id = id;
        this.cedula = cedula;
        this.password = password;
        this.rol = rol;
    }

    public Long getId() { return id; }
    public String getCedula() { return cedula; }
    public String getPassword() { return password; }
    public TipoRol getRol() { return rol; }
}
