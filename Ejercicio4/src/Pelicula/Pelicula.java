/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pelicula;

import java.util.Comparator;





/**
 *
 * @author Facu
 */
public class Pelicula {
    private String Titulo;
    private String Director;
    private Double duracion;

    public Pelicula() {
    }

    public Pelicula(String Titulo, String Director, double duracion) {
        this.Titulo = Titulo;
        this.Director = Director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public static Comparator<Pelicula> compararDuracionAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };

    public static Comparator<Pelicula> compararDuracionDes = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }

    };

    public static Comparator<Pelicula> compararTitAs = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }

    };

    public static Comparator<Pelicula> compararTitDes = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getTitulo().compareTo(t.getTitulo());
        }

    };

    public static Comparator<Pelicula> compararDireAs = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }

    };

    public static Comparator<Pelicula> compararDiredes = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDirector().compareTo(t.getDirector());
        }

    };

    @Override
    public String toString() {
        return "Pelicula{" + "Titulo=" + Titulo + ", Director=" + Director + ", Duracion=" + duracion + '}';
    }

  


}
