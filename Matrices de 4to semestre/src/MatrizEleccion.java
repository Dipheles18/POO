public class MatrizEleccion {
    public static void main(String[] args){
       
        int filas = 2;
        int columnas = 2;        
        
        //Scanner uno=new Scanner(System.in);
       String[][] frutas = new String[filas][columnas];
       frutas[0][0] = "1. Durazno";
       frutas[0][1] = "2. Piña";
       frutas[1][0] = "3. Naranja";
       frutas[1][1] = "4. Manzana";
       
        System.out.println("Introduce las frutas que vas a vender");
        for (int i=0; i<filas; i++) { 
            for (int j=0; j<columnas; j++) {                  
                System.out.print(frutas[i][j]+" "); 
            }
            System.out.println();
        }
        
    }
    
}