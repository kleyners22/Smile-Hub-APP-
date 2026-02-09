package edu.unl.cc.smilehub.gestion;

import edu.unl.cc.smilehub.domain.admin.Usuario;
import jakarta.persistence.*;

@Entity
@Table(name = "doctores")
public class Doctor extends EntidadLegal {

    @Id
    private Long id;

    @OneToOne(optional = false)
    @MapsId
    @JoinColumn(name = "id")
    private Usuario usuario;

    public Doctor() {
        super();
    }

    public Doctor(Usuario usuario,
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
