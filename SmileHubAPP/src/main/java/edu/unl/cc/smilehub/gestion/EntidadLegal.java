package edu.unl.cc.smilehub.gestion;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class EntidadLegal {

    @Column(name = "razon_social", length = 150)
    private String razonSocial;

    @Column(nullable = false, length = 100)
    private String nombres;

    @Column(nullable = false, length = 100)
    private String apellidos;

    @Column(name = "tipo_identificacion", nullable = false, length = 20)
    private String tipoIdentificacion;

    @Column(name = "numero_identificacion", nullable = false, length = 20)
    private String numeroIdentificacion;

    @Column(length = 20)
    private String telefono;

    @Column(length = 120)
    private String correo;

    protected EntidadLegal() {
    }

    protected EntidadLegal(String razonSocial,
                           String nombres,
                           String apellidos,
                           String tipoIdentificacion,
                           String numeroIdentificacion,
                           String telefono,
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

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }
}
