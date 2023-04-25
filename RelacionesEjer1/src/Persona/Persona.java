/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import Perro.Perro;

/**
 *
 * @author Facu
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String edad;
    private String DNI;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String edad, String DNI, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + nombre + ", Apellido=" + apellido + ", Edad=" + edad + ", DNI=" + DNI + "\n" + perro + '}';
    }
    
    
}
