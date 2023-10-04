package bomberos.AccesoAdatos;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Conexion {

    //atributos necesarios para la base de datos
    private static final String url = "jdbc:mariadb://localhost/";
    private static final String dataBase = "bomberos";
    private static final String user = "root";
    private static final String pass = "";
    private static Connection connection;

    //constructor vacio
    public Conexion() {
    }

    //metodo connection para conectar a la base de datos
    public static Connection getConnection() {
        //comprobacion si conexion es null
        if (connection == null) {
            try {
                //conexion al driver
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
