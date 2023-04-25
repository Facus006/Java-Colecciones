/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Lavadora extends Electrodomesticos {
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, int precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearlavadora() {
        super.CrearElectrodomestico();
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la carga");
        this.carga=leer.nextInt();
    }
    
    @Override
    public void Preciofinal(){
        super.Preciofinal();
         if (this.carga > 30){
            this.precio += 500;
        }
    }

    @Override
    public String toString() {
       // return "Lavadora{" + "Carga=" + carga + '}';
    return "Electrodomestico Lavadora{" + "Precio=" + precio + ", Color=" + color + ", Consumo=" + consumo + ", Peso=" + peso + ", Carga=" + carga +'}';
    }
    
    

}
