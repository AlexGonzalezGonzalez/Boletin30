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
public abstract class SeleccionDeFutbol implements IntegranteSeleccionDeFutbol {

    int id;
    String nombre;
    String apellidos;
    int edad;

    public SeleccionDeFutbol(String nombre, String apellidos, int edad,int id) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    public void amosar(SeleccionDeFutbol f){
        f.toString();
    }
}
