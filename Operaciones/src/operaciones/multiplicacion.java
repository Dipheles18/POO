package operaciones;
import java.util.Scanner;

public class multiplicacion {
    public void entrada(){
     Scanner teclado=new Scanner(System.in);
     int numero;
     do {
         System.out.println("¿Qué tabla de multiplicar desea?"); 
         numero=teclado.nextInt();
         if (numero!=-1){
             calcular(numero);
          }
     } while (numero!=-1);
}
    
public void calcular(int v){
    for(int f=v;f<v*10; f=f+v){
        System.out.println(f+"-");
    }
    System.out.println();    
 }
 public static void main(String[] arg){
     
 }
}