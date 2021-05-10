
package integral;
import java.sql.*;

public class connBD {
    Connection conexion = null;
    Statement st = null;
    ResultSet rs = null;

 

    public void Conectar(){

        try{
            Class.forName("com.mysql.jdbc.Driver");
            String ruta = "jdbc:mysql://localhost:3306/ventas";
            conexion = DriverManager.getConnection(ruta, "root", "");
            st = conexion.createStatement();

        }catch(Exception ex){

            System.out.println("Ha habido un fallo en la conexion a la BD : "+ex.getMessage());

        }

    }

      public static void main(String[]args){

        connBD op = new connBD();
        try{
            
            op.Conectar();
            
            String sql = "SELECT nombre, costo FROM productos";
            op.rs = op.st.executeQuery(sql);
            
            while(op.rs.next()){
                System.out.println("Nombre: "+op.rs.getString("nombre")+" | Precio: "+op.rs.getString("costo"));
            }       
            
        }catch(Exception ex){
            System.out.println("Ha habido un fallo en la conexion a la BD : "+ex.getMessage());
        }finally{
            try{
                op.conexion.close();
                op.st.close();
                op.rs.close();
            }catch(Exception ex){}
        }

    }
    
}
