package Matrices;

import java.util.Scanner;
public class Arrendamiento {
    public static void main(String[] args) {
        String arren [][]=new String [3][4];
        Scanner entra=new Scanner(System.in);
        for(int i=0;i<arren.length;i++){
            System.out.println("Ingresar los datos de los vehículos disponibles"+"(Marca,Modelo,Costo por día y Descuento)"+(i+1));
            for(int j=0;j<4;j++){
                arren[i][j]=entra.next();
            }
        }
         for (int x=0; x < arren.length; x++) {
  for (int y=0; y < arren[x].length; y++) {
    System.out.println (arren[x][y]);
    if (y!=arren[x].length-1) System.out.print("\t");
  }
}
         
        String cliente [][]=new String [3][4];
        Scanner entrad=new Scanner(System.in);
        for(int i=0;i<cliente.length;i++){
            System.out.println("Ingresar datos solicitados"+"(No. de cliente,Nombre,Días y Automóvil req.)"+(i+1));
            for(int j=0;j<4;j++){
                cliente[i][j]=entrad.next();
            }
        }
        
System.out.println("¿Qué registro de marca desea ver?");
        String marca=entra.next();
        marca=marca.toLowerCase();
        for(int i=0;i<cliente.length;i++){
            if(cliente[i][3].toLowerCase().equals(marca)){
                System.out.println("");
                for(int j=0;j<4;j++){
                    System.out.print(cliente[i][j]+" ");
                }
            }
        }
        
    }
 }