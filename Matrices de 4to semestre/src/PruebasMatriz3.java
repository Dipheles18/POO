import java.util.Scanner;
public class PruebasMatriz3 {

        public static void main(String[] args) {
        String productos[]=new String [10];
        productos[0]="Jugo de Melón";
        productos[1]="Jugo de Zanahoria";
        productos[2]="Jugo de Manzana";
        productos[3]="Jugo de Plátano";
        productos[4]="Jugo de Fresa";
        productos[5]="Jugo de Jengibre con miel";
        productos[6]="Jugo de Amaranto";
        productos[7]="Jugo de Kiwi";
        productos[8]="Jugo de Betabel";
        productos[9]="Jugo de Papaya";

        String matriz[][]=new String[2][2];
        Scanner entrada= new Scanner(System.in);
        for(int i=0;i<matriz.length;i++){  
          for( int j=0;j<matriz[i].length;j++){
            int numero=(int)(Math.random()*10+1);
            matriz[i][j]="#"+i+j+" "+productos[numero];
              }
        }
        System.out.println("Lista de la máquina");
        for(int i=0;i<matriz.length;i++){
                for(int j=0;j<matriz[i].length;j++){
                    System.out.print(matriz[i][j]+" - ");
                }
                System.out.println();
            }
        System.out.println("Ingresa el código del producto");
        String codigo=entrada.next();
        String[] partes = codigo.split("");
        
        String codigo1= partes[0];
        String codigo2= partes[1];
        int codigo1_1=Integer.parseInt(codigo1);
        int codigo2_2=Integer.parseInt(codigo2);
        
        String[] busqueda = matriz[codigo1_1][codigo2_2].split("-");
        String codresul = busqueda[0]; 
        System.out.println(codresul);
    } 
}