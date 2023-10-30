package bomberos.Vistas;

import bomberos.AccesoADatos.BrigadaData;
import bomberos.AccesoADatos.CuartelData;
import bomberos.AccesoADatos.SiniestroData;
import bomberos.AccesoAdatos.BomberoData;
import bomberos.Entidades.Bombero;
import bomberos.Entidades.Brigada;
import bomberos.Entidades.Cuartel;
import bomberos.Entidades.Siniestro;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public final class Administracion extends javax.swing.JPanel {
    String[] modeloCB = {"Bomberos", "Brigadas", "Cuarteles", "Siniestros"};
    String[] modeloBombero = {"ID", "Dni", "Nombre", "Sangre", "Nacimiento", "Celular", "Brigada", "Activo"};
    String[] modeloBrigada = {"ID", "Nombre", "Especialidad", "Libre", "Cuartel"};
    String[] modeloCuartel = {"ID", "Nombre", "Direccion", "X", "Y", "Telefono", "Correo"};
    String[] modeloSiniestro = {"Codigo", "Tipo", "Fecha", "X", "Y", "Detalles", "Fecha finalizacion", "Puntaje", "Codigo Brigada"};
    BomberoData bomberoDB = new BomberoData();
    BrigadaData brigadaDB = new BrigadaData();
    CuartelData cuartelDB = new CuartelData();
    SiniestroData siniestroDB = new SiniestroData();
    
    DefaultTableModel modeloBomberoAct = new DefaultTableModel(null, modeloBombero) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    DefaultTableModel modeloBrigadaAct = new DefaultTableModel(null, modeloBrigada) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    DefaultTableModel modeloSiniestroAct = new DefaultTableModel(null, modeloSiniestro) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    DefaultTableModel modeloCuartelAct = new DefaultTableModel(null, modeloCuartel) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    public Administracion() {
        initComponents();
        actualizarTabla();
        modeloTablaBombero();
        mostrarTablaBombero();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelRoot = new javax.swing.JPanel();
        panelMain = new javax.swing.JPanel();
        panelTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbListarAdmin = new javax.swing.JComboBox<>(modeloCB);
        panelBot = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListarAdmin = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        panelRoot.setPreferredSize(new java.awt.Dimension(1280, 640));
        panelRoot.setLayout(null);

        panelMain.setBackground(new Color(0,0,0,0));
        panelMain.setMinimumSize(new java.awt.Dimension(0, 0));
        panelMain.setPreferredSize(new java.awt.Dimension(1280, 640));
        panelMain.setLayout(new java.awt.BorderLayout());

        panelTop.setBackground(new Color(161, 27, 27,220));
        panelTop.setPreferredSize(new java.awt.Dimension(0, 100));
        panelTop.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Seleccione lo que desee listar:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelTop.add(jLabel1, gridBagConstraints);

        cbListarAdmin.setBackground(new Color(193,29,29));
        cbListarAdmin.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cbListarAdmin.setForeground(new Color(193,29,29));
        cbListarAdmin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbListarAdmin.setMinimumSize(new java.awt.Dimension(0, 0));
        cbListarAdmin.setPreferredSize(new java.awt.Dimension(150, 30));
        cbListarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbListarAdminActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        panelTop.add(cbListarAdmin, gridBagConstraints);

        panelMain.add(panelTop, java.awt.BorderLayout.CENTER);

        panelBot.setBackground(new Color(161, 27, 27,220));
        panelBot.setPreferredSize(new java.awt.Dimension(1280, 540));
        panelBot.setLayout(new java.awt.BorderLayout());

        tablaListarAdmin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaListarAdmin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tablaListarAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaListarAdmin.setRowHeight(30);
        jScrollPane1.setViewportView(tablaListarAdmin);

        panelBot.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        panelMain.add(panelBot, java.awt.BorderLayout.SOUTH);

        panelRoot.add(panelMain);
        panelMain.setBounds(0, 0, 1280, 640);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoAdmin.jpg.png"))); // NOI18N
        panelRoot.add(jLabel2);
        jLabel2.setBounds(0, 0, 1280, 640);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbListarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListarAdminActionPerformed
        // TODO add your handling code here:
        String selected = cbListarAdmin.getSelectedItem().toString();
        if ("Bomberos".equals(selected)) {
            modeloTablaBombero();
            mostrarTablaBombero();
        } else if ("Brigadas".equals(selected)) {
            modeloTablaBrigada();
            mostrarTablaBrigada();
        } else if ("Cuarteles".equals(selected)) {
            modeloTablaCuartel();
            mostrarTablaCuartel();
        } else if ("Siniestros".equals(selected)) {
            modeloTablaSiniestro();
            mostrarTablaSiniestro();
        }
    }//GEN-LAST:event_cbListarAdminActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbListarAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBot;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelRoot;
    private javax.swing.JPanel panelTop;
    private javax.swing.JTable tablaListarAdmin;
    // End of variables declaration//GEN-END:variables

    public void actualizarTabla() {
        DefaultTableModel mod = (DefaultTableModel) tablaListarAdmin.getModel();
        mod.setRowCount(0);
    }

    public void modeloTablaBombero() {
        tablaListarAdmin.setModel(modeloBomberoAct);
        TableColumnModel columnaBombero = tablaListarAdmin.getColumnModel();
        columnaBombero.getColumn(0).setMaxWidth(60);
        columnaBombero.getColumn(1).setMaxWidth(80);
        columnaBombero.getColumn(3).setMaxWidth(80);
        columnaBombero.getColumn(6).setMaxWidth(100);
        columnaBombero.getColumn(7).setMaxWidth(100);
    }

    public void modeloTablaBrigada() {
        tablaListarAdmin.setModel(modeloBrigadaAct);
        TableColumnModel columnaBrigada = tablaListarAdmin.getColumnModel();
        columnaBrigada.getColumn(0).setMaxWidth(60);
        columnaBrigada.getColumn(1).setMaxWidth(300);
        columnaBrigada.getColumn(2).setMaxWidth(800);
        columnaBrigada.getColumn(3).setMaxWidth(80);
        columnaBrigada.getColumn(4).setMaxWidth(80);
    }

    public void modeloTablaCuartel() {
        tablaListarAdmin.setModel(modeloCuartelAct);
        TableColumnModel columnaCuartel = tablaListarAdmin.getColumnModel();
        columnaCuartel.getColumn(0).setMaxWidth(60);
        columnaCuartel.getColumn(1).setMaxWidth(300);
        columnaCuartel.getColumn(2).setMaxWidth(500);
        columnaCuartel.getColumn(3).setMaxWidth(40);
        columnaCuartel.getColumn(4).setMaxWidth(40);
        columnaCuartel.getColumn(5).setMaxWidth(100);
        columnaCuartel.getColumn(6).setMaxWidth(500);
    }

    public void modeloTablaSiniestro() {
        tablaListarAdmin.setModel(modeloSiniestroAct);
        TableColumnModel columnaSiniestro = tablaListarAdmin.getColumnModel();
        columnaSiniestro.getColumn(0).setMaxWidth(60);
        columnaSiniestro.getColumn(1).setMaxWidth(300);
        columnaSiniestro.getColumn(2).setMaxWidth(500);
        columnaSiniestro.getColumn(3).setMaxWidth(40);
        columnaSiniestro.getColumn(4).setMaxWidth(40);
        columnaSiniestro.getColumn(5).setMaxWidth(100);
        columnaSiniestro.getColumn(6).setMaxWidth(500);
        columnaSiniestro.getColumn(7).setMaxWidth(500);
        columnaSiniestro.getColumn(8).setMaxWidth(500);
    }

    public void mostrarTablaBombero() {
        actualizarTabla();
        List<Bombero> bomberos = bomberoDB.obtenerBomberos();
        for (Bombero bombero : bomberos) {
            modeloBomberoAct.addRow(new Object[]{
                bombero.getId_Bombero(),
                bombero.getDni(),
                bombero.getNombre_ape(),
                bombero.getGrupo_sang(),
                bombero.getFecha(),
                bombero.getCelular(),
                bombero.getCodBrigada(),
                bombero.isEstado()
            });
        }
    }

    public void mostrarTablaBrigada() {
        actualizarTabla();
        List<Brigada> brigadas = brigadaDB.obtenerBrigadas();
        for (Brigada brigada : brigadas) {
            modeloBrigadaAct.addRow(new Object[]{
                brigada.getCodBrigada(),
                brigada.getNombre_br(),
                brigada.getEspecialidad(),
                brigada.isLibre(),
                brigada.getCodCuartel()
            });
        }
    }

    public void mostrarTablaCuartel() {
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

    public void mostrarTablaSiniestro() {
        actualizarTabla();
        List<Siniestro> siniestros = siniestroDB.listarSiniestros();
        for (Siniestro sini : siniestros) {
            modeloSiniestroAct.addRow(new Object[]{
                sini.getCodigo(),
                sini.getTipo(),
                sini.getFecha_siniestro(),
                sini.getDetalles(),
                sini.getCoord_X(),
                sini.getCoord_Y(),
                sini.getFecha_resol(),
                sini.getPuntuacion(),
                sini.getCodBrigada()
            });
        }
    }
}
