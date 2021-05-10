public class MatrizFacil {
    public static void main(String[] args){
        int[][] numeros;
        int i,j;
        numeros = new int[2][3];
        for (i=0; i<numeros.length; i++) { //Recorre las filas
            for (j=0; j<numeros[i].length; j++) {  //de cada fila se recorren todas las columnas
                numeros[i][j]=0;
                System.out.print(numeros[i][j]+" "); //Se imprimen los elementos de las filas
            }
            System.out.println();//Imprime un salto de línea
        }
        
    }
    
}
