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
public class Televisor extends Electrodomesticos {
   private int resolucion;
   private boolean tdt;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean tdt, int precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    public void crearTelevisor(){
        Scanner leer = new Scanner(System.in);
        super.CrearElectrodomestico();
        System.out.println("Ingrese la resolucion ");
        this.resolucion = leer.nextInt();
        System.out.println("Ingrese true si tiene tdt, de lo contrario false");
        this.tdt= leer.nextBoolean();
        
    }
    
    
    @Override
    public void Preciofinal(){
        super.Preciofinal();
          if (this.resolucion > 40){
            this.precio += this.precio * 0.3;
        }
        
        if (this.tdt == true){
            this.precio += 500;
        }
        
    }
    
    @Override
    public String toString() {
        
        //"resolucion=" + resolucion + ", tdt=" + tdt + '};
        return "Electrodomestico Televisor{" + "Precio=" + precio + ", Color=" + color + ", Consumo=" + consumo + ", Peso=" + peso +
               ", Resolucion= " + resolucion + ", TDT= " + tdt + '}';
    }
    
   
   
    
}
