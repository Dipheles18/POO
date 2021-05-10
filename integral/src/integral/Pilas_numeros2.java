package integral;
import java.util.Stack;

public class Pilas_numeros2 {
    public static void main(String[] args) {
 
        Stack pila =new Stack();
 
        pila.push("2");
        pila.pop();
        pila.push("1");
        pila.pop();
        pila.push("18");
        pila.pop();
        pila.push("16");
        pila.pop();
        pila.push("10");
        pila.pop();
        pila.push("15");
        pila.push("20");
        pila.pop();
        pila.push("5");
        pila.push("8");
        pila.push("12");
        System.out.println("Dato final: "+pila);
    }
}
   