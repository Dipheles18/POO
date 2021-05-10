package prueba;

import java.util.Arrays;


public class maxmin {
    public static void main(String[] args) {
        int[] maxmin = {53, 32, 19, 79, 25, 5, 47};
         System.out.println("Arreglo tal cual: " + Arrays.toString(maxmin));
         Arrays.sort(maxmin);
         System.out.println("Número mínimo: " + maxmin[0] );
         System.out.println("Número máximo: " + maxmin[maxmin.length-1] );
    }
}
