/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import modelo.Cola;

/**
 *
 * @author daniel.santana
 */

public class Tools {
    
    public static String convertirColaAHtml(Cola<Clientes> p) {
        // Crea un StringBuilder para construir el HTML
        StringBuilder sb = new StringBuilder("<html>");
        
        // Encabezado del HTML
        sb.append("<head><title>Cola de Clientes</title></head>");
        
        // Estilos CSS para la tabla
        sb.append("<style>");
        sb.append("table {");
        sb.append("font-family: Arial, Helvetica, sans-serif;");
        sb.append("border-collapse: collapse;");
        sb.append("width: 100%;");
        sb.append("}");
        sb.append("th, td {");
        sb.append("border: 1px solid #333;");
        sb.append("text-align: center;");
        sb.append("padding: 12px;");
        sb.append("}");
        sb.append("th {");
        sb.append("background-color: #333;");
        sb.append("color: white;");
        sb.append("}");
        sb.append("tr:nth-child(even) {");
        sb.append("background-color: #f2f2f2;");
        sb.append("}");
        sb.append("h2 {");
        sb.append("font-size: 24px;");
        sb.append("color: #333;");
        sb.append("}");
        sb.append("</style>");
        
        // Cuerpo del HTML
        sb.append("<body>");
        sb.append("<h1>Tabla de Cola de Clientes</h1>");
        
        // Tabla HTML con estilos CSS
        sb.append("<table>");
        sb.append("<tr>");
        sb.append("<th>Caja</th>");
        sb.append("<th>1</th>");
        sb.append("<th>2</th>");
        sb.append("<th>3</th>");
        sb.append("<th>4</th>");
        sb.append("<th>5</th>");
        sb.append("<th>6</th>");
        sb.append("</tr>");
        
        // Añadir los datos de los clientes aquí (recorriendo la cola)
        while (!p.estaVacia()) {
            Clientes cliente = p.desencolar();
            sb.append("<tr>");
            sb.append("<td>").append(cliente.getModeloC()).append("</td>");
            sb.append("<td>").append(cliente.getNombreD()).append("</td>");
            sb.append("<td>").append(cliente.getTiempoEsperaC()).append("</td>");
            // Continúa con otros campos de clientes aquí
            sb.append("</tr>");
        }
        
        sb.append("</table>");
        
        // Cierre del HTML
        sb.append("</body>");
        sb.append("</html>");
        
        return sb.toString();
    }
}
