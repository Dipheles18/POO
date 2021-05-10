/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author Marco Antonio ;) 
 */
public class Prueba { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] num = {3, 4, 5, 7, 9};
        int suma = 0; 
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);
        for (int i = 0; i < 5; ++i) {
            suma += num[i];
            System.out.println(" Resultado: " + suma);
        }
    }
    
}
