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
 * @author nicolas.ramirez_ara
 */
public class Cola <T extends Base>{
   
    
    private Queue<T> cola;

    public Cola() {
        cola = new LinkedList<>();
    }
    
    public void encolar(T elemento){
        cola.add(elemento);
    }
    
    public T desencolar(){
        return cola.remove();
    }
    
    public boolean estaVacia (){
        return cola.isEmpty();
    }
    
    public class generadorCarros{
        private static final String[] modelos = {"RX31","GT","MK21","R3"};
        private static final String[] nombres = {"Julian","Carla","Luis","Juan"};
        private static final Random random = new Random();
    }
    
    public static Clientes generarCarroAleatorio() {
        String modeloAleatorio = modelos[random.nextInt(modelos.length)];
        String nombreAleatorio = nombres[random.nextInt(nombres.length)];
        int tiempoEsperaAleatorio = 1 + random.nextInt(6); // Genera un número entre 1 y 5

        return new Clientes(nombreAleatorio, modeloAleatorio, tiempoEsperaAleatorio);
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("(");
        for(T elemento : cola){
            sb.append("").append(elemento.toString());
        }
        sb.append(")");
        return sb.toString();
    }
    
}

