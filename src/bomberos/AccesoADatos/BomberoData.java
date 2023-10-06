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
  // query para asignar y contar los bomberos 
    public void asignarBrigada(int codBrigada, int id_bombero) {
        try {
            String sql1 = "SELECT COUNT(*)FROM bombero WHERE codBrigada =? AND estado =1";

            PreparedStatement ps = con.prepareStatement(sql1);

            ps.setInt(1, codBrigada);
            ps.setInt(2, id_bombero);
            ResultSet rs;

            rs = ps.executeQuery();

            int cargado = rs.getInt(1);
            if (cargado <= 5) {
            briDB.AsignarBomberoABrigada(bombero.getCodBrigada(), bombero.getId_Bombero());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al cargar el bombero a brigada" + ex);
        }
       

    }
    public void AsignarBomberoABrigada(int codBrigada,int id_bombero){
    String sql ="UPDATE bombero set codBrigada =? where id_bombero =?";
       try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,bombero.getCodBrigada());
            ps.setInt(2, bombero.getId_Bombero());
            int exito=ps.executeUpdate();
            if(exito==1){
            JOptionPane.showMessageDialog(null, "bombero asignado");
            
            }else{
            JOptionPane.showMessageDialog(null, "el bomero no se pudo asignar a la brigada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al cargar asignacion bombero"+ex);
        }
    
    
    
    }

}
