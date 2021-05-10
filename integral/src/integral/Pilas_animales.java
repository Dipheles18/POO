package integral;
import java.util.Stack;

public class Pilas_animales {
    public static void main(String[] args) {
 
        Stack pila =new Stack();
 
        pila.push("Gato");
        pila.push("Perro");
        pila.push("Pollo");
        pila.push("Pez");
        System.out.println("Primer dato: "+pila);
        pila.pop();
        pila.pop();
        pila.pop();
        pila.push("Pez");
        System.out.println("Segundo dato: "+pila);
        pila.pop();
        pila.push("Rata");
        pila.push("Pez");
        pila.push("Araña");
        System.out.println("Tercer dato: "+pila);
        pila.pop();
        pila.pop();
        pila.pop();
        pila.pop();
        pila.push("Oso");
        pila.push("Araña");
        pila.push("Gato");
        System.out.println("Cuarto dato: "+pila);
        pila.pop();
        pila.pop();
        pila.push("Gato");
        pila.push("Araña");
        pila.push("Rata");
        System.out.println("Quinto dato: "+pila);
        pila.pop();
        pila.pop();
        pila.pop();
        pila.pop();
        pila.push("Pez");
        pila.push("Rata");
        pila.push("Oso");
        pila.push("Araña");
        pila.push("Gato");
        System.out.println("Dato final: "+pila);
    }
}
    