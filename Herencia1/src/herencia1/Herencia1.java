/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia1;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author Facu
 */
public class Herencia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal Perro1 = new Perro("Lola", "Carne", "Beagle", 5);
        Perro1.alimentarse();
        Animal Perro2 = new Perro("Roco", "Alimento balanceado", "Caniche", 3);
        Perro2.alimentarse();
        
        Animal Gato = new Gato("Mishi", "ratas", "ay nose", 3);
        Gato.alimentarse();
        
        Animal Caballo = new Caballo("Pepe", "PASTO", "ay nose x2", 10);
        Caballo.alimentarse();
        
    }
    
}
