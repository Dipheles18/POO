package nombresalario;
import javax.swing.JOptionPane;
public class NombreSalario {

   
    public static void main(String[] args) {
       Salario nombreSalario;
        float Salario;
        String Nombre;
        float Total;
        Nombre=JOptionPane.showInputDialog("Introduzca su nombre");
        Salario=Float.parseFloat(JOptionPane.showInputDialog("Introduzca su sueldo o salario"));
        if (Salario>=5000){
            nombreSalario = new Salario(Salario);
            System.out.println("TIENES QUE PAGAR IMPUESTOS");
            System.out.println("SU NOMBRE ES: "+ Nombre);
                    }
            else{
                    nombreSalario = new Salario(Salario);
                    Total=Salario+ nombreSalario.getBono();
                    System.out.println("TU SALARIO ES: "+ nombreSalario.getSalario());
                    System.out.println("TU BONO ES DE: "+ nombreSalario.getBono());
                    System.out.println("EL TOTAL SERÍA: "+ Total);
                    System.out.println("SU NOMBRE ES: "+ Nombre);
                    }    
        }
    }
    

