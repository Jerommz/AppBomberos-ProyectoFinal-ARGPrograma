package bomberos.Vistas;

import bomberos.AccesoADatos.BrigadaData;
import bomberos.AccesoADatos.CuartelData;
import bomberos.Entidades.Brigada;
import bomberos.Entidades.Cuartel;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public final class ListarBrigadas extends javax.swing.JPanel {

    String[] modeloBrigada = {"ID", "Nombre", "Especialidad", "Libre", "Cuartel"};
    BrigadaData brigadaDB = new BrigadaData();
    CuartelData cuartelDB = new CuartelData();
    DefaultTableModel modeloBrigadaAct = new DefaultTableModel(null, modeloBrigada) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    public ListarBrigadas() {
        initComponents();
        mostrarCombo();
        modeloTablaBrigada();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelTop = new javax.swing.JPanel();
        panelIzq = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelDer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbListarCuarteles = new javax.swing.JComboBox<>();
        checkBrigadaLibre = new javax.swing.JCheckBox();
        checkBrigadaAsignada = new javax.swing.JCheckBox();
        panelBot = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListarBrigadas = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1000, 500));
        setLayout(new java.awt.BorderLayout());

        panelTop.setBackground(new Color(161, 27, 27,220));
        panelTop.setPreferredSize(new java.awt.Dimension(1000, 100));
        panelTop.setLayout(new java.awt.BorderLayout());

        panelIzq.setBackground(new Color(161, 27, 27));
        panelIzq.setPreferredSize(new java.awt.Dimension(150, 100));
        panelIzq.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Brigadas");
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

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Seleccione un cuartel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 9, 55);
        panelDer.add(jLabel1, gridBagConstraints);

        cbListarCuarteles.setBackground(new Color(193,29,29));
        cbListarCuarteles.setForeground(java.awt.Color.white);
        cbListarCuarteles.setPreferredSize(new java.awt.Dimension(130, 30));
        cbListarCuarteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbListarCuartelesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 55);
        panelDer.add(cbListarCuarteles, gridBagConstraints);

        checkBrigadaLibre.setForeground(java.awt.Color.white);
        checkBrigadaLibre.setText("Libres");
        checkBrigadaLibre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBrigadaLibreActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 60);
        panelDer.add(checkBrigadaLibre, gridBagConstraints);

        checkBrigadaAsignada.setForeground(java.awt.Color.white);
        checkBrigadaAsignada.setText("Asignadas");
        checkBrigadaAsignada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBrigadaAsignadaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 60);
        panelDer.add(checkBrigadaAsignada, gridBagConstraints);

        panelTop.add(panelDer, java.awt.BorderLayout.EAST);

        add(panelTop, java.awt.BorderLayout.NORTH);

        panelBot.setBackground(new Color(161, 27, 27));
        panelBot.setPreferredSize(new java.awt.Dimension(1000, 400));
        panelBot.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1000, 400));

        tablaListarBrigadas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaListarBrigadas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tablaListarBrigadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaListarBrigadas);

        panelBot.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(panelBot, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void cbListarCuartelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListarCuartelesActionPerformed
        // TODO add your handling code here:
        actualizarTabla();
        checkBrigadaLibre.setSelected(false);
        checkBrigadaAsignada.setSelected(false);
        mostrarTablaBrigada();
    }//GEN-LAST:event_cbListarCuartelesActionPerformed

    private void checkBrigadaLibreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBrigadaLibreActionPerformed
        // TODO add your handling code here:
        if (checkBrigadaLibre.isSelected()) {
            mostrarTablaBrigadaLibre();
            checkBrigadaAsignada.setSelected(false);

        }
    }//GEN-LAST:event_checkBrigadaLibreActionPerformed

    private void checkBrigadaAsignadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBrigadaAsignadaActionPerformed
        // TODO add your handling code here:
        if (checkBrigadaAsignada.isSelected()) {
            mostrarTablaBrigadaOcupada();
            checkBrigadaLibre.setSelected(false);
        }
    }//GEN-LAST:event_checkBrigadaAsignadaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbListarCuarteles;
    private javax.swing.JCheckBox checkBrigadaAsignada;
    private javax.swing.JCheckBox checkBrigadaLibre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBot;
    private javax.swing.JPanel panelDer;
    private javax.swing.JPanel panelIzq;
    private javax.swing.JPanel panelTop;
    private javax.swing.JTable tablaListarBrigadas;
    // End of variables declaration//GEN-END:variables

    public void actualizarTabla() {
        DefaultTableModel mod = (DefaultTableModel) tablaListarBrigadas.getModel();
        mod.setRowCount(0);
    }

    public void modeloTablaBrigada() {
        tablaListarBrigadas.setModel(modeloBrigadaAct);
        TableColumnModel columnaBrigada = tablaListarBrigadas.getColumnModel();
        columnaBrigada.getColumn(0).setMaxWidth(60);
        columnaBrigada.getColumn(1).setMaxWidth(300);
        columnaBrigada.getColumn(2).setMaxWidth(800);
        columnaBrigada.getColumn(3).setMaxWidth(80);
        columnaBrigada.getColumn(4).setMaxWidth(80);
    }

    public void mostrarTablaBrigada() {
        actualizarTabla();
        List<Cuartel> cuarteles = cuartelDB.obtenerCuarteles();
        String nombreCB = String.valueOf(cbListarCuarteles.getSelectedItem());
        for (Cuartel cuartel : cuarteles) {
            int codCuartel = cuartel.getCodCuartel();
            if (cuartel.getNombre_cuartel().equals(nombreCB)) {
                List<Brigada> brigadas = brigadaDB.listarBrigadas(codCuartel);
                for (int i = 0; i < brigadas.size(); i++) {
                    int codBrigada = brigadas.get(i).getCodBrigada();
                    String nombre = brigadas.get(i).getNombre_br();
                    String especialidad = brigadas.get(i).getEspecialidad();
                    boolean libre = brigadas.get(i).isLibre();
                    modeloBrigadaAct.addRow(new Object[]{
                        codBrigada,
                        nombre,
                        especialidad,
                        libre,
                        codCuartel
                    });
                }
            }
        }
    }

    public void mostrarCombo() {
        List<Cuartel> cuarteles = cuartelDB.obtenerCuarteles();
        for (Cuartel cuartel : cuarteles) {
            cbListarCuarteles.addItem(cuartel.getNombre_cuartel());
        }

    }

    public void mostrarTablaBrigadaLibre() {
        actualizarTabla();
        List<Cuartel> cuarteles = cuartelDB.obtenerCuarteles();
        String nombreCB = String.valueOf(cbListarCuarteles.getSelectedItem());
        for (Cuartel cuartel : cuarteles) {
            if (cuartel.getNombre_cuartel().equals(nombreCB)) {
                List<Brigada> brigadas = brigadaDB.obtenerBrigadasLibres();
                for (int i = 0; i < brigadas.size(); i++) {
                    int codBrigada = brigadas.get(i).getCodBrigada();
                    String nombre = brigadas.get(i).getNombre_br();
                    String especialidad = brigadas.get(i).getEspecialidad();
                    boolean libre = brigadas.get(i).isLibre();
                    int codCuartel = brigadas.get(i).getCodCuartel();
                    modeloBrigadaAct.addRow(new Object[]{
                        codBrigada,
                        nombre,
                        especialidad,
                        libre,
                        codCuartel
                    });
                }
            }
        }
    }

    public void mostrarTablaBrigadaOcupada() {
        actualizarTabla();
        List<Cuartel> cuarteles = cuartelDB.obtenerCuarteles();
        String nombreCB = String.valueOf(cbListarCuarteles.getSelectedItem());
        for (Cuartel cuartel : cuarteles) {
            if (cuartel.getNombre_cuartel().equals(nombreCB)) {
                List<Brigada> brigadas = brigadaDB.obtenerBrigadas();
                for (int i = 0; i < brigadas.size(); i++) {
                    boolean libre = brigadas.get(i).isLibre();
                    if (libre == false) {
                    int codBrigada = brigadas.get(i).getCodBrigada();
                    String nombre = brigadas.get(i).getNombre_br();
                    String especialidad = brigadas.get(i).getEspecialidad();
                    int codCuartel = brigadas.get(i).getCodCuartel();
                    modeloBrigadaAct.addRow(new Object[]{
                        codBrigada,
                        nombre,
                        especialidad,
                        libre,
                        codCuartel
                    });
                }
            }
        }
    }
    }
}
