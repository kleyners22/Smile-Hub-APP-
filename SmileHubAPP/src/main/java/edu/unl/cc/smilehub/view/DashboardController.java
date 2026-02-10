package edu.unl.cc.smilehub.view;

import edu.unl.cc.smilehub.business.security.AgendaCitaRepository;
import edu.unl.cc.smilehub.domain.Cita;
import edu.unl.cc.smilehub.domain.admin.Usuario;
import edu.unl.cc.smilehub.domain.admin.TipoRol;
import jakarta.annotation.PostConstruct;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class DashboardController implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private AgendaCitaRepository repository;

    private Usuario usuarioActual;
    private List<Cita> citasFiltradas;

    private long citasHoy;
    private long pendientes;

    @PostConstruct
    public void init() {
        // Obtenemos al usuario que AuthenticationController puso en sesión
        usuarioActual = (Usuario) FacesContext.getCurrentInstance()
                .getExternalContext().getSessionMap().get("usuario");

        if (usuarioActual != null) {
            cargarDatosSegunRol();
        }
    }

    private void cargarDatosSegunRol() {
        try {
            if (usuarioActual.getRol() == TipoRol.SECRETARIA) {
                // Métodos de tu repositorio para la Secretaria
                this.citasHoy = repository.countCitasHoy();
                this.pendientes = repository.countPendientes();
                this.citasFiltradas = repository.findAll();

            } else if (usuarioActual.getRol() == TipoRol.PACIENTE) {
                // Método de tu repositorio filtrado por la identificación del usuario en sesión
                this.citasFiltradas = repository.findByPaciente(usuarioActual.getIdentificacion());

                // Para el paciente, sus pendientes son el conteo de su propia lista
                this.pendientes = citasFiltradas.size();
                this.citasHoy = 0;
            }
        } catch (Exception e) {
            System.err.println("Error en Dashboard: " + e.getMessage());
        }
    }

    // --- Getters para el XHTML ---
    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public List<Cita> getCitasFiltradas() { return citasFiltradas; }
    public long getCitasHoy() { return citasHoy; }
    public long getPendientes() { return pendientes; }
}