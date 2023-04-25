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
package relaciones.ejercicio03;

import Entidades.Carta;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class RELACIONESEjercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Carta c = new Carta();
        String palo = null;
        for (int j = 0; j < 4; j++) {
            switch (j) {
                case 0:
                    palo = "Oro";
                    break;
                case 1:
                    palo = "Espada";
                    break;
                case 2:
                    palo = "Basto";
                    break;
                case 3:
                    palo = "Copa";
                    break;
            }
            for (int i = 1; i < 13; i++) {
                if (i != 8 && i != 9) {
                    Carta cA = new Carta(i, palo);
                    c.baraja.add(cA);
                }
            }
        }
        System.out.println(c.baraja.size());
        c.barajar();
        do {
            System.out.println("**********************");
            System.out.println("MENÚ");
            System.out.println("Elije una opción:");
            System.out.println("");
            System.out.println("1 - Mezclar Cartas");
            System.out.println("2 - Pedir Cartas");
            System.out.println("3 - Pedir 1(una) Carta");
            System.out.println("");
            System.out.println("A - Mostrar cantidad de cartas en el Mazo");
            System.out.println("B - Mostrar las cartas del Pozo");
            System.out.println("C - Mostrar las cartas del Mazo");
            System.out.println("");
            System.out.println("**********************");
            
            switch (sc.next()) {
                case "1":
                    c.barajar();
                    break;
                case "2":
                    ArrayList<Carta> alzada = c.darCartas();
                    for (Carta carta : alzada) {
                        System.out.println(carta);                        
                    }
                    break;
                case "3":
                    System.out.println(c.siguienteCarta());
                    break;
                case "a":
                    c.cartasDisponibles();
                    break;
                case "b":
                    c.cartasMonton();
                    break;
                case "c":
                    c.mostrarBaraja();
                    break;
                default:
                    System.out.println("Eleccion no válida, esssstÚpide.");
                    break;
            }
            System.out.println("");
        } while (c.baraja.size() > 0);

    }

}
