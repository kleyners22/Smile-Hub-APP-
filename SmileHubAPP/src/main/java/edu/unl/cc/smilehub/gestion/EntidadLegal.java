/*
@author Kleyner.ls
 */
package edu.unl.cc.smilehub.gestion;

public abstract class EntidadLegal {

    private String razonSocial;
    private String nombres;
    private String apellidos;
    private String tipoIdentificacion;
    private String numeroIdentificacion;
    private String telefono;
    private String correo;

    public EntidadLegal() {
    }

    public EntidadLegal(String razonSocial, String nombres, String apellidos, String tipoIdentificacion,
                        String numeroIdentificacion, String telefono,
                        String correo) {
        this.razonSocial = razonSocial;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
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
        final StringBuffer sb = new StringBuffer("EntidadLegal{");
        sb.append("razonSocial='").append(razonSocial).append('\'');
        sb.append(", nombres='").append(nombres).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", tipoIdentificacion='").append(tipoIdentificacion).append('\'');
        sb.append(", numeroIdentificacion='").append(numeroIdentificacion).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", correo='").append(correo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

