/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Jugador.Jugador;
import Revolver.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Jugador> Jugadores = new ArrayList();

    public void ingresarJugadores(ArrayList<Jugador> Jugadores) {
        System.out.println("Cuantos Jugadores desea ingresar? ");
        int Jugado = leer.nextInt();
        if (Jugado <= 0 || Jugado > 6) {
            System.out.println("Valor ingresado es erroneo, se establecio a 6.");
            Jugado = 6;
        }
        int cont = 1;

        do {
            System.out.println("Ingrese el Nombre del jugador " + "0" + cont);
            String nombre = leer.next();
            Jugadores.add(new Jugador(cont, nombre));
            cont++;
        } while (cont != Jugado + 1);

    }

    public boolean Disparo(Revolver R) {
        boolean retorno = R.Mojar();
        return retorno;
    }

    public void ronda(ArrayList<Jugador> Jugadores, Revolver R) {
        ingresarJugadores(Jugadores);
        R.Llenar();
        int cont=0;
        
        do {
        for (int i = 0; i < Jugadores.size(); i++) {
            boolean diparo = Disparo(R);
            R.SiguienteBala();
            Jugador temporal = Jugadores.get(i);
            System.out.println("El Jugador " + Jugadores.get(i).getNombre() + " [Mojado]= " + diparo);

            if (diparo == true) {
                cont++;
            }

        }
        
        } while (cont==0);
    
    }

    
    
    
    
    
    
    
}

