/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesejer2;

import Jugador.Jugador;
import Revolver.Revolver;
import Servicio.Servicio;
import java.util.ArrayList;



/**
 *
 * @author Facu
 */
public class RelacionesEjer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Jugador> Jugadores = new ArrayList();
        Servicio S1 = new Servicio();
        Revolver r1 = new Revolver();
        S1.ronda(Jugadores, r1);
       
    }
    
}
