package bomberos.AccesoADatos;

import bomberos.Entidades.Cuartel;
import bomberos.AccesoAdatos.BomberoData;
import bomberos.AccesoAdatos.Conexion;
import bomberos.Entidades.Siniestro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SiniestroData {

    private Connection con;
    private CuartelData cuartelDB;
    private BomberoData bomDB;
    private Cuartel cuartel;
    private Siniestro siniestro;

    public SiniestroData() {
        Connection con = Conexion.getConnection();
    }

    public void cargarSiniestro(Siniestro siniestro) {
        String sql = "INSERT INTO siniestro( tipo, fecha_siniestro, coord_X, coord_Y, detalles, codBrigada) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, siniestro.getTipo());
            ps.setDate(2, Date.valueOf(siniestro.getFecha_siniestro()));
            ps.setDouble(3, siniestro.getCoord_X());
            ps.setDouble(4, siniestro.getCoord_Y());
            ps.setString(5, siniestro.getDetalles());
            ps.setInt(6, siniestro.getCodBrigada());
            int exito = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showInternalMessageDialog(null, "siniestro registrado");
            } else {

                JOptionPane.showMessageDialog(null, "no se pudo registrar el siniestro");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error en el sql de cargar siniestro");
        }
    }

    public void ubicacionSiniestroAcuartel(int codigo) {

        String sql = "SELECT"
                + "    siniestro.codigo AS siniestro_codigo,"
                + "    MIN("
                + "        SQRT("
                + "            POW(cuartel.coord_X =?- siniestro.coord_X=?, 2) + POW(cuartel.coord_Y=? - siniestro.coord_Y=?, 2)"
                + "        )"
                + "    ) AS distancia_minima"
                + "FROM"
                + "    cuartel"
                + "CROSS JOIN"
                + "    siniestro"
                + "GROUP BY"
                + "    siniestro.codigo";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.setDouble(2, cuartel.getCoord_X());
            ps.setDouble(3, siniestro.getCoord_X());
            ps.setDouble(3, cuartel.getCoord_Y());
            ps.setDouble(5, siniestro.getCoord_Y());
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                double distancia_minima = rs.getDouble("distancia_minima");
                JOptionPane.showMessageDialog(null, "el cuartel mas cercano se encuentra a: " + distancia_minima);

            } else {
                JOptionPane.showMessageDialog(null, "no se encontro ubicacion");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error sql de ubicar siniestro");

        }
    }

    public void cuartelMasCercano(int codigo) {

        String sql = "SELECT"
                + "    siniestro.codigo AS siniestro_codigo,"
                + "    MIN("
                + "        SQRT("
                + "            POW(cuartel.coord_X =?- siniestro.coord_X=?, 2) + POW(cuartel.coord_Y=? - siniestro.coord_Y=?, 2)"
                + "        )"
                + "    ) AS distancia_minima"
                + "cuartel.codCuartel AS cuartel_Mas_Cercano"
                + "FROM"
                + "    cuartel"
                + "CROSS JOIN"
                + "    siniestro"
                + "GROUP BY"
                + "    siniestro.codigo";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.setDouble(2, cuartel.getCoord_X());
            ps.setDouble(3, siniestro.getCoord_X());
            ps.setDouble(3, cuartel.getCoord_Y());
            ps.setDouble(5, siniestro.getCoord_Y());
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                double distancia_minima = rs.getDouble("distancia_minima");
                JOptionPane.showMessageDialog(null, "el cuartel mas cercano se encuentra a: " + distancia_minima);
                String cuartel_mas_cercano = rs.getString("cuartel_Mas_Cercano");
                JOptionPane.showMessageDialog(null, "el cuartel mas cercano es :" + cuartel_mas_cercano);
            } else {
                JOptionPane.showMessageDialog(null, "no se encontro ubicacion");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error sql de ubicar siniestro");

        }

    }

    public List<Siniestro> consultarSiniestros(Siniestro siniestro) {
        List<Siniestro> accidentes = new ArrayList<>();
        String sql = "SELECT *"
                + "FROM siniestro"
                + "WHERE DATE(fecha_siniestro) = CURDATE() - INTERVAL 1 DAY"
                + "   OR DATE(fecha_resol) = CURDATE() - INTERVAL 1 DAY";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                siniestro.setCodBrigada(rs.getInt("codBrigada"));
                siniestro.setCodigo(rs.getInt("codigo"));
                siniestro.setCoord_X((int) rs.getDouble("cood_X"));
                siniestro.setCoord_Y((int) rs.getDouble("cood_Y"));
                siniestro.setDetalles(rs.getString("detalles"));
                siniestro.setFecha_siniestro(rs.getDate("fecha_siniestro").toLocalDate());
                siniestro.setFecha_resol(rs.getDate("fecha_resol").toLocalDate());
                siniestro.setPuntuacion(rs.getInt("puntuacion"));
                accidentes.add(siniestro);

            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error en sql  lista siniestro ");
        }
        return accidentes;

    }

    public List<Siniestro> listarSiniestros() {
        List<Siniestro> accidentes = new ArrayList<>();
        con = Conexion.getConnection();
        String sql = "SELECT codigo, tipo, fecha_siniestro, coord_X, coord_Y, detalles, fecha_resol, puntuacion, codBrigada FROM siniestro";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                siniestro = new Siniestro();
                siniestro.setCodigo(rs.getInt("codigo"));
                siniestro.setTipo(rs.getString("tipo"));
                siniestro.setFecha_siniestro(rs.getDate("fecha_siniestro").toLocalDate());
                siniestro.setCoord_X(rs.getInt("coord_X"));
                siniestro.setCoord_Y(rs.getInt("coord_Y"));
                siniestro.setDetalles(rs.getString("detalles"));
                siniestro.setFecha_resol(rs.getDate("fecha_resol").toLocalDate());
                siniestro.setPuntuacion(rs.getInt("puntuacion"));
                siniestro.setCodBrigada(rs.getInt("codBrigada"));

                // Resto del código para asignar valores al objeto Siniestro
                accidentes.add(siniestro);
            }

            System.out.println("2");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder al listado de siniestros" + ex);
            // Aquí podrías arrojar la excepción o manejarla de alguna otra manera según lo requiera tu aplicación.
        }

        System.out.println("3");

        return accidentes;
    }

    public void anotarTerminacionDeSiniestro(int codigo, LocalDate fecha_resol, int puntuacion) {
        String sql = "UPDATE "
                + "    siniestro"
                + "SET "
                + "    fecha_terminacion = ?, "
                + "    puntuacion = ?"
                + "WHERE "
                + "    codigo = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.setDate(2, Date.valueOf(siniestro.getFecha_resol()));
            ps.setInt(3, puntuacion);
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "el siniestro ya fue administrativamente concluido");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error en sql siniestro terminacion" + ex);

        }

    }

}
