/*
@author kleyner.ls
 */
package edu.unl.cc.smilehub.gestion;

public class Paciente extends EntidadLegal {

    public Paciente(){
        super();
    }

    public Paciente(String razonsocial, String tipoIdentificacion,
                    String dni, String telefono, String correo) {
        super(razonsocial, tipoIdentificacion, dni,
                telefono, correo);
    }
}
