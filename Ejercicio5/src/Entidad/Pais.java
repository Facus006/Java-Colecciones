/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author Facu
 */
public class Pais {
    private String Pais;

    public Pais() {
    }

    public Pais(String Pais) {
        this.Pais = Pais;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.Pais);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.Pais, other.Pais)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "Pais{" + "Pais=" + Pais + '}';
    }
    
    public static Comparator<Pais> compararletra = new Comparator<Pais> (){
        @Override
        public int compare(Pais t, Pais t1) {
            return t.getPais().compareTo(t1.getPais());
             }
       
    };
    
}
