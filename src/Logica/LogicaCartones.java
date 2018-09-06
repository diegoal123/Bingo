package Logica;

import Canonicas.Cartones;
import java.util.ArrayList;
import java.util.Random;

public class LogicaCartones {

    //Metodo que genera los 72 cartones sin repetir
    public static ArrayList<Cartones> generarCartones() {
        ArrayList<Cartones> lista = new ArrayList<>();
        int i = 0;
        while (i < 72) {
            Cartones carton = new Cartones();
            ArrayList<Integer> numeros = new ArrayList<>();
            numeros = obtenerNumerosCarton();
            if (!lista.contains(numeros)) {
                carton.setNumeroCarton(i + 1);
                carton.setNumeros(numeros);
                lista.add(carton);
                i++;
            }
        }
        return lista;
    }
    //Metodo que genera los 24 numeros de un solo cartón sin repetir

    public static ArrayList<Integer> obtenerNumerosCarton() {
        ArrayList<Integer> carton = new ArrayList<>();
        int i = 0;
        Random rand = new Random();
        while (i < 24) {
            int num = rand.nextInt(90) + 1;
            if (!carton.contains(num)) {
                carton.add(num);
                i++;
            }
        }
        return carton;
    }
}
