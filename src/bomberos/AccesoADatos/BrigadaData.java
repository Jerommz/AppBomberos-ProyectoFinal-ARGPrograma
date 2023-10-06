package bomberos.AccesoADatos;

import bomberos.AccesoAdatos.Conexion;
import bomberos.Entidades.Bombero;
import bomberos.Entidades.Brigada;
import java.util.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BrigadaData {

    //atributos necesarios para los metodos utilizados
    private final Connection con;
    private Bombero bombero;
    private Brigada brigada;
    //constructor vacio
    public BrigadaData() {
        con = Conexion.getConnection();
    }

    public void nuevaBrigada(Brigada brigada) {
        String sql = "insert into brigada( nombre_br, especialidad, libre, codCuartel)"
                + "VALUES (?, ?, ?, ?)";
        try {
            //envio de query a la base de datos
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, brigada.getNombre_br());
            ps.setString(2, brigada.getEspecialidad());
            ps.setBoolean(3, brigada.isLibre());
            ps.setInt(4, brigada.getCodCuartel());
            int exito = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                //seteo de idbombero en bomberoData
                brigada.setCodBrigada(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Brigada agregada.");
            } else {
                JOptionPane.showMessageDialog(null, "Brigada no agregada.");
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
    }

    public List<Brigada> obtenerBrigadas(){
        List<Brigada> brigadas = new ArrayList<>();
        String sql = "select * from brigada";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Brigada brigada = new Brigada();
                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setNombre_br(rs.getString("nombre_br"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.isLibre();
                brigada.setCodCuartel(rs.getInt("codCuartel"));
                brigadas.add(brigada);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
        return brigadas;
    }

    public void ocuparBrigada(boolean check, int codBrigada) {
        String sql = "update brigada set libre = ? where codBrigada = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, check);
            ps.setInt(2, codBrigada);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Brigada " + codBrigada + " en camino.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
    }

    public void disponibilidadBrigada(int codBrigada) {
        String sql = "select libre from brigada where codBrigada = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codBrigada);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                boolean estado = rs.getBoolean("libre");
                if (estado == true) {
                    JOptionPane.showMessageDialog(null, "Brigada disponible.");
                } else {
                    JOptionPane.showMessageDialog(null, "Brigada no disponible.");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
    }

    public void cambiarEspecialidadBrigada(String especialidad, int codBrigada) {
        String sql = "update brigada set especialidad = ? where codBrigada = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, especialidad);
            ps.setInt(2, codBrigada);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Especialidad actualizada.");
            } else {
                JOptionPane.showMessageDialog(null, "Especialidad no actualizada.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
    }

    public String obtenerEspecialidadBrigada(int codBrigada) {
        String especialidad = null;
        String sql = "select especialidad from brigada where codBrigada = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codBrigada);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                especialidad = rs.getString("especialidad");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
        return especialidad;
    }
    
    public int cantCuarteles(int codCuartel) {
        int cantidad = 0;
        try {
            String sql1 = "SELECT COUNT(*)FROM brigada WHERE codCuartel = ?";
            PreparedStatement ps = con.prepareStatement(sql1);
            ps.setInt(1, codCuartel);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cantidad = rs.getInt(1);
//                JOptionPane.showMessageDialog(null, "Cantidad de brigadas en el cuartel: " + cantidad);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al asignar bombero.");
        }
        return cantidad;
    }
}


