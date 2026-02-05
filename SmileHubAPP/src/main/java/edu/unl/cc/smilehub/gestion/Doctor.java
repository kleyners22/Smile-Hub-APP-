/*
@author kleyner.ls
 */
package edu.unl.cc.smilehub.gestion;

public class Doctor extends EntidadLegal{

    public Doctor (){
        super();
    }

    public Doctor (String razonSocial, String tipoIdentificacion, String dni,
                   String telefono, String correo){
        super(razonSocial, tipoIdentificacion, dni,
                telefono, correo);
    }
}
