package bomberos.AccesoAdatos;

import bomberos.Entidades.Bombero;
import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BomberoData {

    //atributos necesarios para los metodos utilizados
    private final Connection con;

    //constructor vacio
    public BomberoData() {
        con = Conexion.getConnection();
    }

    //metodo nuevo bombero
    public void nuevoBombero(Bombero bombero) {
        //query insertar bombero en la base de datos
        String sql = "insert into bombero(dni, nombre_ape, grupo_sang, fecha, celular, codBrigada, estado)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            //envio de query a la base de datos
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, bombero.getDni());
            ps.setString(2, bombero.getNombre_ape());
            ps.setString(3, bombero.getGrupo_sang());
            ps.setDate(4, Date.valueOf(bombero.getFecha()));
            ps.setString(5, bombero.getCelular());
            ps.setInt(6, bombero.getCodBrigada());
            ps.setBoolean(7, bombero.isEstado());
            int exito = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                //seteo de idbombero en bomberoData
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

    //metodo modificar bombero
    public void modificarBombero(Bombero bombero) {
        //query update bombero en la base de datos
        String sql = "update bombero set dni = ?, nombre_ape = ?, grupo_sang = ?, "
                + "fecha = ?, celular = ?, codBrigada = ?, estado = ?";
        try {
            //envio de query a la base de datos
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, bombero.getDni());
            ps.setString(2, bombero.getNombre_ape());
            ps.setString(3, bombero.getGrupo_sang());
            ps.setDate(4, Date.valueOf(bombero.getFecha()));
            ps.setString(5, bombero.getCelular());
            ps.setInt(6, bombero.getCodBrigada());
            ps.setBoolean(7, bombero.isEstado());
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

    //metodo eliminar bombero
    public void eliminarBombero(int dni) {
        //query dar de baja bombero
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

    public void asignarBombero(Bombero bombero) {
        //query validacion cantidad de bombero asignados a una brigada en la base de datos (menor a 5)
        String sqlcon = "SELECT COUNT(*) FROM bombero WHERE codBrigada =? null AND estado=1";
        try {
            //envio de query a la base de datos
            PreparedStatement ps1 = con.prepareStatement(sqlcon);
            ps1.setInt(1, bombero.getCodBrigada());
            ResultSet rs = ps1.executeQuery();
            int exitocon = rs.getInt(1);
            if (exitocon <5) {
                String sql = "update bombero set codBrigada = ? WHERE id_bombero = ?";
                try {
                    //envio de query a la base de datos
                    PreparedStatement ps2 = con.prepareStatement(sql);
                    ps2.setInt(1, bombero.getCodBrigada());
                    ps2.setInt(2, bombero.getId_Bombero());
                    int exito = ps2.executeUpdate();
                    if (exito == 1) {
                        JOptionPane.showMessageDialog(null, "Bombero asignado a la brigada");
                    } else {
                        JOptionPane.showMessageDialog(null, "El bombero no se pudo asignar a la brigada");
                    }
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
                }
                ps1.close();
            } else {
            JOptionPane.showMessageDialog(null, "La brigada esta completa");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
        
    }
}
