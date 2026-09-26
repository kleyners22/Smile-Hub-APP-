package edu.unl.cc.domain;

public class AtencionMedica {

    private String tipoAtencion;
    private double costo;

    public AtencionMedica() {

    }

    public AtencionMedica(String tipoAtencion, double costo,
                          String attentionDescription){
        this.tipoAtencion = tipoAtencion;
        this.costo = costo;
    }

    public String getTipoAtencion() {
        return tipoAtencion;
    }

    public void setTipoAtencion(String tipoAtencion) {
        this.tipoAtencion = tipoAtencion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AtencionMedica{");
        sb.append("tipoAtencion='").append(tipoAtencion).append('\'');
        sb.append(", costo=").append(costo);
        sb.append('}');
        return sb.toString();
    }
}
