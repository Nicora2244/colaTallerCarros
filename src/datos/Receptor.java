/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author nicolas.ramirez_ara@uao.edu.co - Nicolas Ramirez        - Codigo 2195824
 * @author daniel.santana@uao.edu.co      - Daniel Santana         - Codigo 2160550
 * @author Luisa.murillo@uao.edu.co       - Luisa Fernanda Murillo - Codigo 2150976
 * @author nelson.duque@uao.edu.co        - Nelson Duque           - Codigo 2160550
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

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public boolean isOcupado() {
        return ocupado;
    }
    
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public int getTiempoAtencion() {
        return tiempoAtencion;
    }
    
    public void setTiempoAtencion(int tiempoAtencion) {
        this.tiempoAtencion = tiempoAtencion;
    }

    public int getCantidadCarrosAtendidos() {
        return cantidadCarrosAtendidos;
    }
    
    public void setCantidadCarrosAtendidos(int cantidadCarrosAtendidos) {
        this.cantidadCarrosAtendidos = cantidadCarrosAtendidos;
    }

    public Clientes getCarroActual() {
        return carroActual;
    }

    public void setCarroActual(Clientes carroActual) {
        this.carroActual = carroActual;
    }

    

    

    

    

    
    
    
    
}
