package conexionsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection getConnection() {

        String cadena = "jdbc:sqlserver://10.21.12.37;"
                + "database=243477;"
                + "user=243477;"
                + "password=12345678;"
                + "loginTimeout=3;";
        try {
            Connection con = DriverManager.getConnection(cadena);
            return con;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
            return null;
        }
    }

}
