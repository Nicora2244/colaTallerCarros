/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.Clientes;

/**
 *
 * @author nicolas.ramirez_ara
 */
public class Receptor {
    
    private int id;
    private boolean ocupado;
    private int tiempoAtencion;
    private int cantidadCarrosAtendidos;
    private Clientes carroActual;
    
    public Receptor(int id){
        this.id = id;
        this.ocupado = false;
        this.tiempoAtencion = 0;
        this.cantidadCarrosAtendidos = 0;
    }
    
    public void atenderCarro (Clientes carro){
        this.ocupado = true;
        this.carroActual = carro;
        this.tiempoAtencion += carro.getTiempoEsperaC();
        this.cantidadCarrosAtendidos++;
    }
    
    public void finalizarAtencion(){
        this.ocupado = false;
        this.carroActual = null;
    }

    
    
    
    
}
