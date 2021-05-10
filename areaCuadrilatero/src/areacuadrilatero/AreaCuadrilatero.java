package areacuadrilatero;

import javax.swing.JOptionPane;
public class AreaCuadrilatero {

    
    public static void main(String[] args) {
        EjercicioAreaPerimetro cuadrilatero;
        float lado1, lado2;
        
        lado1=Float.parseFloat(JOptionPane.showInputDialog("Escriba el valor del lado 1"));
        lado2=Float.parseFloat(JOptionPane.showInputDialog("Escriba el valor del lado 2"));
        if (lado1==lado2){
            cuadrilatero = new EjercicioAreaPerimetro(lado1);
        }
        else{
            cuadrilatero = new EjercicioAreaPerimetro(lado1,lado2);
        }
        System.out.println("El perimetro es: "+cuadrilatero.getPerimetro());
        System.out.println("El area es: "+cuadrilatero.getArea());
    }
    
}
