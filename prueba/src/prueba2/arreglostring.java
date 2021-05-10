
package prueba2;

import java.util.Arrays;


public class arreglostring {
    public static void main(String[] args) {
        String consolas[] = {"XboxOne","Playstation4","Switch","Nintendo3DS"};
        for (int i = 0; i<consolas.length; ++i) {
            System.out.println("Las consolas más jugadas actualmente son:" + consolas[i]);
        }
        System.out.println("Este es el top: " + consolas.length);
        System.out.println("La lista es: " + Arrays.toString(consolas));
        Arrays.sort(consolas);
        System.out.println("El top queda así: " + Arrays.toString(consolas));
        System.out.println("Primero: " + consolas[1]);
        System.out.println("Finalmente: " + consolas[consolas.length-1]);
    }
    
}
