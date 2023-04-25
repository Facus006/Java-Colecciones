/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesejer1;

import Perro.Perro;
import Persona.Persona;

/**
 *
 * @author Facu
 */
public class RelacionesEjer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro1 = new Perro("Firulays", "Caniche", "Chiquito", 3);
        Perro perro2 = new Perro("Bruno", "Pastor", "Mediano", 2);
        Persona persona1 = new Persona("Facundo", "Calabrese", "22", "43055462", perro1);
        Persona persona2 = new Persona("Johanna", "Aranda", "35", "29742433", perro2);
        System.out.println(persona1);
        System.out.println(persona2);
 

        
        // TODO code application logic here
    }
    
    
    
    
}
