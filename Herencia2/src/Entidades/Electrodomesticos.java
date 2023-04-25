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
public class Electrodomesticos {
     protected int precio;
    protected String color;
    protected char consumo; //Va en char porque son letras(A-F)
    protected int peso;

    public Electrodomesticos() {
    }

    public Electrodomesticos(int precio, String color, char consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }



    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public char comprobarConsumo(char letra){
        char c = 'f';
        if (letra >= 'a' && letra <= 'f'){
            c = letra;
        }
        return c;
    }
    
    public String comprobarcolor(String color){
        String col;
        switch(color){
            case "gris":
            case "blanco":
            case "negro":
            case "rojo":
            case "azul":
                col = color;
                break;
            default:
                col = "blanco";
                break;
            }
        return col;
       
    }
    
    public void CrearElectrodomestico(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el consumo energetico");
        char c = comprobarConsumo(leer.next().toLowerCase().charAt(0));
        System.out.println("Ingrese el color ");
        String cs = comprobarcolor(leer.next().toLowerCase());
        System.out.println("Ingrese el peso ");
        int peso2 = leer.nextInt();
        this.color=cs;
        this.consumo=c;
        this.peso=peso2;
        this.precio=1000; 
    }
    
    public void Preciofinal(){
        //Se calcula el precio en base al consumo//
        switch (this.consumo) {
            case 'a':
                this.precio += 1000;
                break;
            case 'b':
                this.precio += 800;
                break;
            case 'c':
                this.precio += 600;
                break;
            case 'd':
                this.precio += 500;
                break;
            case 'e':
                this.precio += 300;
                break;
            case 'f':
                this.precio += 100;

        }
        
        //Lo mismo pero con el peso
         if (this.peso >= 1 && this.peso <= 19){
            this.precio += 100;
        } else if (this.peso >= 20 && this.peso <= 49){
            this.precio += 500;
        } else if (this.peso >= 50 && this.peso <= 79){
            this.precio += 800;
        } else {
            this.precio += 1000;
        }
       // System.out.println("Precio final: " + this.precio);

    }
    
    
    @Override
    public String toString() {
        return "Electrodomestico{" + "Precio=" + precio + ", Color=" + color + ", Consumo=" + consumo + ", Peso=" + peso + '}';
    }
    
}
