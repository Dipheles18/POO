package integral;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listas_pruebas {
     public static void main(String[] args) {
        // Definimos una ArrayList
        List list = new ArrayList();
        // Añadimos elementos
        list.add("Andrea");
        list.add("Amaya");
        list.add("Julio");
        list.clear();
        System.out.println(list.size());
        System.out.println(list);
        list.remove("Amaya");
        System.out.println(list.size());
        System.out.println(list);
        list.add("Lola");
        list.add("Juan");
        System.out.println(list.size());
        
        System.out.println(list);
        // Obtenemos un Iterador y recorremos la lista.
        Iterator iter = list.iterator();
        while (iter.hasNext())
          System.out.println(iter.next());
         System.out.println("Con for:");
        for (int i = 0; i <= list.size() - 1; i++) {
       
            System.out.println(list.get(i));
           } 
            boolean empty = list.isEmpty();
              System.out.println("¿Vacio? :"+empty);

            boolean contains = list.contains("Lola");
              System.out.println(contains);
        }
    }        
    
