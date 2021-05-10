package integral;
import java.sql.*;

public class registro {
    private Connection conexion = null;
    private Statement st = null;
    private ResultSet rs = null;

 

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

        registro op = new registro();
        try{
            
            op.Conectar();
            
            String sql = "SELECT nombreUsuario FROM usuarios where Clave='1234'";
            op.rs = op.st.executeQuery(sql);
            
            while(op.rs.next()){
                System.out.println("Nombre: "+op.rs.getString("nombreUsuario"));
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
