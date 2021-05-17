package tercerParcial;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Intento_con_PrintWriter {
    public static void main(String[] args){
        File miArchivo;
        PrintWriter escribir;
        miArchivo = new File("miArchivo.txt");
        if(!miArchivo.exists()){
        try{
          
            miArchivo.createNewFile();
            }catch (Exception e) {}
        } else {
                try{
                                Scanner entrada=new Scanner(System.in);
            int tamañoArreglo;
           
            tamañoArreglo = Integer.parseInt(JOptionPane.showInputDialog("Teclee la cantidad de elementos del archivo a crear"));
            
            String letras[]=new String [tamañoArreglo];
            
                 System.out.println("Escriba los datos que contendrá el archivo(Use solo palabras)");
                 for(int i=0;i<tamañoArreglo;i++){
                     System.out.println("Dato No. "+(i+1)+" \nEscriba el siguiente elementos por favor");
                     letras[i]= entrada.next();
                                     escribir = new PrintWriter(miArchivo, "utf-8");
                                     escribir.println(letras[i]);
                                     escribir.close();
            }

                } catch (Exception e) {
                    e.printStackTrace();
                } 
           
        } 
        
    }
}
