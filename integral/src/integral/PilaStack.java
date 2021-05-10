
package integral;
import java.util.Stack;

public class PilaStack {
    public static void main(String[] args) {
 
        Stack pila =new Stack();
 
        pila.push("elemento 1");
        pila.push("elemento 2");
        pila.push("elemento 3");
 
        System.out.println("1- push: "+ pila);
 
        pila.pop();
        System.out.println("2- pop: "+ pila);
 
        String x = (String) pila.peek();
        System.out.println("3- peek: "+x);
        pila.pop();
        pila.pop();
        boolean y = pila.empty();
        System.out.println("4- empty: "+y);
    }
}
    

