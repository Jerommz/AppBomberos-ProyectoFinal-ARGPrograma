/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bomberos.AccesoAdatos;

import bomberos.Entidades.Bombero;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Lenovo
 */
public class BomberoData {
   //atributos necesarios para los metodos utilizados
    private final Connection con;
    
    //constructor vacio
    public BomberoData() {
        con = (Connection) Conexion.getConnection();
    }
    public void nuevoBombero(Bombero bombero) {

        //query insertar Bombero en la base de datos
        String sql = "insert into bombero(dni, nombre_ape, grupo_sang, fecha, celular, codBrigada, estado)"
                + "VALUES (?, ?, ?, ?, ?)";
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
                JOptionPane.showMessageDialog(null, "bombero agregado.");
            }else{
                JOptionPane.showMessageDialog(null, "bombero no agregado.");
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla bombero.");
        }

    }
    
    
}
