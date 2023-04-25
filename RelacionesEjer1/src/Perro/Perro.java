/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perro;

/**
 *
 * @author Facu
 */
public class Perro {
    private String nombre;
    private String raza;
    private String tamaño;
    private int edad;

    public Perro() {
    }

    public Perro(String nombre, String raza, String tamaño, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamaño = tamaño;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" + "Nombre=" + nombre + ", Raza=" + raza + ", Tamaño=" + tamaño + ", Edad=" + edad + '}';
        
    }
    
}
