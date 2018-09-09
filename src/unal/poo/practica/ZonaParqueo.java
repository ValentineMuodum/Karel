/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

/**
 *
 * @author Valentine Chimezie
 */
public class ZonaParqueo {
    private int totalminutos;
    public Posicion p1=new Posicion(false, 0);
    public Posicion p2=new Posicion(false, 0);
    public Posicion p3=new Posicion(false, 0);
    public Posicion p4=new Posicion(false, 0);
    public Posicion p5=new Posicion(false, 0);
    public Posicion lugares[]={p1,p2,p3,p4,p5};        
    public ZonaParqueo(int totalminutos) {
        this.totalminutos = totalminutos;
        
    }

    public int getTotalminutos() {
        return totalminutos;
    }

    public void setTotalminutos(int totalminutos) {
        this.totalminutos = totalminutos;
    }

   
    public Posicion[] getLugares() {
        return lugares;
    }

    public void setLugares(Posicion[] lugares) {
        this.lugares = lugares;
    }

    public Posicion getP1() {
        return p1;
    }

    public void setP1(Posicion p1) {
        this.p1 = p1;
    }

    public Posicion getP2() {
        return p2;
    }

    public void setP2(Posicion p2) {
        this.p2 = p2;
    }

    public Posicion getP3() {
        return p3;
    }

    public void setP3(Posicion p3) {
        this.p3 = p3;
    }

    public Posicion getP4() {
        return p4;
    }

    public void setP4(Posicion p4) {
        this.p4 = p4;
    }

    public Posicion getP5() {
        return p5;
    }

    public void setP5(Posicion p5) {
        this.p5 = p5;
    }
   
    
    public int CantidadCarros(Posicion[] espacios,int dimension){
        int n=0;
        for(int i=0;i<dimension;i++){
        if(espacios[i].getEstado()==true){
        n++;
            }
        }
        return n;
    }
        



}

