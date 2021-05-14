package tercerParcial;

import java.util.Formatter;


public class crearArchivo {
    public static void main(String[] args){
        Formatter archivo = null;
        try{
           archivo = new Formatter("C:\\Users\\marco\\Documents\\NetBeansProjects\\Cualquiera.txt");
        archivo.format("%d %s %f %c",25,"Marco Antonio",20.5,'&'); 
        } catch (Exception e) {
            System.out.println("Se ha producido un error"+ e.toString());
        } finally{archivo.close();}

    }
}
