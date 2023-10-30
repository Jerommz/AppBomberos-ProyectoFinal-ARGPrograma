package bomberos.AccesoADatos;

import bomberos.AccesoAdatos.Conexion;
import bomberos.Entidades.Brigada;
import java.util.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BrigadaData {

    Brigada brigad = new Brigada();
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
                JOptionPane.showMessageDialog(null, "Brigada agregada con Código N°: " + brigada.getCodBrigada());
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
            System.out.println(brigada.getNombre_br());
            ps.setString(2, brigada.getEspecialidad());
            System.out.println(brigada.getEspecialidad());
            ps.setBoolean(3, brigada.isLibre());
            System.out.println(brigada.isLibre());
            ps.setInt(4, brigada.getCodCuartel());
            System.out.println(brigada.getCodCuartel());
            ps.setInt(5, brigada.getCodBrigada());
            System.out.println(brigada.getCodBrigada());
            int exito = ps.executeUpdate();
            System.out.println(exito);
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
        String sql = "select * from brigada GROUP BY nombre_br";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Brigada brigada = new Brigada();
                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setNombre_br(rs.getString("nombre_br"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(rs.getBoolean("libre"));
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

            if (check) {
                ps.setInt(1, 0); // Set libre to 0 for ocupado
                ps.setInt(2, codBrigada);
                int exito = ps.executeUpdate();
                if (exito == 1) {

                    JOptionPane.showMessageDialog(null, "Brigada " + codBrigada + " en camino.");
                } else {
                    JOptionPane.showMessageDialog(null, "Hubo un problema al ocupar la brigada.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una brigada libre.");
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

    public List<Brigada> listarBrigadas(int codCuartel) {
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
                brigada.setLibre(rs.getBoolean("libre"));
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

    public List<Brigada> obtenerBrigadasLibres() {
        List<Brigada> brigadas = new ArrayList<>();
        String sql = "select * from brigada where libre =1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Brigada brigada = new Brigada();
                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setNombre_br(rs.getString("nombre_br"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(rs.getBoolean("libre"));
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

    public void desocuparBrigada(int codBrigada) {
    String sql = "update brigada set libre = ? where codBrigada = ?";
    try {
        PreparedStatement ps = con.prepareStatement(sql);

        // Establecer el valor de la columna 'libre' a 1 para indicar que está libre
        ps.setInt(1, 1); // Aquí se asume que 1 representa 'libre'
        ps.setInt(2, codBrigada);
        int exito = ps.executeUpdate();
        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Brigada " + codBrigada + " Esta brigada quedó libre");
        } else {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en desocupar brigada.");
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
    }
}


}
