package bomberos.AccesoADatos;

import bomberos.AccesoAdatos.Conexion;
import bomberos.Entidades.Brigada;
import java.util.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BrigadaData {

    private final Connection con;

    public BrigadaData() {
        con = Conexion.getConnection();
    }

    public void nuevaBrigada(Brigada brigada) {
        String sql = "insert into brigada(nombre_br, especialidad, libre, codCuartel)"
                + "VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, brigada.getNombre_br());
            ps.setString(2, brigada.getEspecialidad());
            ps.setBoolean(3, brigada.isLibre());
            ps.setInt(4, brigada.getCodCuartel());
            int exito = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                brigada.setCodBrigada(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Brigada agregada con numero: " + brigada.getCodBrigada() );
            } else {
                JOptionPane.showMessageDialog(null, "Brigada no agregada.");
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
    }

    public void modificarBrigada(Brigada brigada) {
        String sql = "update brigada set nombre_br = ?, especialidad = ?,libre = ?, codCuartel = ? WHERE codBrigada = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, brigada.getNombre_br());
            ps.setString(2, brigada.getEspecialidad());
            ps.setBoolean(3, brigada.isLibre());
            ps.setInt(4, brigada.getCodCuartel());
            ps.setInt(5, brigada.getCodBrigada());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Brigada modificada.");
            } else {
                JOptionPane.showMessageDialog(null, "Brigada no modificada.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
    }

    public void eliminarBrigada(int codBrigada) {
        String sql = "delete from brigada where codBrigada = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codBrigada);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Brigada eliminada.");
            } else {
                JOptionPane.showMessageDialog(null, "Brigada no eliminada.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
    }

    public List<Brigada> obtenerBrigadas() {
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
            ps.close();
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
            ps.close();
            rs.close();
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
            ps.close();
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
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
        return especialidad;
    }

    public Brigada buscarBrigada(int codBrigada) {
        String sql = "select nombre_br, especialidad, libre, codCuartel from brigada where codBrigada = ?";
        Brigada brigada = new Brigada();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codBrigada);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                brigada.setCodBrigada(codBrigada);
                brigada.setNombre_br(rs.getString("nombre_br"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(rs.getBoolean("libre"));
                brigada.setCodCuartel(rs.getInt("codCuartel"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro brigada con ese codigo, pruebe con uno diferente.");
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
        return brigada;
    }

    public List<Brigada> listarBrigadasDeCuartel(int codCuartel) {
        List<Brigada> brigadas = new ArrayList<>();
        String sql = "SELECT * FROM brigada WHERE codCuartel = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codCuartel);
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

    public List<Brigada> obtenerBrigadaCuartel(int codCuartel) {
        List<Brigada> brigadas = new ArrayList<>();
        Brigada brigada = new Brigada();
        String sql = "SELECT * FROM brigada WHERE codCuartel = ? AND libre = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codCuartel);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setNombre_br(rs.getString("nombre_br"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(rs.getBoolean("libre"));
                brigada.setCodCuartel(codCuartel);
                brigadas.add(brigada);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
        return brigadas;
    }
     public List<Brigada> obtenerBrigadasLibres() {
        List<Brigada> brigadas = new ArrayList<>();
        String sql = "select * from brigada where libre =0";
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
}
