import javax.swing.JOptionPane;
public class Matriz_operaciones {


    public static void main(String[] args) {
        int filasA=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de filas de la matriz"));
        int columnasA=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de columnas de la matriz"));
        int filasB=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de filas de la matriz"));
        int columnasB=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de columnas de la matriz"));
        int matrizA[][]=new int [filasA][columnasA];
        int matrizB[][]=new int [filasB][columnasB];
        int matrizRes[][]= new int [filasA][columnasB];
        
        if(filasA==columnasB){
            
        
        System.out.println("Datos de la matriz A");
        for(int i=0;i<filasA;i++){
            for(int j=0;j<columnasA;j++){
                matrizA[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número para la posición "+"["+i+"]"+"["+j+"]"+"de la matriz A"));
                System.out.println(matrizA[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Datos de la matriz B");
        for(int i=0;i<filasB;i++){
            for(int j=0;j<columnasB;j++){
                matrizB[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número para la posición "+"["+i+"]"+"["+j+"]"+"de la matriz B"));
                System.out.println(matrizB[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Multiplicación de matrices");
        
        
        for(int i=0;i<filasA;i++){
            for(int j=0;j<columnasB;j++){
                matrizRes[i][j]=matrizA[i][j]*matrizB[i][j];
                System.out.print(matrizRes[i][j]+" ");
            }
            System.out.println();
        }}
        else{
            System.out.println("Matrices de diferente tamaño imposbile hacer el cálculo");
        }
    }
    
}
