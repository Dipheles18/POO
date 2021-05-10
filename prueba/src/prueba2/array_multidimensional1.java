
package prueba2;

import java.util.Arrays;

public class array_multidimensional1 {
    public static void main(String[] args) {
    int [][] am = {
        {1,2,3},
        {4,5,6,9},
        {7},
        }; {  
     for (int i = 0; i < am.length; ++i) {
for(int j = 0; j < am[i].length; ++j) {
System.out.println(am[i][j]);
}    
}
}
}
}