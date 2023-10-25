package bomberos.Vistas;

import bomberos.AccesoADatos.BrigadaData;
import bomberos.AccesoADatos.CuartelData;
import bomberos.AccesoAdatos.BomberoData;
import bomberos.Entidades.Bombero;
import bomberos.Entidades.Brigada;
import bomberos.Entidades.Cuartel;
import java.awt.Color;
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
        modeloTablaBombero();
        mostrarTablaBombero();
        mostrarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbListarBrigadas = new javax.swing.JComboBox<>();
        rbBomberosActivos = new javax.swing.JRadioButton();
        panelBot = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListarBomberos = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1000, 500));
        setLayout(new java.awt.BorderLayout());

        panelTop.setBackground(new Color(161, 27, 27,220));
        panelTop.setPreferredSize(new java.awt.Dimension(1000, 100));
        panelTop.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Seleccione una brigada");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        panelTop.add(jLabel1, gridBagConstraints);

        cbListarBrigadas.setBackground(new Color(193,29,29));
        cbListarBrigadas.setForeground(java.awt.Color.white);
        cbListarBrigadas.setPreferredSize(new java.awt.Dimension(130, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 19, 0, 0);
        panelTop.add(cbListarBrigadas, gridBagConstraints);

        rbBomberosActivos.setForeground(java.awt.Color.white);
        rbBomberosActivos.setText("Activos");
        rbBomberosActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBomberosActivosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 44, 0, 0);
        panelTop.add(rbBomberosActivos, gridBagConstraints);

        add(panelTop, java.awt.BorderLayout.NORTH);

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

    private void rbBomberosActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBomberosActivosActionPerformed
        rbBomberosActivos.setSelected(true);
        actualizarTabla();
        mostrarTablaBombero();
        mostrarTablaBomberoActivos();
        
    }//GEN-LAST:event_rbBomberosActivosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbListarBrigadas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBot;
    private javax.swing.JPanel panelTop;
    private javax.swing.JRadioButton rbBomberosActivos;
    private javax.swing.JTable tablaListarBomberos;
    // End of variables declaration//GEN-END:variables

    public void actualizarTabla() {
        DefaultTableModel mod = (DefaultTableModel) tablaListarBomberos.getModel();
        mod.setRowCount(0);
        
        
    }

    public void modeloTablaBombero() {
        tablaListarBomberos.setModel(modeloBomberoAct);
        TableColumnModel columnaBombero = tablaListarBomberos.getColumnModel();
        columnaBombero.getColumn(0).setMaxWidth(60);
        columnaBombero.getColumn(1).setMaxWidth(80);
        columnaBombero.getColumn(3).setMaxWidth(80);
        columnaBombero.getColumn(6).setMaxWidth(100);
        columnaBombero.getColumn(7).setMaxWidth(100);
    }

    public void mostrarTablaBombero() {
        actualizarTabla();
        int codCuartel = 0;
        int codCuartelB = 0;
        String nombre = "";
        List<Brigada> brigadas = brigadaDB.obtenerBrigadas();
        List<Cuartel> cuarteles = cuartelDB.obtenerCuarteles();
        for (Cuartel cuartel : cuarteles) {
            codCuartel = cuartel.getCodCuartel();
            nombre = cuartel.getNombre_cuartel();
            for (Brigada brigada : brigadas) {
                codCuartelB = brigada.getCodCuartel();
                if (codCuartel == codCuartelB) {
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
                            nombre
                        });
                    }
                }
                break;
            }

        }
    }

    public void mostrarCombo() {
        List<Bombero> bomberos = bomberoDB.obtenerBomberos();
        for (Bombero bombero : bomberos) {
            cbListarBrigadas.addItem(bombero.getNombre_ape());
        }
    }
    
    public void mostrarTablaBomberoActivos() {
        actualizarTabla();
        int codCuartel = 0;
        int codCuartelB = 0;
        String nombre = "";
        List<Brigada> brigadas = brigadaDB.obtenerBrigadas();
        List<Cuartel> cuarteles = cuartelDB.obtenerCuarteles();
        for (Cuartel cuartel : cuarteles) {
            codCuartel = cuartel.getCodCuartel();
            nombre = cuartel.getNombre_cuartel();
            for (Brigada brigada : brigadas) {
                codCuartelB = brigada.getCodCuartel();
                if (codCuartel == codCuartelB) {
                    List<Bombero> bomberos = bomberoDB.obtenerBomberosActivos();
                    for (Bombero bombero : bomberos) {
                        modeloBomberoAct.addRow(new Object[]{
                            bombero.getId_Bombero(),
                            bombero.getDni(),
                            bombero.getNombre_ape(),
                            bombero.getGrupo_sang(),
                            bombero.getFecha(),
                            bombero.getCelular(),
                            bombero.getCodBrigada(),
                            nombre
                        });
                    }
                }
                break;
            }

        }
    }

   
}
