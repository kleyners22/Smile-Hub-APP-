/*
@author Kleyner.ls
 */
package edu.unl.cc.smilehub.domain;


public class AtencionMedica{

    private double costoAtencion;
    private String descripcionMedica;
    private TipoAtencion tipoAtencion;

    public AtencionMedica(){

    }

    public AtencionMedica(double costoAtencion, String descripcionMedica, TipoAtencion tipoAtencion){
        this.costoAtencion = costoAtencion;
        this.descripcionMedica = descripcionMedica;
        this.tipoAtencion = tipoAtencion;
    }

    public double getCostoAtencion() {
        return costoAtencion;
    }

    public void setCostoAtencion(double costoAtencion) {
        this.costoAtencion = costoAtencion;
    }

    public String getDescripcionMedica() {
        return descripcionMedica;
    }

    public void setDescripcionMedica(String descripcionMedica) {
        this.descripcionMedica = descripcionMedica;
    }

    public TipoAtencion getTipoAtencion() {
        return tipoAtencion;
    }

    public void setTipoAtencion(TipoAtencion tipoAtencion) {
        this.tipoAtencion = tipoAtencion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AtencionMedica{");
        sb.append("costoAtencion=").append(costoAtencion);
        sb.append(", descripcionMedica='").append(descripcionMedica).append('\'');
        sb.append(", tipoAtencion=").append(tipoAtencion);
        sb.append('}');
        return sb.toString();
    }
}
