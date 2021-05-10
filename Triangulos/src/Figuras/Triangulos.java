package Figuras;
import java.util.Scanner;
public class Triangulos {
        private Scanner teclado;
        private int lado1,lado2,lado3;
        
        public void inicio(){
            teclado=new Scanner(System.in);
            System.out.println("Escribe un valor del primer lado: ");
            lado1=teclado.nextInt();
            System.out.println("Escribe un valor del segundo lado: ");
            lado2=teclado.nextInt();
            System.out.println("Escribe un valor del tercer lado: ");
            lado3=teclado.nextInt();
        }
        
        public void mayor(){
            if (lado1==lado2 && lado1==lado3){
            System.out.println("Los tres lados son iguales, el triangulo es un equilatero");
            }else{
            System.out.println("El triangulo no es equilatero");
                if (lado1>lado2 && lado1>lado3){
                    System.out.println("El primer lado es mayor y mide: "+lado1);
                    }else{
                    if (lado2>lado3){
                    System.out.println("El segundo es mayor y mide: "+lado2);
                    }else{
                        System.out.println("El tercero es mayor y mide: "+lado3);
                        
                }
                
            }
    
            }
}  
    public static void main(String[] args) {
        Triangulos triangulo1=new Triangulos();
        triangulo1.inicio();
        triangulo1.mayor();    
    } 
}
