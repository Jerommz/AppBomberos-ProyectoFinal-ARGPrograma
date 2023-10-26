package bomberos.Vistas;

import bomberos.AccesoADatos.CuartelData;
import bomberos.Entidades.Cuartel;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public final class ListarCuarteles extends javax.swing.JPanel {

    String[] modeloCuartel = {"ID", "Nombre", "Direccion", "X", "Y", "Telefono", "Correo"};
    CuartelData cuartelDB = new CuartelData();
    DefaultTableModel modeloCuartelAct = new DefaultTableModel(null, modeloCuartel) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    public ListarCuarteles() {
        initComponents();
        mostrarCombo();
        modeloTablaCuartel();
        mostrarTablaCuartel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelTop = new javax.swing.JPanel();
        panelIzq = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelMid = new javax.swing.JPanel();
        checkListarTodos = new javax.swing.JCheckBox();
        cbListarCuarteles = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        panelDer = new javax.swing.JPanel();
        panelBot = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListarCuarteles = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1000, 500));
        setLayout(new java.awt.BorderLayout());

        panelTop.setBackground(new Color(161, 27, 27,220));
        panelTop.setPreferredSize(new java.awt.Dimension(1000, 100));
        panelTop.setLayout(new java.awt.BorderLayout());

        panelIzq.setBackground(new Color(161, 27, 27));
        panelIzq.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cuarteles");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 24));
        panelIzq.add(jLabel2, java.awt.BorderLayout.CENTER);

        panelTop.add(panelIzq, java.awt.BorderLayout.WEST);

        panelMid.setBackground(new Color(161, 27, 27));
        panelMid.setPreferredSize(new java.awt.Dimension(700, 100));
        panelMid.setLayout(new java.awt.GridBagLayout());

        checkListarTodos.setForeground(java.awt.Color.white);
        checkListarTodos.setText("Listar todos");
        checkListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkListarTodosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        panelMid.add(checkListarTodos, gridBagConstraints);

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
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 19, 0, 0);
        panelMid.add(cbListarCuarteles, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Seleccione un cuartel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 7, 0, 0);
        panelMid.add(jLabel1, gridBagConstraints);

        panelTop.add(panelMid, java.awt.BorderLayout.CENTER);

        panelDer.setBackground(new Color(161, 27, 27));
        panelDer.setPreferredSize(new java.awt.Dimension(150, 100));
        panelDer.setLayout(new java.awt.BorderLayout());
        panelTop.add(panelDer, java.awt.BorderLayout.EAST);

        add(panelTop, java.awt.BorderLayout.NORTH);

        panelBot.setBackground(new Color(161, 27, 27));
        panelBot.setPreferredSize(new java.awt.Dimension(1000, 400));
        panelBot.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1000, 400));

        tablaListarCuarteles.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaListarCuarteles.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tablaListarCuarteles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaListarCuarteles);

        panelBot.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(panelBot, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void cbListarCuartelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListarCuartelesActionPerformed
        // TODO add your handling code here:
        mostrarTablaCuartel();
        checkListarTodos.setSelected(false);
    }//GEN-LAST:event_cbListarCuartelesActionPerformed

    private void checkListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkListarTodosActionPerformed
        // TODO add your handling code here:
        if(checkListarTodos.isSelected() == true){
            mostrarTablaCuartelTodos();
        }else if(checkListarTodos.isSelected() == false){
            mostrarTablaCuartel();
        }
    }//GEN-LAST:event_checkListarTodosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbListarCuarteles;
    private javax.swing.JCheckBox checkListarTodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBot;
    private javax.swing.JPanel panelDer;
    private javax.swing.JPanel panelIzq;
    private javax.swing.JPanel panelMid;
    private javax.swing.JPanel panelTop;
    private javax.swing.JTable tablaListarCuarteles;
    // End of variables declaration//GEN-END:variables

    public void modeloTablaCuartel() {
        tablaListarCuarteles.setModel(modeloCuartelAct);
        TableColumnModel columnaCuartel = tablaListarCuarteles.getColumnModel();
        columnaCuartel.getColumn(0).setMaxWidth(60);
        columnaCuartel.getColumn(1).setMaxWidth(300);
        columnaCuartel.getColumn(2).setMaxWidth(500);
        columnaCuartel.getColumn(3).setMaxWidth(40);
        columnaCuartel.getColumn(4).setMaxWidth(40);
        columnaCuartel.getColumn(5).setMaxWidth(100);
        columnaCuartel.getColumn(6).setMaxWidth(500);
    }

    public void mostrarTablaCuartel() {
        actualizarTabla();
        String nombreCB = cbListarCuarteles.getSelectedItem().toString();
        List<Cuartel> cuarteles = cuartelDB.obtenerCuarteles();
        for (Cuartel cuartel : cuarteles) {
            String nombreDB = cuartel.getNombre_cuartel();
            if (nombreCB.equals(nombreDB)) {
                modeloCuartelAct.addRow(new Object[]{
                    cuartel.getCodCuartel(),
                    cuartel.getNombre_cuartel(),
                    cuartel.getDireccion(),
                    cuartel.getCoord_X(),
                    cuartel.getCoord_Y(),
                    cuartel.getTelefono(),
                    cuartel.getCorreo()
                });
            }
        }
    }

    public void mostrarTablaCuartelTodos() {
        actualizarTabla();
        List<Cuartel> cuarteles = cuartelDB.obtenerCuarteles();
        for (Cuartel cuartel : cuarteles) {
            modeloCuartelAct.addRow(new Object[]{
                cuartel.getCodCuartel(),
                cuartel.getNombre_cuartel(),
                cuartel.getDireccion(),
                cuartel.getCoord_X(),
                cuartel.getCoord_Y(),
                cuartel.getTelefono(),
                cuartel.getCorreo()
            });
        }
    }

    public void mostrarCombo() {
        List<Cuartel> cuarteles = cuartelDB.obtenerCuarteles();
        for (Cuartel cuartel : cuarteles) {
            cbListarCuarteles.addItem(cuartel.getNombre_cuartel());
        }
    }

    public void actualizarTabla() {
        DefaultTableModel mod = (DefaultTableModel) tablaListarCuarteles.getModel();
        mod.setRowCount(0);
    }
}
