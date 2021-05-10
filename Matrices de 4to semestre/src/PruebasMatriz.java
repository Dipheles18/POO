import java.util.Scanner;
public class PruebasMatriz {
    public static void main(String[] args) {
        
        String numeros[][]=new String[2][5];
        Scanner entrada= new Scanner(System.in);
        for(int i=0;i<numeros.length;i++){
          System.out.println("Ingresa un dato");
          for( int j=0;j<5;j++){
            numeros[i][j]="#"+i+j+" "+entrada.next()+" -  ";
              }
        }
        System.out.println("Se procesó la información");
        System.out.println(".");
        System.out.println("..");
        System.out.println("...");
        for (String[] num1 : numeros) {
            for (int j = 0; j<5; j++) {
                System.out.print(num1[j] + " ");
            }
            System.out.println();
        }
        
         
    }
    
}
