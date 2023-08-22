/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.Base;

/**
 *
 * @author nicolas.ramirez_ara
 */
public class Clientes {

    private String nombreD;
    private String modeloC;
    private int tiempoEsperaC;

    public Clientes(String nombreD1, String modeloC, int tiempoEsperaC) {
        this.nombreD = nombreD1;
        this.modeloC = modeloC1;
        this.tiempoEsperaC = tiempoEsperaC1;
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

    @Override
    public String toString() {
        return nombreD + ", " + modeloC + ", " + tiempoEsperaC;
    }

    public Base copy() {
     
        return new Clientes(nombreD1, modeloC1, tiempoEsperaC1);
        
        
    }
    
}
