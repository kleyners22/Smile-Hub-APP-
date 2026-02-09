package edu.unl.cc.smilehub.domain.admin;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String identificacion;

    @Enumerated(EnumType.STRING)
    private TipoIdentificacion tipoIdentificacion;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private TipoRol rol;


    protected Usuario() {

    }

    public Usuario(String identificacion,
                   TipoIdentificacion tipoIdentificacion,
                   String password,
                   TipoRol rol) {
        this.identificacion = identificacion;
        this.tipoIdentificacion = tipoIdentificacion;
        this.password = password;
        this.rol = rol;
    }

    public Long getId() {
        return id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public String getPassword() {
        return password;
    }

    public TipoRol getRol() {
        return rol;
    }
}
