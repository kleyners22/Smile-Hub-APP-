/*
@author Kleyner.ls
 */
package edu.unl.cc.smilehub.domain;

import edu.unl.cc.smilehub.gestion.Doctor;
import edu.unl.cc.smilehub.gestion.Paciente;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Cita {

    private LocalDate fecha;
    private LocalTime hora;
    private Integer turno;
    private EstadoCita estadoCita;
    private Paciente paciente;
    private Doctor doctor;
    private List<AtencionMedica> atenciones;

    public Cita() {

    }

    public Cita ( LocalDate fecha, LocalTime hora, Integer turno,
                  EstadoCita estadoCita, Paciente paciente, Doctor doctor,
                  List<AtencionMedica> atenciones) {
        this.fecha = fecha;
        this.hora = hora;
        this.turno = turno;
        this.estadoCita = estadoCita;
        this.paciente = paciente;
        this.doctor = doctor;
        this.atenciones = atenciones;
    }

    public double calcularCostoTotal() {
        double total = 0;
        if (atenciones != null) {
            for (AtencionMedica a : atenciones) {
                total += a.getCostoAtencion(); // suma cada atención
            }
        }
        return total;
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

    public Integer getTurno() {
        return turno;
    }

    public void setTurno(Integer turno) {
        this.turno = turno;
    }

    public EstadoCita getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(EstadoCita estadoCita) {
        this.estadoCita = estadoCita;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public List<AtencionMedica> getAtenciones() {
        return atenciones;
    }

    public void setAtenciones(List<AtencionMedica> atenciones) {
        this.atenciones = atenciones;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cita{");
        sb.append("fecha=").append(fecha);
        sb.append(", hora=").append(hora);
        sb.append(", turno=").append(turno);
        sb.append(", estadoCita=").append(estadoCita);
        sb.append(", paciente=").append(paciente);
        sb.append(", doctor=").append(doctor);
        sb.append(", atenciones=").append(atenciones);
        sb.append('}');
        return sb.toString();
    }
}
