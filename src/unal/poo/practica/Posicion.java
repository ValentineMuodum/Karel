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
    private int horaentrada;

    public Posicion(boolean estado, int horaentrada) {
        
        this.estado = estado;
        this.horaentrada = horaentrada;
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

    public int getHoraentrada() {
        return horaentrada;
    }

    public void setHoraentrada(int horaentrada) {
        this.horaentrada = horaentrada;
    }

    
    
     
       
}
