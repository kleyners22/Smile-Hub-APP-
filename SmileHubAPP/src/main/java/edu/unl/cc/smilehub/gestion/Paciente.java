package edu.unl.cc.smilehub.gestion;

import edu.unl.cc.smilehub.domain.admin.Usuario;
import jakarta.persistence.*;

@Entity
@Table(name = "pacientes")
public class Paciente extends EntidadLegal {

    @Id
    private Long id;

    // Relación 1 a 1 con Usuario para login
    @OneToOne(optional = false)
    @MapsId
    @JoinColumn(name = "id")
    private Usuario usuario;

    public Paciente() {
        super();
    }

    public Paciente(Usuario usuario,
                    String razonSocial,
                    String nombres,
                    String apellidos,
                    String tipoIdentificacion,
                    String numeroIdentificacion,
                    String telefono,
                    String correo) {

        super(razonSocial, nombres, apellidos,
                tipoIdentificacion, numeroIdentificacion,
                telefono, correo);
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
