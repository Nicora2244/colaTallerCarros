/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.Clientes;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 *
 * @author nicolas.ramirez_ara@uao.edu.co - Nicolas Ramirez        - Codigo 2195824
 * @author daniel.santana@uao.edu.co      - Daniel Santana         - Codigo 2160550
 * @author Luisa.murillo@uao.edu.co       - Luisa Fernanda Murillo - Codigo 2150976
 * @author nelson.duque@uao.edu.co        - Nelson Duque           - Codigo 2160550
 */

public class Cola<T extends Base> {

    private static final String[] modelos = {"RX31", "GT", "MK21", "R3"};
    private static final String[] nombres = {"Julian", "Carla", "Luis", "Juan"};
    private static final Random random = new Random();

    private Queue<T> colaClientes;

    public Cola() {
        colaClientes = new LinkedList<>();
    }

    public void encolar(T elemento) {
        colaClientes.add(elemento);
    }

    public T desencolar() {
        return colaClientes.remove();
    }

    public boolean estaVacia() {
        return colaClientes.isEmpty();
    }

    public static Clientes generarCarroAleatorio() {
        String modeloAleatorio = modelos[random.nextInt(modelos.length)];
        String nombreAleatorio = nombres[random.nextInt(nombres.length)];
        int tiempoEsperaAleatorio = 1 + random.nextInt(6); // Genera un número entre 1 y 5

        return new Clientes(nombreAleatorio, modeloAleatorio, tiempoEsperaAleatorio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        for (T elemento : colaClientes) {
            sb.append("").append(elemento.toString());
        }
        sb.append(")");
        return sb.toString();
    }

}
