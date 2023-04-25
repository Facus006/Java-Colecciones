/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos.de.prueba.Servicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Servicio {

    public Servicio() {
    }
    
    
    public void Ejer1(){
          Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> razas = new ArrayList();
        String opc = "f";

        do {
            System.out.println("Ingrese una Raza de perro");
            razas.add(leer.nextLine());
            System.out.println("Desea continuar agregando razas de perro?" + " S/N");
            opc = leer.nextLine();

            while ((!opc.toLowerCase().equals("n") && !opc.toLowerCase().equals("s"))) {
                if (!opc.toLowerCase().equals("n") && !opc.toLowerCase().equals("s")) {
                    System.out.println("Ingrese una opcion valida");
                }
                opc = leer.nextLine();
            }

        } while (!opc.toLowerCase().equals("n"));
        
        System.out.println("Fueron ingresadas "+razas.size()+" razas de perro.");
        
        for (String perros : razas){
            System.out.print("["+perros+"]");
        }
        System.out.println(" ");
        //ejer2
        
        Iterator it = razas.iterator();
        String str = "";
        System.out.println("Ingrese el perro que desea eliminar");
        String perro = leer.nextLine();
        
        while (it.hasNext()){
           
            if (it.next().equals(perro)) {
                it.remove();
                System.out.println("Eliminado");
                break;
            }
            if (!it.next().equals(perro)) {
                System.out.println("El perro no se encuentra");
                break;
            }
        }
   
        System.out.println("Ahora la lista de perros es ");
        for (String s: razas){
            System.out.println("["+s+"]");
        }
    }
    
   
    
    
    
}
