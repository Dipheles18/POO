
package prueba2;

import java.util.Scanner;
public class multi {
    public static void main(String[]args) {
        int i,y;
        int matrizc[][] = new int [1][10];
        int [][]numA= { {1,2,3,4,5,6,7,8,9,10}
    };
        
        System.out.println("Valores de la matriz A; ");
        for (int[] numA1 : numA) {
            for (int j=0; j<numA1.length; j++){
                System.out.println(numA1[j]);
            }
        }
        Scanner var1 = new Scanner (System.in);
        int matrizb[][] = new int [1][1];
        System.out.println("Introducza el número de la tabla que quiera conocer: ");
        matrizb[0][0] = var1.nextInt();
        System.out.println("Tabla del número: " + matrizb[0][0]);
        for (i=0; i<=10; i++){
            for (y=0; y<=10; y++){
                System.out.println(matrizc[i][y] = numA[i][y]* matrizb[0][0]);
            }
            System.out.println("");
        }
    }
    }
    

