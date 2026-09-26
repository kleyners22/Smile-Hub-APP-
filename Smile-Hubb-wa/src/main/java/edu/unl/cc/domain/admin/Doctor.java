package edu.unl.cc.domain.admin;

import edu.unl.cc.domain.common.TipoGenero;
import edu.unl.cc.domain.common.TipoIdentificacion;

public class Doctor extends EntidadLegal {

    private String especialidad;
    
    public Doctor() {
        super();
    }

    public Doctor(TipoIdentificacion tipoIdentificion,
                  TipoGenero tipoGenero,
                  String numeroIdentificacion,
                  String telefono,
                  String correo,
                  String nombres,
                  String apellidos) {
        super(tipoIdentificion,
                tipoGenero,
                numeroIdentificacion,
                telefono,
                correo,
                nombres,
                apellidos);
    }


    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void agregarDoctor() {
        validarDatosPersonales();
        validarIdentificacion();
        validarEspecialidad();
        validarTelefono();
        validarCorreo();
    }

    private void validarEspecialidad(){
        if (getEspecialidad()==null || getEspecialidad().isEmpty()) {
            throw new IllegalArgumentException("La especialidad no puede estar vacia");
        }
    }
}

