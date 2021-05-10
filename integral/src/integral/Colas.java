package integral;
import java.util.LinkedList;
import java.util.Queue;

public class Colas {
        public static void main(String[] args) {
        
        /*Creamos la Cola Indicando el tipo de dato*/
        Queue cola=new LinkedList();
        /*Insertamos datos*/
            cola.offer("Oso");
            System.out.println("Cola llena 1: " + cola);
            cola.add("Caballo");
            System.out.println("Cola llena 2: " + cola);
            cola.add("Delfín");
            System.out.println("Cola llena 3: " + cola);
            cola.poll();
            cola.poll();
            cola.poll();
            cola.add("Delfín");
            cola.add("Caballo");
            cola.add("Foca");
            cola.add("Gato");
            System.out.println("Cola llena 4: " + cola);
            cola.poll();
            cola.poll();
            cola.poll();
            cola.poll();
            cola.add("Delfín");
            cola.add("Caballo");
            System.out.println("Cola llena 5: " + cola);
            cola.poll();
            cola.poll();
            cola.add("Foca");
            cola.add("Gato");
            cola.add("Pájaro");
            cola.add("Víbora");
            System.out.println("Cola llena 6: " + cola);
            cola.poll();
            cola.poll();
            cola.poll();
            cola.add("Búho");
            cola.add("Jirafa");
            System.out.println("Cola llena 7: " + cola);
            cola.poll();
            System.out.println("Cola llena 8: " + cola);
            cola.poll();
        /*Impresion de la Cola llena con los datos*/
        /*Estructura repetitiva para desencolar*/
        while(cola.poll()!=null){//Desencolamos y el valor se compara con null
            System.out.println(cola.peek());//Muestra el nuevo Frente
        }
        /*Muestra null debido a que la cola ya esta vacia*/
        System.out.println(cola.peek());     
    }
}
    

