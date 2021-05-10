import java.util.Scanner;
public class ExamenCambio {

        public static void main(String[] args) {
          
            int tipocamb[]={50,20,10,5,1};
            int numero[]={0,0,0,0,0};
            double conversioncambio = 0;
          Scanner entrada=new Scanner(System.in);
          System.out.println("Digita el valor del dinero que deseas cambiar:");
          int numerodigitado=entrada.nextInt();
           
           numero[0]= numerodigitado;
           for(int i=0;i< 5;i++){
           numero[i]= numerodigitado/tipocamb[i];
             while(numero[i]> 0 && numero[i]!=numerodigitado-1){
               int restar= numerodigitado - (tipocamb[i]*numero[i]);
               
               for(int j=0;j<5;j++){
               if(j>i){
                  numero[j]= restar/tipocamb[j];
                  restar= tipocamb[j]*numero[j];
                  conversioncambio= (tipocamb[j]/100);
               }
                System.out.println(numero[j]+" monedas de "+tipocamb[j]+" centavos "+ " ó "+ conversioncambio+ " pesos ");
        }

        System.out.println("==============================================");
        System.out.println("______________________________________________");
        System.out.println("");
        System.out.println("==============================================");


        numero[i]--;
      }
        
    }
  }
}        