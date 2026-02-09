package edu.unl.cc.smilehub.view;

import edu.unl.cc.smilehub.domain.AgendaCita;
import edu.unl.cc.smilehub.domain.Cita;
import edu.unl.cc.smilehub.domain.EstadoCita;
import edu.unl.cc.smilehub.domain.TipoAtencion;
import edu.unl.cc.smilehub.domain.admin.TipoIdentificacion;
import edu.unl.cc.smilehub.gestion.Paciente;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named("citaController")
@SessionScoped
public class CitaController implements Serializable {

    private Cita nuevaCita;
    private AgendaCita agendaCita = new AgendaCita();
    private TipoIdentificacion[] tiposIdentificacion = TipoIdentificacion.values();
    private TipoAtencion[] listaTipoAtenciones = TipoAtencion.values();
    private EstadoCita[] listaEstadoCita = EstadoCita.values();

    public void iniciarNuevaCita() {
        nuevaCita = new Cita();
        nuevaCita.setPaciente(new Paciente());
    }

    public void agendarCita() {
        agendaCita.agendarCita(nuevaCita);
        nuevaCita = new Cita();
    }

    public Cita getNuevaCita() {
        return nuevaCita;
    }

    public void setNuevaCita(Cita nuevaCita) {
        this.nuevaCita = nuevaCita;
    }

    public AgendaCita getAgendaCita() {
        return agendaCita;
    }

    public void setAgendaCita(AgendaCita agendaCita) {
        this.agendaCita = agendaCita;
    }

    public TipoIdentificacion[] getTiposIdentificacion() {
        return tiposIdentificacion;
    }

    public void setTiposIdentificacion(TipoIdentificacion[] tiposIdentificacion) {
        this.tiposIdentificacion = tiposIdentificacion;
    }

    public TipoAtencion[] getListaTipoAtenciones() {
        return listaTipoAtenciones;
    }

    public void setListaTipoAtenciones(TipoAtencion[] listaTipoAtenciones) {
        this.listaTipoAtenciones = listaTipoAtenciones;
    }

    public EstadoCita[] getListaEstadoCita() {
        return listaEstadoCita;
    }

    public void setListaEstadoCita(EstadoCita[] listaEstadoCita) {
        this.listaEstadoCita = listaEstadoCita;
    }
}
