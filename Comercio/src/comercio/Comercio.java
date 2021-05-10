package comercio;
import java.util.Scanner;
public class Comercio {
    
    private Scanner teclado;
    private float total,subtotal,iva,num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,descuento;


   
    
    public void inicio(){
            teclado=new Scanner(System.in);
            System.out.println("Valor del primer producto: ");
            num1=teclado.nextInt();
            System.out.println("Valor del segundo producto: ");
            num2=teclado.nextInt();
            System.out.println("Valor del tercer producto: ");
            num3=teclado.nextInt();
            System.out.println("Valor del cuarto producto: ");
            num4=teclado.nextInt();
            System.out.println("Valor del quinto producto: ");
            num5=teclado.nextInt();
            System.out.println("Valor del sexto producto: ");
            num6=teclado.nextInt();
            System.out.println("Valor del séptimo producto: ");
            num7=teclado.nextInt();
            System.out.println("Valor del octavo producto: ");
            num8=teclado.nextInt();
            System.out.println("Valor del noveno producto: ");
            num9=teclado.nextInt();
            System.out.println("Valor del décimo producto: ");
            num10=teclado.nextInt();
          
        }
    
        
    
    private void subtotal(){
        subtotal=num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;
        System.out.println("El subtotal es:"+"$"+subtotal);
    }
    private void descuento(){
        descuento=(float) (0.18);
        System.out.println("El descuento es:"+"$"+subtotal*descuento);
    }
    private void iva(){
        iva=(float) (subtotal*0.16);
        System.out.println("El iva es: "+"$"+iva);
    }
    private void total(){
        total=subtotal+iva;
        System.out.println("El total a pagar es: "+"$"+total);
       }
    
   
    public static void main(String[] arg){
        Comercio metodos=new Comercio();
        metodos.inicio();
        metodos.subtotal();
        metodos.iva();
        metodos.total(); 
    }
    
}
