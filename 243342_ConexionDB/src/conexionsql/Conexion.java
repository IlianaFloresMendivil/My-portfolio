package conexionsql;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {

    public static Connection getConexConnection() {
        String cadena = "jdbc:sqlserver:PC16;"
                + "database=243298_DB;"
                + "user=ILI243298;"
                + "password=123;"
                + "loginTimeout=10";
        try {
            Connection con = DriverManager.getConnection(cadena);
            return con;
        } catch (Exception ex) {
            System.out.println("Error: " + ex.toString());
            return null;
        }
    }
}
