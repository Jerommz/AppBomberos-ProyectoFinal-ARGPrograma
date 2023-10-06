package bomberos.AccesoADatos;

import java.sql.Connection;
import bomberos.AccesoAdatos.Conexion;
import bomberos.Entidades.Bombero;
import bomberos.Entidades.Cuartel;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CuartelData {

    //atributos necesarios para los metodos utilizados
    private final Connection con;

    //constructor vacio
    public CuartelData() {
        con = Conexion.getConnection();
    }

//   public Map<String, Object> obtenerInformacionBrigadas(int idCuartel) {
//    Map<String, Object> resultado = new HashMap<>();
//    List<Brigada> brigadas = new ArrayList<>();
//    int cantidadBrigadas = 0;
//
//    // Consulta SQL para obtener la cantidad de brigadas y la información de las brigadas
//    String sql = "SELECT COUNT(*) AS cantidad, b.codBrigada, b.nombre_br" +
//                 "FROM brigada b" +
//                 "INNER JOIN cuartel c ON b.codCuartel = c.codCuartel" +
//                 "WHERE c.codCuartel = ?";
//
//    try {
//        PreparedStatement ps = con.prepareStatement(sql);
//        ps.setInt(1, idCuartel);
//        ResultSet rs = ps.executeQuery();
//
//        while (rs.next()) {
//            cantidadBrigadas = rs.getInt("cantidad");
//            int codBrigada = rs.getInt("codBrigada");
//            String nombre = rs.getString("nombre_br");
//
//            Brigada brigada = new Brigada();
//            brigada.setCodBrigada(codBrigada);
//            brigada.setNombre_br(nombre);
//
//            brigadas.add(brigada);
//        }
//
//        resultado.put("cantidadBrigadas", cantidadBrigadas);
//        resultado.put("brigadas", brigadas);
//    } catch (SQLException ex) {
//        JOptionPane.showMessageDialog(null, "Error al querer obtener brigadas: " + ex.getMessage());
//    }
//
//    return resultado;
//}
    public void nuevoCuartel(Cuartel cuartel) {
        //query insertar bombero en la base de datos
        String sql = "insert into cuartel(nombre_cuartel, direccion, coord_X, coord_Y, telefono, correo)"
                + "VALUES (?, ?, ?, ?, ?, ?)";
        try {
            //envio de query a la base de datos
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cuartel.getNombre_cuartel());
            ps.setString(2, cuartel.getDireccion());
            ps.setInt(3, cuartel.getCoord_X());
            ps.setInt(4, cuartel.getCoord_Y());
            ps.setString(5, cuartel.getTelefono());
            ps.setString(6, cuartel.getCorreo());
            int exito = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                //seteo de idbombero en bomberoData
                cuartel.setCodCuartel(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cuartel agregado.");
            } else {
                JOptionPane.showMessageDialog(null, "Cuartel no agregado.");
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
    }
    
    public void modificarCuartel(Cuartel cuartel) {
        //query update bombero en la base de datos
        String sql = "update cuartel set nombre_cuartel = ?, direccion = ?, coord_X = ?, "
                + "coord_Y = ?, telefono = ?, correo = ? WHERE codCuartel =?";
        try {
            //envio de query a la base de datos
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cuartel.getNombre_cuartel());
            ps.setString(2, cuartel.getDireccion());
            ps.setInt(3, cuartel.getCoord_X());
            ps.setInt(4, cuartel.getCoord_Y());
            ps.setString(5, cuartel.getTelefono());
            ps.setString(6, cuartel.getCorreo());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Cuartel modificado");
            } else {
                JOptionPane.showMessageDialog(null, "Cuartel no modificado.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
    }

    public List<Cuartel> obtenerCuarteles() {
        List<Cuartel> cuarteles = new ArrayList<>();
        String sql = "select * from cuartel";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cuartel cuartel = new Cuartel();
                cuartel.setNombre_cuartel(rs.getString("nombre_cuartel"));
                cuartel.setDireccion(rs.getString("direccion"));
                cuartel.setCoord_X(rs.getInt("coord_X"));
                cuartel.setCoord_Y(rs.getInt("coord_Y"));
                cuartel.setTelefono(rs.getString("telefono"));
                cuartel.setCorreo(rs.getString("correo"));
                cuarteles.add(cuartel);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
        return cuarteles;
    }

}
