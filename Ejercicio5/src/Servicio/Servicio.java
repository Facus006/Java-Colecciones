/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pais;
import static Entidad.Pais.compararletra;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


/**
 *
 * @author Facu
 */
public class Servicio {
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
    public Pais crearPais(){
        System.out.println("Ingrese el nombre del pais");
        String nombre = leer.next();
        return new Pais(nombre);
    }

    public void fabrica(HashSet<Pais> paises){
        System.out.println("Desea ingresar un pais?");
        String opc = leer.next();
        while (opc.equalsIgnoreCase("si")){
           paises.add(crearPais());
            System.out.println("Desea crear otro pais?");
            opc= leer.next();
        }
       
        
    }
    
    public void ordenar(HashSet<Pais> paises){
        ArrayList <Pais> array = new ArrayList(paises);
        System.out.println("Paises ordenados alfabéticamente: ");
        array.sort(compararletra);
        System.out.println(array);
    }
   
    public void Buscar(HashSet<Pais> paises){
        Pais encontrado = null;
        System.out.println("Ingrese el pais que desea eliminar");
        String paisElimi = leer.next();
        for (Pais p : paises){
            if (p.getPais().equalsIgnoreCase(paisElimi)) {
                encontrado = p;
            } 
        }
        if (encontrado== null) {
            System.out.println("Error "+paisElimi+" no se encuentra");
        }else {
            System.out.println("Genial, se eliminara de la lista a "+paisElimi);
            paises.remove(encontrado);
        }
        
        
    }
}
