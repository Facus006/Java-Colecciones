/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Pelicula.Pelicula;
import static Pelicula.Pelicula.compararDireAs;
import static Pelicula.Pelicula.compararDiredes;
import static Pelicula.Pelicula.compararDuracionAsc;
import static Pelicula.Pelicula.compararDuracionDes;
import static Pelicula.Pelicula.compararTitAs;
import static Pelicula.Pelicula.compararTitDes;
import java.util.ArrayList;



import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Servicio {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public Pelicula crearPeli(){
        System.out.println("Ingrese el Titulo de la pelicula");
        String tit = leer.next();
        System.out.println("Ingrese el nombre del Director");
        String dire = leer.next();
        System.out.println("Y la duracion.");
        double duracion = leer.nextDouble();
        
        return new Pelicula(tit, dire, duracion);
    }
    
    public void Fabrica(ArrayList<Pelicula> pelis) {
        System.out.println("Desea ingresar una Pelicula?");
        String opc = leer.next();

        do {
            pelis.add(crearPeli());
            System.out.println("Desea ingresar otra Pelicula?");
            opc = leer.next();
        } while (opc.equalsIgnoreCase("si"));

    }

    public void mostrarPeli(ArrayList<Pelicula> pelis) {
        System.out.println("PELICULAS");
        System.out.println(pelis);

    }

    public void mostrar1hs(ArrayList<Pelicula> pelis) {
        System.out.println("PELICULAS DE MAYOR A 1HS");
        for (Pelicula s : pelis) {
            if (s.getDuracion() > 1) {
                System.out.println(s + "");
            }
        }

    }

    public void mostrarMayor(ArrayList<Pelicula> pelis) {
        System.out.println("PELICULAS DE MAYOR A MENOR POR HS");
        pelis.sort(compararDuracionDes);
        System.out.println(pelis);

    }

    public void mostrarMenor(ArrayList<Pelicula> pelis) {
        System.out.println("PELICULAS DE MENOR A MAYOR POR HS");
        pelis.sort(compararDuracionAsc);
        System.out.println(pelis);

    }

    public void mostrarmenorTit(ArrayList<Pelicula> pelis) {
        System.out.println("Peliculas de Menor a Mayor por Titulo");
        pelis.sort(compararTitAs);
        System.out.println(pelis);
    }

    public void mostrarmayorTit(ArrayList<Pelicula> pelis) {
        System.out.println("Peliculas de Mayor a menor por Titulo");
        pelis.sort(compararTitDes);
        System.out.println(pelis);
    }

    public void mostrarmenorDire(ArrayList<Pelicula> pelis) {
        System.out.println("Peliculas de Menor a Mayor por Director");
        pelis.sort(compararDireAs);
        System.out.println(pelis);
    }

    public void mostrarmayorDire(ArrayList<Pelicula> pelis) {
        System.out.println("Peliculas de Mayor a Menor por Director");
        pelis.sort(compararDiredes);
        System.out.println(pelis);
    }

    public void mostrador(ArrayList<Pelicula> pelis){
        mostrarPeli(pelis);
        mostrar1hs(pelis);
        mostrarMayor(pelis);
        mostrarMenor(pelis);
        mostrarmayorDire(pelis);
        mostrarmenorDire(pelis);
        mostrarmayorTit(pelis);
        mostrarmenorTit(pelis);
        
    }

 } 
