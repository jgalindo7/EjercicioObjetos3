/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author Administrador
 */
public class NumComplejos {
    private int parteR;
    private int parteI;
    
    public NumComplejos(int parteR, int parteI){
        this.parteR = parteR;
        this.parteI = parteI;
    }

    public int getParteR() {
        return parteR;
    }

    public void setParteR(int parteR) {
        this.parteR = parteR;
    }

    public int getParteI() {
        return parteI;
    }

    public void setParteI(int parteI) {
        this.parteI = parteI;
    }
    
    public NumComplejos sumar(NumComplejos G2){
        NumComplejos G;
        int  r, i;
        r = this.parteR + G2.parteR;
        i = this.parteI + G2.parteI;
        G = new NumComplejos(r, i);
        return G;
    }
    
    public NumComplejos restar(NumComplejos z2){
        NumComplejos G;
        int  r, i;
        r = this.parteR - z2.parteR;
        i = this.parteI - z2.parteI;
        G = new NumComplejos(r, i);
        return G;
    }
    
    public NumComplejos multiplicar(NumComplejos z2){
        NumComplejos G;
        int  r,i;
        r = (this.parteR * z2.parteR) - (this.parteI * z2.parteI);
        i = (this.parteR * z2.parteI) + (this.parteI * z2.parteR);
        G = new NumComplejos(r,i);
        return G;
    }
    
    public NumComplejos dividir(NumComplejos z2){
        NumComplejos G;
        int Rnum,Inum;
        Rnum = ((this.parteR * z2.parteR) + (this.parteI * z2.parteI));
        Inum = ((this.parteI * z2.parteR) - (this.parteR * z2.parteI));
        G = new NumComplejos(Rnum,Rnum);
        return G;
    }

}
