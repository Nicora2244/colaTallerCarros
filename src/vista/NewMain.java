/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.Clientes;
import modelo.Cola;
import modelo.Receptor;

/**
 *
 * @author nicolas.ramirez_ara
 */
public class NewMain {

    public static void main(String[] args) {
        
        Cola<Clientes> colaDeCarros = new Cola<>();
        Receptor[] receptores = new Receptor[4];
        for (int i = 0; i < 4; i++) {
            receptores[i] = new Receptor(i + 1);
        }

        while (true) { // Este bucle simula el proceso continuo de atención
            for (Receptor receptor : receptores) {
                if (!receptor.isOcupado() && !colaDeCarros.estaVacia()) {
                    Clientes carro = colaDeCarros.desencolar();
                    receptor.atenderCarro(carro);
                }
            }
            // Aquí puedes agregar un delay para simular el tiempo real
        }
    }

    /*Cola<Persona> colaPersona = new Cola<>();
        
        colaPersona.encolar(new Persona ("Nicolas", "nicolas.ra@uao", "302"));
        colaPersona.encolar(new Persona ("Claudia", "claudia.ra@uao", "303"));
        colaPersona.encolar(new Persona ("Jose", "jose.ra@uao", "304"));
        colaPersona.encolar(new Persona ("Jimmy", "jimmy.ra@uao", "305"));
        
        System.out.println("El contenido de la cola es " + colaPersona.toString());
        
        colaPersona.desencolar();
        
        System.out.println("El contenido de la cola es " + colaPersona.toString());
     */
}
