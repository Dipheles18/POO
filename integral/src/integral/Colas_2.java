package integral;
import java.util.LinkedList;
import java.util.Queue;

public class Colas_2 {
        public static void main(String[] args) {
        
        /*Creamos la Cola Indicando el tipo de dato*/
        Queue cola=new LinkedList();
        /*Insertamos datos*/
            cola.offer("%");
            System.out.println("Cola llena 1: " + cola);
            cola.poll();
            cola.add("&");
            cola.offer("%");
            System.out.println("Cola llena 2: " + cola);
            cola.poll();
            cola.poll();
            cola.offer("%");
            cola.add("&");
            cola.add("/");
            System.out.println("Cola llena 3: " + cola);
            cola.poll();
            cola.poll();
            cola.offer("(");
            cola.add(")");
            cola.add("$");
            System.out.println("Cola llena 4: " + cola);
            cola.poll();
            cola.poll();
            cola.poll();
            cola.poll();
            cola.add(")");
            cola.add("$");
            cola.add("*");
            System.out.println("Cola llena 5: " + cola);
            cola.poll();
            cola.poll();
            cola.add("$");
            cola.add("&");
            cola.offer("(");
            System.out.println("Cola llena 6: " + cola);
            cola.poll();
            cola.poll();
            cola.poll();
            cola.add(")");
            cola.add("/");
            System.out.println("Cola llena 7: " + cola);
            cola.poll();
            cola.poll();
            cola.add("*");
            cola.add("+");
            System.out.println("Cola llena 8: " + cola);
        /*Impresion de la Cola llena con los datos*/
        /*Estructura repetitiva para desencolar*/
        while(cola.poll()!=null){//Desencolamos y el valor se compara con null
            System.out.println(cola.peek());//Muestra el nuevo Frente
        }
        /*Muestra null debido a que la cola ya esta vacia*/
        System.out.println(cola.peek());     
    }
}