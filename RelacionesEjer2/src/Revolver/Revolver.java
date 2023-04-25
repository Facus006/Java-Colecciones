/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Revolver;

/**
 *
 * @author Facu
 */
public class Revolver {

    private int PosAct;
    private int PosBala;

    public Revolver() {
    }

    public Revolver(int PosAct, int PosBala) {
        this.PosAct = PosAct;
        this.PosBala = PosBala;
    }

    public int getPosAct() {
        return PosAct;
    }

    public void setPosAct(int PosAct) {
        this.PosAct = PosAct;
    }

    public int getPosBala() {
        return PosBala;
    }

    public void setPosBala(int PosBala) {
        this.PosBala = PosBala;
    }

    public void Llenar() {
        PosAct = (int) (Math.random() * 5+1);
        PosBala = (int) (Math.random() * 5+1);
        System.out.println("Posicion Bala = "+PosBala);
         System.out.println("Posicion Actual = "+PosAct);
        
    }

    public boolean Mojar() {
        boolean retorno = false;
        if (PosAct == PosBala) {
            retorno = true;
        } else {
            retorno = false;
        }

        return retorno;
    }

    public void SiguienteBala() {
        switch (PosAct) {
            case 1:
                PosAct++;
                break;
            case 2:
                PosAct++;
                break;
            case 3:
                PosAct++;
                break;
            case 4:
                PosAct++;
                break;
            case 5:
                PosAct++;
                break;
            case 6:
                PosAct = 1;
                break;

        }
    }

    @Override
    public String toString() {
        return "Revolver{" + "Posicion Actual=" + PosAct + ", Posicion de Bala=" + PosBala + '}';
    }

}
