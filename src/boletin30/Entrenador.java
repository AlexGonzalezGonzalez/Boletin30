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
public class Entrenador extends SeleccionDeFutbol  {
int idFederacion;

    public Entrenador(int idFederacion,String nombre, String apellidos, int edad, int id) {
        super(nombre, apellidos, edad, id);
        this.idFederacion=idFederacion;
    }
    @Override
    public void concentrarse() {
        System.out.println("Concentrarse o entrenador");
    }

    @Override
    public void viajar() {
        System.out.println("Viaxa o entrenador");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena o entrenador");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Xoga o entrenador");
    }
    public void planificarEntrenamiento(){
        System.out.println("Planifica o entrenamiento");
    }

    @Override
    public String toString() {
        return "Entrenador:" + " idFederacion=" + idFederacion + "Nombre: "+nombre+ "Apellido: "+apellidos+" Edad: "+edad+" ID: "+id;
    }
    
}
