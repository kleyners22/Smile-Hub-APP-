package edu.unl.cc.domain.admin;

import edu.unl.cc.domain.common.TipoGenero;
import edu.unl.cc.domain.common.TipoIdentificacion;

public abstract class EntidadLegal {

    private TipoIdentificacion tipoIdentificacion;
    private TipoGenero tipoGenero;
    private String numeroIdentificacion;
    private String telefono;
    private String correo;
    private String nombres;
    private String apellidos;
    public EntidadLegal() {
    }

    public EntidadLegal(TipoIdentificacion tipoIdentificacion, TipoGenero tipoGenero, String numeroIdentificacion,
                        String telefono, String correo, String nombres, String apellidos){
        this.tipoIdentificacion = tipoIdentificacion;
        this.tipoGenero = tipoGenero;
        this.numeroIdentificacion = numeroIdentificacion;
        this.telefono = telefono;
        this.correo = correo;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public TipoGenero getTipoGenero() {
        return tipoGenero;
    }

    public void setTipoGenero(TipoGenero tipoGenero) {
        this.tipoGenero = tipoGenero;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    protected void validarDatosPersonales(){
        if (getNombres() == null || getNombres().isEmpty()) {
            throw new IllegalArgumentException("EL nombre no puede estar vacio");
        }
        if (getApellidos()== null || getApellidos().isEmpty()) {
            throw new IllegalArgumentException("EL apellido no puede estar vacio");
        }
        if (getTipoGenero() == null){
            throw new IllegalArgumentException("Tipo de genero no puede puede estar vacio");
        }
    }

    protected void validarIdentificacion(){
        if (getTipoIdentificacion()== null){
            throw new IllegalArgumentException("Seleccionar un tipo de Identificacion");
        }
        //Validar Tipo de Identificacion
        if (getNumeroIdentificacion() == null || getNumeroIdentificacion().isEmpty()) {
            throw new IllegalArgumentException("Numero de identificacion no puede estar vacio");
        }
        switch (getTipoIdentificacion()) {
            case CEDULA:
                if (getNumeroIdentificacion().length() != 10) {
                    throw new IllegalArgumentException("La Cedula debe tener 10 digitos");
                }
                break;
            case PASAPORTE:
                if (getNumeroIdentificacion().length() != 9){
                    throw new IllegalArgumentException("El pasaporte debe tener 9 digitos");
                }
                break;
            case RUC:
                if (getNumeroIdentificacion().length() !=13){
                    throw new IllegalArgumentException("El numero de identificacion debe tener 13 digitos");
                }
                break;
        }
    }

    protected void validarTelefono(){
        if (getTelefono()== null || getTelefono().isEmpty() ) {
            throw new IllegalArgumentException("Espacio no puede estar vacio");
        }
        if (getTelefono().length() !=10) {
            throw new IllegalArgumentException("El telefono debe tener 10 digitos");
        }
    }

    protected void validarCorreo(){
        if (getCorreo()==null || getCorreo().isEmpty()) {
            throw new IllegalArgumentException("Espacio no puede estar vacio");
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("EntidadLegal{");
        sb.append(", tipoIdentificacion=").append(tipoIdentificacion);
        sb.append(", tipoGenero=").append(tipoGenero);
        sb.append(", numeroIdentificacion='").append(numeroIdentificacion).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", correo='").append(correo).append('\'');
        sb.append(", nombres='").append(nombres).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
