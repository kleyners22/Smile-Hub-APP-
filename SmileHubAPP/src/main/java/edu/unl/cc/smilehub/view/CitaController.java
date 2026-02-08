package edu.unl.cc.smilehub.view;

import edu.unl.cc.smilehub.domain.AtencionMedica;
import edu.unl.cc.smilehub.domain.Cita;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("citaController")
@SessionScoped
public class CitaController implements Serializable {

    private Cita cita = new Cita();
    private List<AtencionMedica> atenciones = new ArrayList<>();

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public List<AtencionMedica> getAtenciones() {
        return atenciones;
    }

    public void agregarAtencion(AtencionMedica a) {
        atenciones.add(a);
        cita.setAtenciones(atenciones);
    }

    public void guardarCita() {
        System.out.println("Cita guardada: " + cita);
    }

    public double getCostoTotal() {
        return cita.calcularCostoTotal();
    }
}
