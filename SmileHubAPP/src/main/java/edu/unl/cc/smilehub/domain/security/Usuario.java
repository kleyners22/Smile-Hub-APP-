/**
 * @author kleyner.ls
 */
package edu.unl.cc.smilehub.domain.security;

public class Usuario {

    private String cedula;
    private String contrasena;
    private RolUsuario rol;

    public Usuario() {}

    public Usuario(String cedula, String contrasena, RolUsuario rol) {
        this.cedula = cedula;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public RolUsuario getRol() {
        return rol;
    }

    public void setRol(RolUsuario rol) {
        this.rol = rol;
    }
}