package bomberos.AccesoADatos;

import java.sql.Connection;
import bomberos.AccesoAdatos.Conexion;
import bomberos.Entidades.Brigada;
import bomberos.Entidades.Cuartel;
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
    private Cuartel cuartel;

    //constructor vacio
    public CuartelData() {
        con = Conexion.getConnection();
    }

    

    public void nuevoCuartel(Cuartel cuartel) {
        String sql = "INSERT INTO cuartel(nombre_cuartel, direccion, coord_X, coord_Y, telefono, correo) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cuartel.getNombre_cuartel());
            ps.setString(2, cuartel.getDireccion());
            ps.setInt(3, cuartel.getCoord_X());
            ps.setInt(4, cuartel.getCoord_Y());
            ps.setInt(5, cuartel.getTelefono());
            ps.setString(6, cuartel.getCorreo());
            int exito = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "cuartel creado");
            } else {
                JOptionPane.showMessageDialog(null, "no se a puede cargar el cuartel ");

            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error en el sql del crear cuartel");
        }
    }

    public void modificarCuartel(Cuartel cuartel) {
        String sql = "UPDATE cuartel SET nombre_cuartel=?,direccion=?,coord_X=?,coord_Y=?,telefono=?,correo=? WHERE codCuartel =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cuartel.getNombre_cuartel());
            ps.setInt(2, cuartel.getCoord_X());
            ps.setString(3, cuartel.getDireccion());
            ps.setInt(4, cuartel.getCoord_Y());
            ps.setInt(5, cuartel.getTelefono());
            ps.setString(6, cuartel.getCorreo());
            ps.setInt(7, cuartel.getCodCuartel());
            int exito = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "cuartel modificado");
            } else {
                JOptionPane.showMessageDialog(null, "el cuartel no se modifico");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al cargar sql de modificar cuartel");
        }

    }

    public void eliminarCuartel(int codCuartel) {
        String sql = "delete cuartel where codCuartel =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cuartel.getCodCuartel());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "se elimno fisicamente este cuartel " + cuartel.getNombre_cuartel());
            } else {
                JOptionPane.showMessageDialog(null, "el cuartel no pudo ser eliminado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error en sql de eliminar cuartel");
        }

    }

    public void contarBrigadas( int codCuartel) {
        String sql = "SELECT b.codbrigada, COUNT(*) "
                + "FROM brigada AS b"
                + "INNER JOIN cuartel AS c ON b.codcuartel = c.codcuartel"
                + "WHERE c.codcuartel = ?"
                + "GROUP BY b.codbrigada";
        try {
            
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setInt(1, cuartel.getCodCuartel());
            int exito =ps.executeUpdate();
            ResultSet rs =ps.getGeneratedKeys();
            if(rs.next()){
            int count =rs.getInt("count");
            JOptionPane.showMessageDialog(null, "las brigadas en este cuartel son"+count);
            
            }else {
            JOptionPane.showMessageDialog(null, "no se pudo encontrar brigada en este cuartel"+cuartel.getNombre_cuartel());
            
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error en el sql de contar brigadas en el cuartel");
        }
    }
    
    public List<Cuartel> obtenerCuarteles(){
        List<Cuartel> cuarteles = new ArrayList<>();
        String sql = "select * from cuartel";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cuartel cuartel = new Cuartel();
                cuartel.setCodCuartel(rs.getInt("codCuartel"));
                cuartel.setNombre_cuartel(rs.getString("nombre_cuartel"));
                cuartel.setDireccion(rs.getString("direccion"));
                cuartel.setCoord_X(rs.getInt("coord_X"));
                cuartel.setCoord_X(rs.getInt("coord_Y"));
                cuartel.setTelefono(rs.getInt("telefono"));
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
   
    public Cuartel buscarCuartel(int codCuartel){
        String sql = "select nombre_cuartel, direccion, coord_X, coord_Y, telefono, correo from cuartel where codCuartel = ?";
        Cuartel cuartel = new Cuartel();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codCuartel);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cuartel.setCodCuartel(codCuartel);
                cuartel.setNombre_cuartel(rs.getString("nombre_cuartel"));
                cuartel.setDireccion(rs.getString("direccion"));
                cuartel.setCoord_X(rs.getInt("coord_X"));
                cuartel.setCoord_X(rs.getInt("coord_Y"));
                cuartel.setTelefono(rs.getInt("telefono"));
                cuartel.setCorreo(rs.getString("correo"));
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.1");
        }
        return cuartel;
    }
}
