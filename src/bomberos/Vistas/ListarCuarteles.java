/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberos.Vistas;

import bomberos.AccesoADatos.CuartelData;
import bomberos.Entidades.Cuartel;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author jero
 */
public class ListarCuarteles extends javax.swing.JPanel {
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
        modeloTablaCuartel();
        mostrarTablaCuartel();
        listarCuarteles();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbListarCuarteles = new javax.swing.JComboBox<>();
        panelBot = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListarCuarteles = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1000, 500));
        setLayout(new java.awt.BorderLayout());

        panelTop.setBackground(new Color(161, 27, 27,220));
        panelTop.setPreferredSize(new java.awt.Dimension(1000, 100));
        panelTop.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Seleccione un cuartel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 7, 0, 0);
        panelTop.add(jLabel1, gridBagConstraints);

        cbListarCuarteles.setBackground(new Color(193,29,29));
        cbListarCuarteles.setForeground(java.awt.Color.white);
        cbListarCuarteles.setPreferredSize(new java.awt.Dimension(130, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 19, 0, 0);
        panelTop.add(cbListarCuarteles, gridBagConstraints);

        add(panelTop, java.awt.BorderLayout.NORTH);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbListarCuarteles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBot;
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
  public void listarCuarteles(){
    List <Cuartel>cuarteles = cuartelDB.obtenerCuarteles();
    for(Cuartel cuartel :cuarteles){
    
    cbListarCuarteles.addItem(cuartel.getNombre_cuartel());
    
    }
  
  }


}
