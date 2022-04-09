import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
   public static Connection miConexion;
   
   public static Connection getConection() {
	   try {
		   Runtime.getRuntime().addShutdownHook(new getCerrar());
		   if(miConexion == null) {
			   Class.forName("com.mysql.jdbc.Driver");
			   miConexion = DriverManager.getConnection("jdbc:mysql://localhost/programacion1", "root", "*010405");
		   }
		   
		   return miConexion;
	   }
	   catch(ClassNotFoundException | SQLException e){
		   throw new RuntimeException("No se Pudo Establecer la Conexion a MySQL",e);
	   }
   }
  static class getCerrar extends Thread{
	  @Override
	  public void run() {
		  try {
			  Connection conn = Conexion.getConection();
			  conn.close();
		  }
		  catch(SQLException ex){
			  throw new RuntimeException(ex);
		  }
	  }
  }

}
