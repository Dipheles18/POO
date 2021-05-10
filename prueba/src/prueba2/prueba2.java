/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2;

public class prueba2 { 

  
    public static void main(String[] args) {
        
        int num[] = {3, 4, 5, 7, 9};
        double suma = 0; 
        double promedio = 0;
        
        for (int i = 0; i < 5; ++i) {
            suma += num[i];
            promedio = suma/5;
        }
            System.out.println( "Resultado: " + promedio);
        
            
        
    }

}
