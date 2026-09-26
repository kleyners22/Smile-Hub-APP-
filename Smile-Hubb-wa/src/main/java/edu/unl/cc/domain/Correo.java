package edu.unl.cc.domain;

public class Correo {
    private String contrasenia;
    private String asunto;
    private String contenido;
    private int turno;

    public Correo(){

    }

    public Correo(String contrasenia, String asunto,
                  String contenido, int turno){
        this.contrasenia = contrasenia;
        this.asunto = asunto;
        this.contenido = contenido;
        this.turno = turno;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Correo{");
        sb.append("contrasenia='").append(contrasenia).append('\'');
        sb.append(", asunto='").append(asunto).append('\'');
        sb.append(", contenido='").append(contenido).append('\'');
        sb.append(", turno=").append(turno);
        sb.append('}');
        return sb.toString();
    }
}
