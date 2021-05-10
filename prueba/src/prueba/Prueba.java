
package prueba;


public class Prueba { 

   
    public static void main(String[] args) {
        // TODO code application logic here
        int [] age = {12, 4, 5, 2, 5};
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age[3]);
        System.out.println(age[4]);
        for (int i = 0; i < 5; ++i) {
            System.out.println(" Elemento en el index " + i +": " + age[i]);
        }
    }
    
}
