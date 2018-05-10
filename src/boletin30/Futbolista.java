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
public class Futbolista extends SeleccionDeFutbol {

    int dorsal;
    String demarcacion;

    public Futbolista(int dorsal,String demarcacion,String nombre, String apellidos, int edad, int id) {
        super(nombre, apellidos, edad, id);
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("Concentrarse o futbolista");

    }

    @Override
    public void viajar() {
        System.out.println("Viaxa o futbolista");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena o xogador");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Xoga o xogador");
    }

    public void entrevista() {
        System.out.println("Entrevisca co xogador");
    }
    @Override
    public String toString() {
        return "Futbolista:" + " Dorsal:" + dorsal + "Nombre: "+nombre+ "Apellido: "+apellidos+" Edad: "+edad+" ID: "+id+" Demarcacion: "+demarcacion;
    }
}
