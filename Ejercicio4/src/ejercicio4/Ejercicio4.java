/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import Pelicula.Pelicula;
import Servicio.Servicio;
import java.util.ArrayList;



/**
 *
 * @author Facu
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Pelicula> Array = new ArrayList();
        Servicio S1 = new Servicio();
        S1.Fabrica(Array);
        S1.mostrador(Array);
      
}
    
}
