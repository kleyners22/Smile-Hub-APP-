/*
@author Kleyner.ls
 */
package edu.unl.cc.smilehub.domain;


public class AtencionMedica{

    private String nombreAtencion;
    private double costoAtencion;
    private String descripcionMedica;
    private TipoAtencion tipoAtencion;
    public AtencionMedica() {

    }

    public AtencionMedica(String nombreAtencion, double costoAtencion, String descripcionMedica, TipoAtencion
            tipoAtencion) {
        this.setNombreAtencion(nombreAtencion);
        this.setCostoAtencion(costoAtencion);
        this.setDescripcionMedica(descripcionMedica);
        this.setTipoAtencion(tipoAtencion);
    }

    public void agregarAtencionMedica(String nombreAtencion, String descripcionMedica, TipoAtencion tipoAtencion) {
        this.setNombreAtencion(nombreAtencion);
        this.setDescripcionMedica(descripcionMedica);
        this.setTipoAtencion(tipoAtencion);
    }

    public String getNombreAtencion() {
        return nombreAtencion;
    }

    public void setNombreAtencion(String nombreAtencion) {
        if (nombreAtencion == null || nombreAtencion.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de la atención no puede ser nulo ni vacío");
        }
        this.nombreAtencion = nombreAtencion;
    }

    public double getCostoAtencion() {
        return costoAtencion;
    }

    public void setCostoAtencion(double costoAtencion) {
        if (costoAtencion <= 0) {
            throw new IllegalArgumentException("El costo de la atención debe ser mayor a cero");
        }
        this.costoAtencion = costoAtencion;
    }

    public String getDescripcionMedica() {
        return descripcionMedica;
    }

    public void setDescripcionMedica(String descripcionMedica) {
        if (descripcionMedica == null || descripcionMedica.trim().isEmpty()) {
            throw new IllegalArgumentException("La descripción médica no puede ser nula ni vacía");
        }
        this.descripcionMedica = descripcionMedica;
    }

    public TipoAtencion getTipoAtencion() {
        return tipoAtencion;
    }

    public void setTipoAtencion(TipoAtencion tipoAtencion) {
        if (tipoAtencion == null) {
            throw new IllegalArgumentException("El tipo de atención no puede ser nulo");
        }
        this.tipoAtencion = tipoAtencion;
    }

    @Override
    public String toString() {
        return "AtencionMedica{" +
                "nombreAtencion='" + nombreAtencion + '\'' +
                ", costoAtencion=" + costoAtencion +
                ", descripcionMedica='" + descripcionMedica + '\'' +
                ", tipoAtencion=" + tipoAtencion +
                '}';
    }
}
