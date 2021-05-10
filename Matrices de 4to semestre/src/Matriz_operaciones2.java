import javax.swing.JOptionPane;

public class Matriz_operaciones2 {
public static void main(String[] args) {

    int filasA = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de filas de la matriz"));
    int columnasA = Integer.parseInt((JOptionPane.showInputDialog("Introduce el numero de columnas de la matriz")));
    int filasB = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de filas de la matriz"));
    int columnasB = Integer.parseInt((JOptionPane.showInputDialog("Introduce el numero de columnas de la matriz")));

    int matA[][] = new int[filasA][columnasA];
    int matB[][] = new int[filasB][columnasB];
    int matRes[][] = new int[filasA][columnasB];

    // para verificar si se puede multiplicar
    if (filasA == columnasB) {
      // escribimos los datos en la matrizA
      System.out.println("Guardando datos de la matrizA");
      for (int i = 0; i < filasA; i++) {
        for (int j = 0; j < columnasA; j++) {
          matA[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero para la posicion  a[" + i + "][" + j + "]" + " de la matriz A"));
          System.out.print(matA[i][j] + " ");
        }
        System.out.println();
      }

      System.out.println("Guardando datos de la matrizB");
      for (int i = 0; i < filasB; i++) {
        for (int j = 0; j < columnasB; j++) {
          matB[i][j] = Integer.parseInt(JOptionPane
              .showInputDialog("Digita un numero para la posicion  a[" + i + "][" + j + "]" + " de la matriz B"));
          System.out.print(matB[i][j] + " ");
        }
        System.out.println();
      }

      System.out.println("El resultado es: ");
      for (int i=0; i < filasA; i++ ){
        for (int j=0; j < columnasB; j++){
          for (int k=0; k < columnasA; k++){
            matRes[i][j] += matA[i][k] * matB[k][j];
          }
          System.out.print(matRes[i][j] + " ");
        }
        System.out.println();
      }
    } else {
      System.out.println("Error las matrices no se pueden multiplicar porque no se cumplen las reglas");
    }




  }
}