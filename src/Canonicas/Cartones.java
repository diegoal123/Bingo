/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Canonicas;

import java.util.ArrayList;

public class Cartones {

    private int numeroCarton;
    private ArrayList<NumeroLetra> numeros;
    private char Letra;
    private String CodigoRegistro;
    private boolean Seleccion;

    public int getNumeroCarton() {
        return numeroCarton;
    }

    public void setNumeroCarton(int numeroCarton) {
        this.numeroCarton = numeroCarton;
    }

    public ArrayList<NumeroLetra> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<NumeroLetra> numeros) {
        this.numeros = numeros;
    }

    public char getLetra() {
        return Letra;
    }

    public void setLetra(char Letra) {
        this.Letra = Letra;
    }

    public String getCodigoRegistro() {
        return CodigoRegistro;
    }

    public void setCodigoRegistro(String CodigoRegistro) {
        this.CodigoRegistro = CodigoRegistro;
    }

    public boolean isSeleccion() {
        return Seleccion;
    }

    public void setSeleccion(boolean Seleccion) {
        this.Seleccion = Seleccion;
    }

    public Cartones() {
    }

    public Cartones(int numeroCarton, ArrayList<NumeroLetra> numeros, char Letra, String CodigoRegistro, boolean Seleccion) {
        this.numeroCarton = numeroCarton;
        this.numeros = numeros;
        this.Letra = Letra;
        this.CodigoRegistro = CodigoRegistro;
        this.Seleccion = Seleccion;
    }

}
