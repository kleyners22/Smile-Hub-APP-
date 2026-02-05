/*
@author Kleyner.ls
 */
package edu.unl.cc.smilehub.domain;

import java.util.ArrayList;
import java.util.List;

public class AgendaCita {

    private List<Cita> agenda;

    public AgendaCita() {
        this.agenda = new ArrayList<>();
    }

    public AgendaCita(List<Cita> agenda) {
        this.agenda = agenda;
    }

    public void agendarCita(Cita cita) {
        if (cita == null) {
            throw new IllegalArgumentException("La cita no puede ser nula");
        }
        this.agenda.add(cita);
    }
    public List<Cita> getAgenda() {
        return agenda;
    }

    public void setAgenda(List<Cita> agenda) {
        this.agenda = agenda;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AgendaCita{");
        sb.append("agenda=").append(agenda);
        sb.append('}');
        return sb.toString();
    }
}