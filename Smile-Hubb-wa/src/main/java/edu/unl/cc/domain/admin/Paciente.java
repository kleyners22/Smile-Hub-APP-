package edu.unl.cc.domain.admin;

import edu.unl.cc.domain.common.TipoGenero;
import edu.unl.cc.domain.common.TipoIdentificacion;

public class Paciente extends EntidadLegal {

    private String razonSocial;

    public Paciente() {
        super();
    }

    public Paciente(String razonSocial,
                    TipoGenero tipoGenero,
                    TipoIdentificacion tipoIdentificion,
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
        this.razonSocial = razonSocial;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void agregarPaciente() {
        validarDatosPersonales();
        validarRazonSocial();
        validarIdentificacion();
        validarTelefono();
        validarCorreo();
    }

    private void validarRazonSocial(){
        if (getRazonSocial() == null || getRazonSocial().isEmpty()){
            throw new IllegalArgumentException("La razon social no puede estar vacia");
        }
    }
}
