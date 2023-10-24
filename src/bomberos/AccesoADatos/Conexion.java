package bomberos.AccesoAdatos;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String url = "jdbc:mariadb://localhost/";
    private static final String dataBase = "bomberos";
    private static final String user = "root";
    private static final String pass = "";
    private static Connection connection;

    public Conexion() {
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = (Connection) DriverManager.getConnection(url + dataBase + "?useLegacyDatetimeCode=false&serverTimezone=UTC" + "&user=" + user + "&password=" + pass);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la DB " + ex.getMessage());
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers " + ex.getMessage());
            }
        }
        return connection;
    }
}
