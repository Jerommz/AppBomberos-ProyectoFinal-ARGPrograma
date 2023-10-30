package bomberos.Vistas;

import bomberos.AccesoADatos.BrigadaData;
import bomberos.AccesoADatos.CuartelData;
import bomberos.AccesoAdatos.BomberoData;
import bomberos.Entidades.Bombero;
import bomberos.Entidades.Brigada;
import bomberos.Entidades.Cuartel;
import java.awt.Color;
import java.time.LocalDate;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public final class ListarBomberos extends javax.swing.JPanel {
    String[] modeloBombero = {"ID", "Dni", "Nombre", "Sangre", "Nacimiento", "Celular", "Brigada", "Cuartel"};
    BomberoData bomberoDB = new BomberoData();
    BrigadaData brigadaDB = new BrigadaData();
    CuartelData cuartelDB = new CuartelData();

    DefaultTableModel modeloBomberoAct = new DefaultTableModel(null, modeloBombero) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    public ListarBomberos() {
        initComponents();
        mostrarCombo();
        modeloTablaBombero();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelTop = new javax.swing.JPanel();
        panelIzq = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelDer = new javax.swing.JPanel();
        checkBomberoActivo = new javax.swing.JCheckBox();
        checkBomberoNoActivo = new javax.swing.JCheckBox();
        cbListarBrigadas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        panelBot = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListarBomberos = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1000, 500));
        setLayout(new java.awt.BorderLayout());

        panelTop.setBackground(new Color(161, 27, 27,220));
        panelTop.setPreferredSize(new java.awt.Dimension(1000, 100));
        panelTop.setLayout(new java.awt.BorderLayout());

        panelIzq.setBackground(new Color(161, 27, 27));
        panelIzq.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bomberos");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        panelIzq.add(jLabel2, gridBagConstraints);

        panelTop.add(panelIzq, java.awt.BorderLayout.WEST);

        panelDer.setBackground(new Color(161, 27, 27));
        panelDer.setPreferredSize(new java.awt.Dimension(850, 100));
        panelDer.setLayout(new java.awt.GridBagLayout());

        checkBomberoActivo.setForeground(java.awt.Color.white);
        checkBomberoActivo.setText("Activo");
        checkBomberoActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBomberoActivoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        panelDer.add(checkBomberoActivo, gridBagConstraints);

        checkBomberoNoActivo.setForeground(java.awt.Color.white);
        checkBomberoNoActivo.setText("No activo");
        checkBomberoNoActivo.setPreferredSize(new java.awt.Dimension(100, 24));
        checkBomberoNoActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBomberoNoActivoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 90, 0, 0);
        panelDer.add(checkBomberoNoActivo, gridBagConstraints);

        cbListarBrigadas.setBackground(new Color(193,29,29));
        cbListarBrigadas.setForeground(java.awt.Color.white);
        cbListarBrigadas.setPreferredSize(new java.awt.Dimension(130, 30));
        cbListarBrigadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbListarBrigadasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelDer.add(cbListarBrigadas, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Seleccione una brigada");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 85);
        panelDer.add(jLabel1, gridBagConstraints);

        panelTop.add(panelDer, java.awt.BorderLayout.EAST);

        add(panelTop, java.awt.BorderLayout.CENTER);

        panelBot.setPreferredSize(new java.awt.Dimension(1000, 400));
        panelBot.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1000, 400));

        tablaListarBomberos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaListarBomberos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tablaListarBomberos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaListarBomberos);

        panelBot.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(panelBot, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void cbListarBrigadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListarBrigadasActionPerformed
        // TODO add your handling code here:
        actualizarTabla();
        checkBomberoActivo.setSelected(false);
        checkBomberoNoActivo.setSelected(false);
        mostrarTablaBomberos();
    }//GEN-LAST:event_cbListarBrigadasActionPerformed

    private void checkBomberoNoActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBomberoNoActivoActionPerformed
        // TODO add your handling code here:
        if (checkBomberoNoActivo.isSelected()) {
            mostrarTablaBomberoNoActivos();
            checkBomberoActivo.setSelected(false);
        }
    }//GEN-LAST:event_checkBomberoNoActivoActionPerformed

    private void checkBomberoActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBomberoActivoActionPerformed
        // TODO add your handling code here:
        if (checkBomberoActivo.isSelected()) {
            mostrarTablaBomberoActivos();
            checkBomberoNoActivo.setSelected(false);
        }
    }//GEN-LAST:event_checkBomberoActivoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbListarBrigadas;
    private javax.swing.JCheckBox checkBomberoActivo;
    private javax.swing.JCheckBox checkBomberoNoActivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBot;
    private javax.swing.JPanel panelDer;
    private javax.swing.JPanel panelIzq;
    private javax.swing.JPanel panelTop;
    private javax.swing.JTable tablaListarBomberos;
    // End of variables declaration//GEN-END:variables

    public void actualizarTabla() {
        DefaultTableModel mod = (DefaultTableModel) tablaListarBomberos.getModel();
        mod.setRowCount(0);
    }

    public void modeloTablaBombero() {
        tablaListarBomberos.setModel(modeloBomberoAct);
        TableColumnModel columnaBombero = tablaListarBomberos.getColumnModel();
        columnaBombero.getColumn(0).setMaxWidth(40);
        columnaBombero.getColumn(1).setMaxWidth(90);
        columnaBombero.getColumn(2).setMaxWidth(200);
        columnaBombero.getColumn(3).setMaxWidth(50);
        columnaBombero.getColumn(4).setMaxWidth(150);
        columnaBombero.getColumn(5).setMaxWidth(200);
        columnaBombero.getColumn(6).setMaxWidth(70);
        columnaBombero.getColumn(7).setMaxWidth(200);
    }

    public String obtenerNombreCuartel(int codBrigada) {
        Brigada brigada = brigadaDB.buscarBrigada(codBrigada);
        int codCuartelBrigada = brigada.getCodCuartel();
        Cuartel cuartel = cuartelDB.buscarCuartel(codCuartelBrigada);
        String nombreCuartel = cuartel.getNombre_cuartel();
        return nombreCuartel;
    }

    public void mostrarTablaBomberos() {
        actualizarTabla();
        List<Brigada> brigadas = brigadaDB.obtenerBrigadas();
        String nombreCB = String.valueOf(cbListarBrigadas.getSelectedItem());
        for (Brigada brigada : brigadas) {
            int codBrigada = brigada.getCodBrigada();
            if (brigada.getNombre_br().equals(nombreCB)) {
                List<Bombero> bomberos = bomberoDB.listarBomberos(codBrigada);
                for (int i = 0; i < bomberos.size(); i++) {
                    int idBombero = bomberos.get(i).getId_Bombero();
                    int dni = bomberos.get(i).getDni();
                    String nombre = bomberos.get(i).getNombre_ape();
                    String sangre = bomberos.get(i).getGrupo_sang();
                    LocalDate fecha = bomberos.get(i).getFecha();
                    int celular = bomberos.get(i).getCelular();
                    String nombreCuartel = obtenerNombreCuartel(codBrigada);
                    modeloBomberoAct.addRow(new Object[]{
                        idBombero,
                        dni,
                        nombre,
                        sangre,
                        fecha,
                        celular,
                        codBrigada,
                        nombreCuartel
                    });
                }
            }
        }
    }

    public void mostrarCombo() {
        List<Brigada> brigadas = brigadaDB.obtenerBrigadas();
        for (Brigada brigada : brigadas) {
            cbListarBrigadas.addItem(brigada.getNombre_br());
        }
    }

    public void mostrarTablaBomberoActivos() {
        actualizarTabla();
        List<Brigada> brigadas = brigadaDB.obtenerBrigadas();
        String nombreCB = String.valueOf(cbListarBrigadas.getSelectedItem());
        for (Brigada brigada : brigadas) {
            int codBrigada = brigada.getCodBrigada();
            List<Bombero> bomberos = bomberoDB.listarBomberos(codBrigada);
            for (int i = 0; i < bomberos.size(); i++) {
                int idBombero = bomberos.get(i).getId_Bombero();
                int dni = bomberos.get(i).getDni();
                String nombre = bomberos.get(i).getNombre_ape();
                String sangre = bomberos.get(i).getGrupo_sang();
                LocalDate fecha = bomberos.get(i).getFecha();
                int celular = bomberos.get(i).getCelular();
                String nombreCuartel = obtenerNombreCuartel(codBrigada);
                modeloBomberoAct.addRow(new Object[]{
                    idBombero,
                    dni,
                    nombre,
                    sangre,
                    fecha,
                    celular,
                    codBrigada,
                    nombreCuartel
                });
            }
        }
    }

    public void mostrarTablaBomberoNoActivos() {
        actualizarTabla();
        List<Brigada> brigadas = brigadaDB.obtenerBrigadas();
        String nombreCB = String.valueOf(cbListarBrigadas.getSelectedItem());
        for (Brigada brigada : brigadas) {
            int codBrigada = brigada.getCodBrigada();
            List<Bombero> bomberos = bomberoDB.listarBomberos(codBrigada);
            for (int i = 0; i < bomberos.size(); i++) {
                if (bomberos.get(i).isEstado() == false) {
                    int idBombero = bomberos.get(i).getId_Bombero();
                    int dni = bomberos.get(i).getDni();
                    String nombre = bomberos.get(i).getNombre_ape();
                    String sangre = bomberos.get(i).getGrupo_sang();
                    LocalDate fecha = bomberos.get(i).getFecha();
                    int celular = bomberos.get(i).getCelular();
                    String nombreCuartel = obtenerNombreCuartel(codBrigada);
                    modeloBomberoAct.addRow(new Object[]{
                        idBombero,
                        dni,
                        nombre,
                        sangre,
                        fecha,
                        celular,
                        codBrigada,
                        nombreCuartel
                    });
                }
            }
        }
    }
}
