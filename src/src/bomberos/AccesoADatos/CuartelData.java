
package bomberos.AccesoADatos;

import java.sql.Connection;
import bomberos.AccesoAdatos.Conexion;
import bomberos.Entidades.Brigada;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CuartelData {
    //atributos necesarios para los metodos utilizados
    private final Connection con;

    //constructor vacio
    public CuartelData() {
        con = Conexion.getConnection();
    }
   public Map<String, Object> obtenerInformacionBrigadas(int idCuartel) {
    Map<String, Object> resultado = new HashMap<>();
    List<Brigada> brigadas = new ArrayList<>();
    int cantidadBrigadas = 0;

    // Consulta SQL para obtener la cantidad de brigadas y la información de las brigadas
    String sql = "SELECT COUNT(*) AS cantidad, b.codBrigada, b.nombre_br" +
                 "FROM brigada b" +
                 "INNER JOIN cuartel c ON b.codCuartel = c.codCuartel" +
                 "WHERE c.codCuartel = ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idCuartel);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            cantidadBrigadas = rs.getInt("cantidad");

            int codBrigada = rs.getInt("codBrigada");
            String nombre = rs.getString("nombre_br");

            Brigada brigada = new Brigada();
            brigada.setCodBrigada(codBrigada);
            brigada.setNombre_br(nombre);

            brigadas.add(brigada);
        }

        resultado.put("cantidadBrigadas", cantidadBrigadas);
        resultado.put("brigadas", brigadas);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al querer obtener brigadas: " + ex.getMessage());
    }

    return resultado;
}
 
}