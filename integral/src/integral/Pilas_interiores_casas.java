package integral;
import java.util.Stack;

public class Pilas_interiores_casas {
    public static void main(String[] args) {
 
        Stack pila =new Stack();
 
        pila.push("Casa");
        pila.push("Sala");
        pila.push("Baño");
        pila.push("Comedor");
        System.out.println("Primer dato: "+pila);
        pila.pop();
        pila.pop();
        pila.pop();
        pila.pop();
        pila.push("Baño");
        pila.push("Sala");
        pila.push("Jardín");
        System.out.println("Segundo dato: "+pila);
        pila.pop();
        pila.push("Cocina");
        pila.push("Cochera");
        System.out.println("Tercer dato: "+pila);
        pila.pop();
        pila.pop();
        pila.pop();
        pila.push("Cocina");
        pila.push("Sala");
        System.out.println("Cuarto dato: "+pila);
        pila.pop();
        pila.pop();
        pila.pop();
        pila.push("Cocina");
        pila.push("Baño");
        pila.push("Sala");
        pila.push("Jardín");
        System.out.println("Quinto dato: "+pila);
        pila.pop();
        pila.pop();
        pila.push("Jardín");
        System.out.println("Dato final: "+pila);
    }
}
    