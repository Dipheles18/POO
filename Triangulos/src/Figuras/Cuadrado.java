package Figuras;
import java.util.Scanner;
public class Cuadrado {
        private Scanner teclado;
        private int lado1,area,perimetro;
        
        public void inicio(){
            teclado=new Scanner(System.in);
            System.out.println("Escribe el valor de un lado: ");
            lado1=teclado.nextInt();
        }
        
        public void area(){
            area= lado1*lado1;
            System.out.println("El area de este cuadrado es:"+area);
            }
        public void perimetro(){
            perimetro= lado1*4;
            System.out.println("El perimetro de este cuadrado es:"+perimetro);          
                }
                
            
    
            
  
    public static void main(String[] args) {
        Cuadrado cuadrado1=new Cuadrado();
        cuadrado1.inicio();
        cuadrado1.area();   
        cuadrado1.perimetro(); 
    } 

} 