/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class Carta {
    private int num;
    private String palo;

    @Override
    public String toString() {
        return "["+ num + " de " + palo + ']';
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public Carta(int num, String palo) {
        this.num = num;
        this.palo = palo;
    }

    public Carta() {
    }
    
    Scanner sc=new Scanner(System.in).useDelimiter("\n");
    public ArrayList<Carta> baraja = new ArrayList();
    public ArrayList<Carta> monton = new ArrayList();
    
//• barajar(): cambia de posición todas las cartas aleatoriamente.    
    public void barajar(){
        Collections.shuffle(this.baraja);
    }
    
//• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.
    public Carta siguienteCarta(){
        for (Iterator<Carta> it = this.baraja.iterator(); it.hasNext();) {  
            Carta next = it.next();
            if (baraja.size()==0) {
                System.out.println("No hay suficientes cartas en la baraja");
                return null;
            }else{
                it.remove();
                this.monton.add(next);
                return next;                
            }
        }        
        return new Carta();
    }
    
//• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public void cartasDisponibles(){
        System.out.println("Quedan " + this.baraja.size() + " cartas en la baraja.");
    }
    
//• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario.
    public ArrayList<Carta> darCartas(){
        System.out.println("¿Cuántas cartas levantarás?");
        int cant=sc.nextInt();
        ArrayList<Carta> alzada=new ArrayList();
        if (this.baraja.size()>=cant) {            
            Iterator<Carta> it=this.baraja.iterator();
            int cont=0;
            while (it.hasNext() && cont<cant) {
                cont++;
                Carta next = it.next();
                              
                alzada.add(next);
                this.monton.add(next);
               
                it.remove();  
            }
            return alzada;
        }
        System.out.println("No hay suficientes cartas mami");
        return alzada;
    }
//cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario
    public void cartasMonton(){
        if (monton.size()>0) {
            System.out.println("Las cartas que han salido son: ");
            for (Carta cartaM : this.monton) {
                System.out.println("-" + cartaM);
            }
        }else{
            System.out.println("No hay ninguna carta en el montóncito.");
        }
    }
//• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.
    public void mostrarBaraja(){
        System.out.println("Las cartas que aun estan en el Mazo son:");
        for (Carta cartaB : this.baraja) {
            System.out.println("+"+cartaB);
        }
    }
}
