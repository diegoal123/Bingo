/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Canonicas;

import java.util.ArrayList;

public class Cartones {

    private int numeroCarton;
    private ArrayList<Integer> numeros;

    public Cartones(int numeroCarton, ArrayList<Integer> numeros) {
        super();
        this.numeroCarton = numeroCarton;
        this.numeros = numeros;
    }

    public Cartones() {
        super();
    }

    public int getNumeroCarton() {
        return numeroCarton;
    }

    public void setNumeroCarton(int numeroCarton) {
        this.numeroCarton = numeroCarton;
    }

    public ArrayList<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }
}
