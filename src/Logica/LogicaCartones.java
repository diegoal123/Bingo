package Logica;

import Canonicas.Cartones;
import Canonicas.NumeroLetra;
import java.util.ArrayList;
import java.util.Random;

public class LogicaCartones {

    //Metodo que genera los 72 cartones sin repetir
    public static ArrayList<Cartones> generarCartones() {
        ArrayList<Cartones> lista = new ArrayList<>();
        int i = 0;
        while (i < 72) {
            Cartones carton = new Cartones();
            ArrayList<NumeroLetra> numeros = new ArrayList<>();
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
    
    //Metodo que genera los 24 numeros de un solo cartón sin repeti
    public static ArrayList<NumeroLetra> obtenerNumerosCarton() {
        ArrayList<NumeroLetra> carton = new ArrayList<>();
        ArrayList<Integer> n = new ArrayList<>();
        //Llenar B
        LlenarLetraCarton(n, carton, 1, 18, 'B');
        //Llenar I
        LlenarLetraCarton(n, carton, 18, 36, 'I');
        //Llenar N
        LlenarLetraCarton(n, carton, 36, 54, 'N');
        //Llenar G
        LlenarLetraCarton(n, carton, 54, 72, 'G');
        //Llenar O
        LlenarLetraCarton(n, carton, 72, 91, 'O');
        EliminarNumeroMitad(carton);
        return carton;
    }
    
    //Método para generar los números aleatorios de acuerdo a la letra
    public static int RandomNumeros(int inf, int sup){
        Random rand = new Random();
        int num = rand.nextInt(sup - inf) + inf;
        return num;
    }
    
    //Método que llena los números que corresponden a una letra
    public static void LlenarLetraCarton(ArrayList<Integer> n, ArrayList<NumeroLetra> carton, int inf, int sup, char letra){
        int i = 0, num;
        while (i < 5) {
            num = RandomNumeros(inf, sup);
            NumeroLetra aux = new NumeroLetra(num, letra);
            if (!n.contains(num)) {
                n.add(num);
                carton.add(aux);
                i++;
            }
        }
    }
    
    public static void EliminarNumeroMitad(ArrayList<NumeroLetra> carton){
        carton.get(12).setNumero(0);
    }
    
    public static void PintarCartones(){
        ArrayList<Cartones> cartones = new ArrayList<>();
        cartones = generarCartones();
        for (int i = 0; i < cartones.size(); i++) {
            System.out.println("B\t" + "I\t" + "N\t" + "G\t" + "O");
            for (int j = 0; j < cartones.get(i).getNumeros().size(); j++) {
                System.out.print(cartones.get(i).getNumeros().get(j).getNumero() + "\t");
                if((j+1) % 5 == 0){
                    System.out.println("");
                }
            }
            System.out.println("\n");
        }
    }
}
