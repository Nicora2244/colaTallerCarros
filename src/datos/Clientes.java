/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.Base;

/**
 *
 * @author nicolas.ramirez_ara@uao.edu.co - Nicolas Ramirez        - Codigo 2195824
 * @author daniel.santana@uao.edu.co      - Daniel Santana         - Codigo 2160550
 * @author Luisa.murillo@uao.edu.co       - Luisa Fernanda Murillo - Codigo 2150976
 * @author nelson.duque@uao.edu.co        - Nelson Duque           - Codigo 2160550
 */
public class Clientes extends Base {

    private String nombreD;
    private String modeloC;
    private int tiempoEsperaC;
 
   /*
     * Constructor vacío que inicializa un nuevo objeto Clientes.
     * @return null.
     */
    
    public Clientes() {
    }
    
    /*
     * Constructor que inicializa un nuevo objeto Clientes con los valores proporcionados.
     * 
     * Detalles adicionales si es necesario.
     * Puede abarcar múltiples líneas.
     * 
     * @param parametro1 nombreD.
     * @param parametro2 modeloC.
     * @param parametro2 tiempoEsperaC.
     */
      
    public Clientes(String nombreD, String modeloC, int tiempoEsperaC) {
        this.nombreD = nombreD;
        this.modeloC = modeloC;
        this.tiempoEsperaC = tiempoEsperaC;
    }

    /**
     * Get the value of tiempoEsperaC
     *
     * @return the value of tiempoEsperaC
     */
    public int getTiempoEsperaC() {
        return tiempoEsperaC;
    }

    /**
     * Set the value of tiempoEsperaC
     *
     * @param tiempoEsperaC new value of tiempoEsperaC
     */
    public void setTiempoEsperaC(int tiempoEsperaC) {
        this.tiempoEsperaC = tiempoEsperaC;
    }

    /**
     * Get the value of modeloC
     *
     * @return the value of modeloC
     */
    public String getModeloC() {
        return modeloC;
    }

    /**
     * Set the value of modeloC
     *
     * @param modeloC new value of modeloC
     */
    public void setModeloC(String modeloC) {
        this.modeloC = modeloC;
    }

    /**
     * Get the value of nombreD
     *
     * @return the value of nombreD
     */
    public String getNombreD() {
        return nombreD;
    }

    /**
     * Set the value of nombreD
     *
     * @param nombreD new value of nombreD
     */
    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }
    
    /*
     * Devuelve una representación en cadena del objeto Clientes
     * @return Cadena del objeto
     * @throws ExcepcionTipo Descripción de cuándo se lanza esta excepción.
     */

    @Override
    public String toString() {
        return nombreD + ", " + modeloC + ", " + tiempoEsperaC;
    }
    
    /*
     * Crea y devuelve una copia del objeto Clientes.
     * @return Clientes nueva instancia de un objeto.
     */

    public Base copy() {
        return new Clientes(nombreD, modeloC, tiempoEsperaC);
    }
    
}
