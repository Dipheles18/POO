package encapsulamiento;

public class Clase1 {
    private int Edad;
    private String Nombre;
    private int No_Empleado;
    
    //Este metodo es para declarar la instrucion set y poder asignar un valor diferente a la variable privada
    public void setEdad (int edad){
            this.Edad=edad;
        }
    //Este metodo es un ejemplo de metodo de retorno que regresa el valor de la variable
    public int getEdad (){
        return Edad;
        
        
    }    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNo_Empleado() {
        return No_Empleado;
    }

    public void setNo_Empleado(int No_Empleado) {
        this.No_Empleado = No_Empleado;
    }
    
    
}
