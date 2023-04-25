/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import Entidades.Electrodomesticos;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Facu
 */
public class Herencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Electrodomesticos> electrodomesticos = new ArrayList();
        electrodomesticos.add(new Televisor(35, true, 1000, "blanco", 'A', 45));
        electrodomesticos.add(new Televisor(45, false, 1000, "negro", 'b', 40));
        electrodomesticos.add(new Lavadora(35, 1000, "Amarillo", 'c', 85));
        electrodomesticos.add(new Lavadora(35, 1000, "blanco", 'd', 75));
        
        for (Electrodomesticos x : electrodomesticos) {
            x.Preciofinal();
            System.out.println(x);
           
        }
        int preciofinal=0;
        for (Electrodomesticos x2 : electrodomesticos) {
            preciofinal += x2.getPrecio();
        }
        System.out.println("El precio total de todos los electrodomesticos es de "+preciofinal+".");
        
    }
    
}
