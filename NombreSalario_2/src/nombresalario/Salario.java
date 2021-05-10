package nombresalario;

public class Salario {
    private float Salario;
    private String Nombre;
    private int Bono;

    public Salario(float Salario) {
        this.Salario = Salario;
    } 
    public Salario(String Nombre) {
        this.Nombre = Nombre;
    }
    public Salario(int Bono) {
        this.Bono = Bono;
    }
    
    public float getSalario() {
        return Salario;
    }
    public String getNombre() {
        return Nombre;
    }
    public int getBono() {
        int Bono=1500;
        return Bono;
     }          
   
    
}
