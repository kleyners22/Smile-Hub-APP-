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
        this.estadoCita = EstadoCita.PENDIENTE;
    }

    public void cancelarCita() {
        this.estadoCita = EstadoCita.CANCELADA;
    }

    public void marcarAtendida() {
        this.estadoCita = EstadoCita.ATENDIDA;
    }

    public void marcarInasistencia() {
        this.estadoCita = EstadoCita.INASISTENCIA;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        if (fecha == null) {
            throw new IllegalArgumentException("La fecha de la cita no puede ser nula");
        }
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        if (hora == null) {
            throw new IllegalArgumentException("La hora de la cita no puede ser nula");
        }
        this.hora = hora;
    }

    public EstadoCita getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(EstadoCita estadoCita) {
        if (estadoCita == null) {
            throw new IllegalArgumentException("El estado de la cita no puede ser nulo");
        }
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
