package operaciones;

import java.util.Scanner;
public class Operaciones {
    private Scanner teclado;
    private float suma,resta,multi,divi,num1,num2;
    
    public void inicio(){
            teclado=new Scanner(System.in);
            System.out.println("Primer numero: ");
            num1=teclado.nextInt();
            System.out.println("Segundo numero: ");
            num2=teclado.nextInt();
          
        }
    private void suma(){
        suma=num1+num2;
        System.out.println("La suma de los 2 numeros es: "+suma);
    }
    private void resta(){
        resta=num1-num2;
        System.out.println("La resta de los 2 numeros es: "+resta);
       }
    private void multiplicacion(){
        multi=num1*num2;
        System.out.println("La multiplicacion de los 2 numeros es: "+multi);
        }
    private void division(){
        divi=num1/num2;
        System.out.println("La division de los 2 numeros es: "+divi);
    }
    public static void main(String[] args) {
        Operaciones operacion1=new Operaciones();
        operacion1.inicio();
        operacion1.suma();
        operacion1.resta();
        operacion1.multiplicacion();
        operacion1.division();
    }
    
}
