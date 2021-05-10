package javaapplication10;

import java.util.Scanner;

public class Alumnos {

   
    public static void main(String[] args) {
        String alumnos [][]=new String [7][3];
        Scanner entra=new Scanner(System.in);
        for(int i=0;i<alumnos.length;i++){
            System.out.println("¡¡¡Ingresa los datos del alumno!!! "+(i+1));
            for(int j=0;j<3;j++){
                alumnos[i][j]=entra.next();
            }
        }
        System.out.println("Dime de qué aula quieres ver a tus alumnos");
        String aula=entra.next();
        aula=aula.toLowerCase();
        for(int i=0;i<alumnos.length;i++){
            if(alumnos[i][2].toLowerCase().equals(aula)){
                System.out.println("");
                for(int j=0;j<3;j++){
                    System.out.print(alumnos[i][j]+" ");
                }
            }
        }
        
    }
    
}
