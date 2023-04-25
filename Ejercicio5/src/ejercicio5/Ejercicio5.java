/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import Entidad.Pais;
import Servicio.Servicio;

import java.util.HashSet;



/**
 *
 * @author Facu
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Servicio P1 = new Servicio();
        HashSet <Pais> paises = new HashSet();
        P1.fabrica(paises);
        System.out.println(paises);
        P1.ordenar(paises);
        P1.Buscar(paises);
        P1.ordenar(paises);
         
    }
    
    
    
}
