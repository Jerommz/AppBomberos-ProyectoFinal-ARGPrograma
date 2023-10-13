package bomberos.AccesoAdatos;

import bomberos.Entidades.Bombero;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BomberoData {

    private final Connection con;
    private Bombero bombero;
    private BomberoData briDB;

    public BomberoData() {
        con = Conexion.getConnection();
    }

    public void nuevoBombero(Bombero bombero) {
        String sql = "insert into bombero(dni, nombre_ape, grupo_sang, fecha, celular, codBrigada, estado)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, bombero.getDni());
            ps.setString(2, bombero.getNombre_ape());
            ps.setString(3, bombero.getGrupo_sang());
            ps.setDate(4, Date.valueOf(bombero.getFecha()));
            ps.setInt(5, bombero.getCelular());
            ps.setInt(6, bombero.getCodBrigada());
            ps.setBoolean(7, bombero.isEstado());
            int exito = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                bombero.setId_Bombero(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Bombero agregado.");
            } else {
                JOptionPane.showMessageDialog(null, "Bombero no agregado.");
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
    }

    public void modificarBombero(Bombero bombero) {
        String sql = "update bombero set dni = ?, nombre_ape = ?, grupo_sang = ?, "
                + "fecha = ?, celular = ?, codBrigada = ?, estado = ? WHERE id_bombero =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, bombero.getDni());
            ps.setString(2, bombero.getNombre_ape());
            ps.setString(3, bombero.getGrupo_sang());
            ps.setDate(4, Date.valueOf(bombero.getFecha()));
            ps.setInt(5, bombero.getCelular());
            ps.setInt(6, bombero.getCodBrigada());
            ps.setBoolean(7, bombero.isEstado());
            ps.setInt(8, bombero.getId_Bombero());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Datos modificados");
            } else {
                JOptionPane.showMessageDialog(null, "Datos no modificados.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
    }

    public void eliminarBombero(int dni) {
        String sql = "update bombero set estado = 0 where dni = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Bombero dado de baja.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
    }

    public void asignarBrigada(int codBrigada, int id_bombero) {
        try {
            String sql1 = "SELECT COUNT(*)FROM bombero WHERE codBrigada =? AND estado =1";

            PreparedStatement ps = con.prepareStatement(sql1);

            ps.setInt(1, codBrigada);

            ResultSet rs;

            rs = ps.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);
                System.out.println("Cantidad de bomberos en la brigada: " + count);
                if (count < 5) {
                    asignarBomberoABrigada(codBrigada, id_bombero);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al cargar el bombero a brigada" + ex);
        }

    }

    public void asignarBomberoABrigada(int codBrigada, int id_bombero) {
        String sql = "UPDATE bombero set codBrigada =? where id_bombero =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codBrigada);
            ps.setInt(2, id_bombero);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "bombero asignado");

            } else {
                JOptionPane.showMessageDialog(null, "el bombero no se pudo asignar a la brigada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al cargar asignacion bombero" + ex);
        }

    }

    public List<Bombero> listarBomberos(int codBrigada) {
        String sql = "SELECT  id_bombero,dni, nombre_ape, grupo_sang, fecha, celular,  estado FROM bombero WHERE codBrigada =?";
        List<Bombero> bomberos = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codBrigada);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Bombero bombero = new Bombero();
                bombero.setId_Bombero(rs.getInt("id_bombero"));
                bombero.setNombre_ape(rs.getString("nombre_ape"));
                bombero.setGrupo_sang(rs.getString("grupo_sang"));
                bombero.setFecha(rs.getDate("fecha").toLocalDate());
                bombero.setCelular(rs.getInt("celular"));
                bombero.setEstado(rs.getBoolean("estado"));
                bomberos.add(bombero);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error en sql en listar bomberos ");
        }
        return bomberos;
    }

    public Bombero buscarBomberoPorDni(int dni) {
        String sql = "select id_bombero, nombre_ape, grupo_sang, fecha, celular, codBrigada from bombero where dni = ? and estado = 1";
        bombero = new Bombero();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                bombero.setId_Bombero(rs.getInt("id_bombero"));
                bombero.setDni(dni);
                bombero.setNombre_ape(rs.getString("nombre_ape"));
                bombero.setGrupo_sang(rs.getString("grupo_sang"));
                bombero.setFecha(rs.getDate("fecha").toLocalDate());
                bombero.setCelular(rs.getInt("celular"));
                bombero.setCodBrigada(rs.getInt("codBrigada"));
                bombero.setEstado(true);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.1");
        }
        return bombero;
    }
}
