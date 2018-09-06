/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Canonicas.Cartones;
import static Logica.LogicaCartones.generarCartones;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Cartones> cartones = new ArrayList<>();
        cartones = generarCartones();
        for (int i = 0; i < cartones.size(); i++) {
            System.out.println("Carton " + cartones.get(i).getNumeroCarton());
            System.out.println("Numeros Carton ");
            for (int j = 0; j < cartones.get(i).getNumeros().size(); j++) {
                System.out.print(cartones.get(i).getNumeros().get(j) + " ");
            }
            System.out.println("\n");
        }
    }

}
