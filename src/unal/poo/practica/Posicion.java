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
public class Posicion {
    private String placaactual;
    private boolean estado;
    private int minutos;

    public Posicion(boolean estado, int minutos) {
        
        this.estado = estado;
        this.minutos = minutos;
    }

   

    public String getPlacaactual() {
        return placaactual;
    }

    public void setPlacaactual(String placaactual) {
        this.placaactual = placaactual;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    
     
       
}
