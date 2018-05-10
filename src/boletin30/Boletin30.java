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
public class Boletin30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<SeleccionDeFutbol> listaF = new ArrayList();
        SeleccionDeFutbol Flista = new Futbolista(1, "AAA", "Paco", "Perez", 20, 111);
        SeleccionDeFutbol FEntrena = new Entrenador(222, "Quique", "Quicus", 55, 222);
        SeleccionDeFutbol Fmasaj = new Masajista("Fontanero", 9, "Fer", "Nandez", 12, 333);
        SeleccionDeFutbol FSelecc = new Seleccionador("Pepi", "Pipe", 98, 444);
        listaF.add(Flista);
        listaF.add(FEntrena);
        listaF.add(Fmasaj);
        listaF.add(FSelecc);
        for (int i = 0; i < listaF.size(); i++) {
            System.out.println(listaF.get(i).toString());
        }

    }

}
