/*
@author kleyner.ls
 */
package edu.unl.cc.smilehub.gestion;

public class Paciente extends EntidadLegal {

    public Paciente(){
        super();
    }

    public Paciente(String razonSocial, String nombres,String apellidos,
                    String tipoIdentificacion, String numeroIdentificacion, String telefono,
                    String correo){
        super(razonSocial, nombres, apellidos,
                tipoIdentificacion, numeroIdentificacion,
                telefono, correo);
    }
}
