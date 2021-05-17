package tercerParcial;

import java.util.Formatter;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Semana11_Formatter {
    public static void main(String[] args){
        Formatter archivo = null;
        try{
            //Se introducen las variables a utilizar en el código
            Scanner entrada=new Scanner(System.in);
            int tamañoArreglo;
           
            tamañoArreglo = Integer.parseInt(JOptionPane.showInputDialog("Teclee la cantidad de elementos del archivo a crear"));
            //Se introduce el arreglo cuyo tamaño es determinado por el usuario
            String palabras[]=new String [tamañoArreglo];
            
                 System.out.println("Escriba los datos que contendrá el archivo(Use solo palabras separadas por un guíon bajo)");
                 for(int i=0;i<tamañoArreglo;i++){
                     //El usuario introduce los elementos deseados
                     System.out.println("Dato No. "+(i+1)+" \nEscriba el siguiente elementos por favor");
                     palabras[i]= entrada.next();
            }
            System.out.println("Los elementos que escribiste son:");
            for(int i=0;i<tamañoArreglo;i++){
                System.out.println(palabras[i]);
                //Mastro, en esta parte intente poner primero palabras[i] para que se colocaran todos los elementos, pero sólo se colocaba el último de los 10, asi que lo hice de la forma que ve a continuación
                 archivo = new Formatter("C:\\Users\\marco\\Documents\\NetBeansProjects\\Nuevo.txt");
                 archivo.format("%s ",palabras[0]);
                 archivo.format("%s ",palabras[1]);
                 archivo.format("%s ",palabras[2]);
                 archivo.format("%s ",palabras[3]);
                 archivo.format("%s ",palabras[4]);
                 archivo.format("%s ",palabras[5]);
                 archivo.format("%s ",palabras[6]);
                 archivo.format("%s ",palabras[7]);
                 archivo.format("%s ",palabras[8]);
                 archivo.format("%s ",palabras[9]);
            }
          
        } catch (Exception e) {
            System.out.println("Se ha producido un error "+ e.toString());
        } finally{archivo.close();}

    }
}
