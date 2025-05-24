package Interfaces;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import conexionsql.Conexion;

public class ClaseTest {

    public static DefaultTableModel Listar(String filtro) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripcion"); // Add the "Descripcion" column

        try {
            Statement sqlcon = Conexion.getConnection().createStatement();
            String Consulta = "SELECT id, nombre, Descripcion FROM dbo.Producto"; // Correct column name
            ResultSet resultado = sqlcon.executeQuery(Consulta);

            while (resultado.next()) {
                modelo.addRow(new Object[]{
                    resultado.getInt("id"),
                    resultado.getString("nombre"),
                    resultado.getString("Descripcion")
                });
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }

        return modelo;
    }

    public static void ListarConsole(String filtro) {
        try {
            Statement sqlcon = Conexion.getConnection().createStatement();
            String Consulta = "SELECT id, nombre, descripcion FROM dbo.Producto";

            ResultSet resultado = sqlcon.executeQuery(Consulta);
            System.out.println("ID | Nombre | Descripcion");
            while (resultado.next()) {
                System.out.print(resultado.getInt(1) + " | ");
                System.out.print(resultado.getString(2) + " | ");
                System.out.println(resultado.getString(3));
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
    }

    public static void Agregar(String nombre, String descripcion) {
        try {
            PreparedStatement statement
                    = Conexion.getConnection().prepareStatement("INSERT INTO Producto VALUE(?)");
            statement.setString(1, "Cosa X2");
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e.toString());
        }
    }

    public static void Modificar(int ID, String NombreModificado) {
        try {
            PreparedStatement statement
                    = Conexion.getConnection().prepareStatement("UPDATE Producto SET nombre = ? WHERE id = ?");
            statement.setString(1, NombreModificado);
            statement.setInt(2, ID);
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
    }

    public static void Eliminar(int ID) {
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement("DELETE FROM Producto WHERE id = ?");
            statement.setInt(1, ID);
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
    }

}
