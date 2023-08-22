/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.Clientes;
import java.util.LinkedList;
import java.util.Queue;

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

