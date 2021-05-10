package prueba;

import java.util.Arrays;


public class carros {
    public static void main(String[] args) {
        int[] carros = {15, 16, 14, 1, 12, 17, 2, 10, 6, 8, 5, 7, 3};
         System.out.println("Arreglo tal cual: " + Arrays.toString(carros));
         Arrays.sort(carros);
         System.out.println("Arreglo tal cual: " + Arrays.toString(carros));
    }
}
