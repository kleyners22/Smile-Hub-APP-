package edu.unl.cc.domain;

import edu.unl.cc.domain.common.TipoAtencion;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {
    private LocalDate fecha;
    private LocalTime hora;
    private TipoAtencion tipoAtencion;
    public Cita(){

    }

    public Cita(LocalDate fecha, LocalTime hora){
        this.fecha = fecha;
        this.hora = hora;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public TipoAtencion getTipoAtencion() {
        return tipoAtencion;
    }

    public void setTipoAtencion(TipoAtencion tipoAtencion) {
        this.tipoAtencion = tipoAtencion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cita{");
        sb.append("fecha=").append(fecha);
        sb.append(", hora=").append(hora);
        sb.append('}');
        return sb.toString();
    }
}
