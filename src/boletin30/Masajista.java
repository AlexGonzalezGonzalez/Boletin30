/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin30;

/**
 *
 * @author estudios
 */
public class Masajista extends SeleccionDeFutbol {

    String titulacion;
    int anosExperiencia;

    public Masajista(String titulacion,int anosExperiencia, String nombre, String apellidos, int edad, int id) {
        super(nombre, apellidos, edad, id);
        this.titulacion=titulacion;
        this.anosExperiencia=anosExperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.println("Concentrarse o masajista");

    }

    @Override
    public void viajar() {
        System.out.println("Viaja o masajista");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena o masaxista");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Xoga o masaxista");
    }

    public void darMasaje() {
        System.out.println("Dar masaje");
    }
    @Override
    public String toString() {
        return "Masajista:" + " Titulacion: " + titulacion + "Nombre: "+nombre+ "Apellido: "+apellidos+" Edad: "+edad+" ID: "+id+" AnosExp: "+anosExperiencia;
    }
}
