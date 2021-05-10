package javaapplication10;

import java.util.Scanner;


public class Administración {
    public static void main(String[] args) {
        String profesionista [][]=new String [10][5];
        Scanner entra=new Scanner(System.in);
        for(int i=0;i<profesionista.length;i++){
            System.out.println("¡¡¡Ingresa los datos del profesionista!!! "+(i+1));
            for(int j=0;j<5;j++){
                profesionista[i][j]=entra.next();
            }
        }
        System.out.println("Dime de qué departamento quieres ver a tus profesionistas");
        String depart=entra.next();
        depart=depart.toLowerCase();
        for(int i=0;i<profesionista.length;i++){
            if(profesionista[i][4].toLowerCase().equals(depart)){
                System.out.println("");
                for(int j=0;j<5;j++){
                    System.out.print(profesionista[i][j]+" ");
                }
            }
        }
        
    }
    
}


