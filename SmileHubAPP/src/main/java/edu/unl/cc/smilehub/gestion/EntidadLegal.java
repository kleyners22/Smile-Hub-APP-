/*
@author Kleyner.ls
 */
package edu.unl.cc.smilehub.gestion;

public abstract class EntidadLegal {

    private String razonSocial;
    private String tipoIdentificacion;
    private String dni;
    private String telefono;
    private String correo;

    public EntidadLegal() {
    }

    public EntidadLegal(String razonSocial, String tipoIdentificacion, String dni, String telefono,
                        String correo) {
        this.razonSocial = razonSocial;
        this.tipoIdentificacion = tipoIdentificacion;
        this.dni = dni;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "EntidadLegal{" +
                "razonSocial='" + razonSocial + '\'' +
                ", tipoIdentificacion='" + tipoIdentificacion + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}

