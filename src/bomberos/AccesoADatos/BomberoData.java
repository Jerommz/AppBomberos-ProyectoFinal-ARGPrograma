package bomberos.AccesoAdatos;

import bomberos.Entidades.Bombero;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

public class BomberoData {

    //atributos necesarios para los metodos utilizados
    private final Connection con;
    private Bombero bombero;
    private BomberoData briDB;

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
                + "fecha = ?, celular = ?, codBrigada = ?, estado = ? WHERE id_bombero =?";
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
            ps.setInt(8, bombero.getId_Bombero());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Bombero modificado");
            } else {
                JOptionPane.showMessageDialog(null, "Bombero no modificado.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
    }

    //metodo eliminar bombero
    public void bajaBombero(int dni) {
        //query dar de baja bombero
        String sql = "update bombero set estado = 0, codBrigada = null where dni = ?";
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
    
    public void altaBombero(int dni) {
        //query dar de baja bombero
        String sql = "update bombero set estado = 1 where dni = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Bombero dado de alta.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
    }
    
    public void dispoBrigada(int codBrigada, int id_bombero) {
        try {
            String sql1 = "SELECT COUNT(*)FROM bombero WHERE codBrigada = ? AND estado = 1";
            PreparedStatement ps = con.prepareStatement(sql1);
            ps.setInt(1, codBrigada);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                JOptionPane.showMessageDialog(null, "Cantidad de bomberos en la brigada: " + count);
                if (count < 5) {
                    asignarBomberoABrigada(codBrigada, id_bombero);
                }else{
                    JOptionPane.showMessageDialog(null, "Brigada completa.");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al asignar bombero.");
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
                JOptionPane.showMessageDialog(null, "Bombero asignado a la brigada " + codBrigada);

            } else {
                JOptionPane.showMessageDialog(null, "El bombero no se pudo asignar a la brigada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al asignar bombero.");
        }
    }
<<<<<<< Updated upstream
    
    public void cantBomberos(){
        
=======

    public List<Bombero> obtenerBombXBrig(int codBrigada) {
        List<Bombero> bomberos = new ArrayList<>();
        String sql = "SELECT codBrigada, COUNT(*) FROM bombero WHERE codBrigada=? AND estado=1 group by codBrigada;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codBrigada);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Bombero bombero = new Bombero();
                bombero.setCodBrigada(rs.getInt("codBrigada"));
                int codbrig =  rs.getInt(1);
                int cantidad = rs.getInt(2);
                bomberos.add(bombero);
                JOptionPane.showMessageDialog(null, "La brigada "+ codbrig +" tiene/n "+cantidad + " bomberos");
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
        return bomberos;
>>>>>>> Stashed changes
    }
}
