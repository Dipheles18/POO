package encapsulamiento;


public class Encapsulamiento {

   
    public static void main(String[] args) {
       Clase1 objeto1= new Clase1();
       
       //objeto1.Edad=1000;
         
       objeto1.setEdad(25);
            System.out.println("La edad de la persona es: "+objeto1.getEdad());
        
        objeto1.setNombre("Jorge Diaz Ordaz");
            System.out.println("El nombre de la persona es: "+objeto1.getNombre());
        objeto1.setNo_Empleado(5600);
            System.out.println("El numero del empleado es: "+objeto1.getNo_Empleado());
    }
    
}
