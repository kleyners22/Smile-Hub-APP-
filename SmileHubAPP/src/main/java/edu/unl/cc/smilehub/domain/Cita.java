/*
@author Kleyner.ls
 */
package edu.unl.cc.smilehub.domain;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {

    private LocalDate fecha;
    private LocalTime hora;
    private EstadoCita estadoCita;

    public Cita() {
        this.estadoCita = EstadoCita.PENDIENTE;
    }

    public Cita(LocalDate fecha, LocalTime hora) {
        this.setFecha(fecha);
        this.setHora(hora);
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

    public EstadoCita getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(EstadoCita estadoCita) {
        this.estadoCita = estadoCita;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "fecha=" + fecha +
                ", hora=" + hora +
                ", estadoCita=" + estadoCita +
                '}';
    }
}
