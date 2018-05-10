/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin30;

import java.util.ArrayList;

/**
 *
 * @author estudios
 */
public class Seleccionador extends SeleccionDeFutbol {

    

    public Seleccionador(String nome, String apellidos, int edad, int id) {
        super(nome, apellidos, edad, id);
    }

    @Override
    public void concentrarse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void viajar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void entrenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void jugarPartido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void seleccionarXogador(SeleccionDeFutbol f) {

    }
    @Override
    public String toString() {
        return "Seleccionador: "  + "Nombre: "+nombre+ "Apellido: "+apellidos+" Edad: "+edad+" ID: "+id;
    }
}
