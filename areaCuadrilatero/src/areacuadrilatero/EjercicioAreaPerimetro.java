/*
Calcular el perímetro de un cuadrilatero, pero en base a si la medida de sus lados son iguales, 
sólo soliciitara uno o dos lados
*/
package areacuadrilatero;


public class EjercicioAreaPerimetro {
    private float lado1,lado2;

    public EjercicioAreaPerimetro(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public EjercicioAreaPerimetro(float lado1) {
        this.lado1 = this.lado2=lado1;
    }
    public float getPerimetro(){
        float perimetro=2*(lado1+lado2);
        return perimetro;
    }
    public float getArea(){
        float area=lado1*lado2;
        return area;
    }
}
