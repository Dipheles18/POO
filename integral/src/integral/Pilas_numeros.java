package integral;
import java.util.Stack;

public class Pilas_numeros {
    public static void main(String[] args) {
 
        Stack pila =new Stack();
 
        pila.push("20");
        pila.pop();
        pila.push("1");
        pila.push("2");
        pila.push("5");
        pila.pop();
        pila.pop();
        pila.push("8");
        pila.pop();
        pila.push("12");
        pila.pop();
        pila.push("10");
        pila.pop();
        pila.pop();
        pila.push("15");
        System.out.println("Dato final: "+pila);
    }
}
    
