
package prueba;

import java.util.Scanner;

public class libros{  //Este es el nombre de la clase  
    

    
public static int suma=0, bono=0, cont10=0, calf;    //Valores enteros que determinan un número base a modificar.
public static String aImprimir="El alumno obtuvo las siguientes calificaciones: \n", mat;  //Los datos mostrados serán en vertical.
public static void solMatCal(){   //Supongo que una nueva función
	System.out.println("Ingrese una materia");   //Se le pide la materia inicial al usuario.
	Scanner f= new Scanner(System.in);  //Se implementa un escáner
	mat=f.nextLine();  //El dato siguiente irá debajo del anterior.	
	System.out.println("Calificación del alumno en la materia de "+ mat +"?");  //Se le pide al alumno la calificación de la matería que eligió
	calf=f.nextInt();  //Consiguientemente, se muestra la calificación
	aImprimir=aImprimir+mat+" = "+calf+"\n";  //Se muestra el nombre de la materia y la calificación
	suma=suma+calf;  //Se suma el valor "suma" y la calificación que se coloque.
	bono(calf);  //Se establece que el "bono" es equivalente a alguna calificación
}
public static void bono(int calificacion){    //Se establece la función de "bono"
	if(calificacion==10){  //Sí la calificación es 10 a "bono" se le suman 200 pesos.
		cont10++;
		bono=bono+200;
	}
}
public static void main(String[]args){  //No entiendo esta parte
	solMatCal();
	solMatCal();
	solMatCal();
	solMatCal();
	solMatCal();  //Hasta acá
	double promedio=suma/5;
	int total=800+bono;
	System.out.println("Su beca total del mes de marzo es: $800.00"+" con "+cont10+" calificaciones perfectas obtuvo un bono de: $"+bono+".00");    //Se presenta el total de la beca  
	System.out.println("El total del mes de abril a pagar es: $"+total+".00");  //Se menciona lo que el usuario o alumno debe pagar
	System.out.println(aImprimir);  //Se enlistan las calificaciones juntos a los nombres de la materia.
	System.out.println("El promedio del alumno fue de: "+promedio);     //Se presenta el promedio del alumno.
	}
}