/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Productos;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Servicio {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public Productos crearProducto(HashMap<String,Integer> productos){
        System.out.println("Ingrese el nombre del producto");
        String nombre = leer.next();
        System.out.println("Ingrese el Precio de "+nombre);
        Integer precio = leer.nextInt();
        productos.put(nombre, precio);
      return new Productos(nombre,precio);   
    }
    
    
    public void modificarPrecio(HashMap<String,Integer> productos){
        System.out.println("Ingrese el nombre del producto que desea cambiarle"
                + " el precio.");
        String nombre2 = leer.next();
        System.out.println("Ingrese el precio actualizado");
        Integer precio = leer.nextInt();
        productos.replace(nombre2, precio);
    }
    
    public void eliminar(HashMap<String,Integer> productos){
        System.out.println("Ingrese el nombre del producto que desea eliminar");
        String eliminado = leer.next();
        productos.remove(eliminado);
       
    }
    
    public void MostrarLista(HashMap<String,Integer> productos){
        
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Productos ["+"Nombre: "+key+" ,Precio: "+value+"]");
            
        }
        
    }
    
    public void menu(){
        HashMap<String,Integer> productos = new HashMap();
        String opcion;
        String opc;
        do {
            System.out.println("Ingrese una opcion");
            System.out.println("1-Ingresar productos");
            System.out.println("2-Modificar el precio de un producto");
            System.out.println("3-Eliminar un producto");
            System.out.println("4-Mostrar Lista de productos");
            System.out.println("5-SALIR");
            opcion = leer.next();
            
            switch (opcion){
                case "1":
                    do {
                        crearProducto(productos);
                        System.out.println("Desea ingresar otro producto?");
                        opc = leer.next();
                    } while (opc.equalsIgnoreCase("si"));

                    break;
                case "2":
                    modificarPrecio(productos);
                    break;
                case "3":
                eliminar(productos);
                    break;
                case "4":
                    MostrarLista(productos);
                    break;
                case "5":
                    System.out.println("GENIAL, ADIOS.");
                    break;
                default: 
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        } while (!opcion.equalsIgnoreCase("5"));
        
        
    }
    
    
    
}
