/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Canonicas;

import java.util.ArrayList;
import java.util.Objects;

public class Cartones {

    private int numeroCarton;
    private ArrayList<NumeroLetra> numeros;
    private char Letra;
    private String CodigoRegistro;
    private boolean Seleccion;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.CodigoRegistro);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cartones other = (Cartones) obj;
        if (this.numeroCarton != other.numeroCarton) {
            return false;
        }
        if (this.Letra != other.Letra) {
            return false;
        }
        if (this.Seleccion != other.Seleccion) {
            return false;
        }
        if (!Objects.equals(this.CodigoRegistro, other.CodigoRegistro)) {
            return false;
        }
        if (!Objects.equals(this.numeros, other.numeros)) {
            return false;
        }
        return true;
    }

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
