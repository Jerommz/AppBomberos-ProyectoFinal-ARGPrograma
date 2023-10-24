package bomberos.Vistas;

import bomberos.Entidades.Siniestro;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import bomberos.AccesoADatos.SiniestroData;
import java.awt.Component;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public final class ListarSiniestros extends javax.swing.JPanel {

    String[] modeloSiniestro = {"Codigo", "Tipo", "Fecha", "Detalles", "X ", "Y", "Fecha finalizacion", "Puntaje", "Codigo Brigada"};
    SiniestroData siniestroDB = new SiniestroData();

    DefaultTableModel modeloSiniestroAct = new DefaultTableModel(null, modeloSiniestro) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    public ListarSiniestros() {
        initComponents();
        botones();
        modeloTablaSiniestro();
        mostrarTablaSiniestro();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelMain = new javax.swing.JPanel();
        panelTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        panelMid = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListarAdmin = new javax.swing.JTable();
        panelBot = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textDescSiniestro = new javax.swing.JTextArea();
        textTipoSiniestro = new javax.swing.JTextField();
        textFechaInicioSiniestro = new javax.swing.JTextField();
        textFechaFinSiniestro = new javax.swing.JTextField();
        textPuntox = new javax.swing.JTextField();
        textBrigadaSiniestro = new javax.swing.JTextField();
        botonModificarSiniestro = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textPuntoY = new javax.swing.JTextField();
        textPuntajeSiniestro2 = new javax.swing.JTextField();
        botonFinalizarSiniestro = new javax.swing.JButton();

        panelMain.setBackground(new Color(0,0,0,0));
        panelMain.setMinimumSize(new java.awt.Dimension(0, 0));
        panelMain.setPreferredSize(new java.awt.Dimension(980, 640));
        panelMain.setLayout(new java.awt.BorderLayout());

        panelTop.setBackground(new Color(161, 27, 27));
        panelTop.setPreferredSize(new java.awt.Dimension(0, 100));
        panelTop.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Seleccione un siniestro:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        panelTop.add(jLabel1, gridBagConstraints);

        jCheckBox1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBox1.setForeground(java.awt.Color.white);
        jCheckBox1.setText("Ultimas 48 horas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        panelTop.add(jCheckBox1, gridBagConstraints);

        panelMain.add(panelTop, java.awt.BorderLayout.NORTH);

        panelMid.setBackground(new Color(161, 27, 27,220));
        panelMid.setPreferredSize(new java.awt.Dimension(0, 580));
        panelMid.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(980, 580));

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

        panelMid.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        panelMain.add(panelMid, java.awt.BorderLayout.CENTER);

        panelBot.setBackground(new Color(161, 27, 27));
        panelBot.setPreferredSize(new java.awt.Dimension(0, 300));
        panelBot.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Descripcion:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        panelBot.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("X:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 0);
        panelBot.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Fecha fin:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 0);
        panelBot.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Fecha inicio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 6, 0);
        panelBot.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Puntaje:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 2, 0);
        panelBot.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Brigada asignada");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 5);
        panelBot.add(jLabel7, gridBagConstraints);

        textDescSiniestro.setBackground(new Color(193,29,29));
        textDescSiniestro.setColumns(20);
        textDescSiniestro.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textDescSiniestro.setForeground(java.awt.Color.white);
        textDescSiniestro.setRows(5);
        textDescSiniestro.setBorder(null);
        textDescSiniestro.setCaretColor(null);
        textDescSiniestro.setHighlighter(null);
        textDescSiniestro.setMinimumSize(new java.awt.Dimension(0, 0));
        textDescSiniestro.setSelectedTextColor(null);
        textDescSiniestro.setSelectionColor(null);
        textDescSiniestro.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(textDescSiniestro);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelBot.add(jScrollPane2, gridBagConstraints);

        textTipoSiniestro.setBackground(new Color(193,29,29));
        textTipoSiniestro.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textTipoSiniestro.setForeground(java.awt.Color.white);
        textTipoSiniestro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textTipoSiniestro.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 6, 0);
        panelBot.add(textTipoSiniestro, gridBagConstraints);

        textFechaInicioSiniestro.setBackground(new Color(193,29,29));
        textFechaInicioSiniestro.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textFechaInicioSiniestro.setForeground(java.awt.Color.white);
        textFechaInicioSiniestro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textFechaInicioSiniestro.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 6, 0);
        panelBot.add(textFechaInicioSiniestro, gridBagConstraints);

        textFechaFinSiniestro.setBackground(new Color(193,29,29));
        textFechaFinSiniestro.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textFechaFinSiniestro.setForeground(java.awt.Color.white);
        textFechaFinSiniestro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textFechaFinSiniestro.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 0);
        panelBot.add(textFechaFinSiniestro, gridBagConstraints);

        textPuntox.setBackground(new Color(193,29,29));
        textPuntox.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textPuntox.setForeground(java.awt.Color.white);
        textPuntox.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textPuntox.setPreferredSize(new java.awt.Dimension(40, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 2, 5);
        panelBot.add(textPuntox, gridBagConstraints);

        textBrigadaSiniestro.setBackground(new Color(193,29,29));
        textBrigadaSiniestro.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textBrigadaSiniestro.setForeground(java.awt.Color.white);
        textBrigadaSiniestro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textBrigadaSiniestro.setPreferredSize(new java.awt.Dimension(50, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 35, 2, 0);
        panelBot.add(textBrigadaSiniestro, gridBagConstraints);

        botonModificarSiniestro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonModificarSiniestro.setForeground(java.awt.Color.white);
        botonModificarSiniestro.setText("Modificar");
        botonModificarSiniestro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botonModificarSiniestro.setBorderPainted(false);
        botonModificarSiniestro.setPreferredSize(new java.awt.Dimension(120, 40));
        botonModificarSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarSiniestroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelBot.add(botonModificarSiniestro, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Tipo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 6, 0);
        panelBot.add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Y:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 0);
        panelBot.add(jLabel9, gridBagConstraints);

        textPuntoY.setBackground(new Color(193,29,29));
        textPuntoY.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textPuntoY.setForeground(java.awt.Color.white);
        textPuntoY.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textPuntoY.setPreferredSize(new java.awt.Dimension(40, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 2, 0);
        panelBot.add(textPuntoY, gridBagConstraints);

        textPuntajeSiniestro2.setBackground(new Color(193,29,29));
        textPuntajeSiniestro2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textPuntajeSiniestro2.setForeground(java.awt.Color.white);
        textPuntajeSiniestro2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textPuntajeSiniestro2.setPreferredSize(new java.awt.Dimension(40, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 2, 6);
        panelBot.add(textPuntajeSiniestro2, gridBagConstraints);

        botonFinalizarSiniestro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonFinalizarSiniestro.setForeground(java.awt.Color.white);
        botonFinalizarSiniestro.setText("Finalizar");
        botonFinalizarSiniestro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botonFinalizarSiniestro.setBorderPainted(false);
        botonFinalizarSiniestro.setPreferredSize(new java.awt.Dimension(120, 40));
        botonFinalizarSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFinalizarSiniestroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelBot.add(botonFinalizarSiniestro, gridBagConstraints);

        panelMain.add(panelBot, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonModificarSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarSiniestroActionPerformed

        Component[] comps = panelBot.getComponents();
        for (Component comp : comps) {
            if (comp instanceof JTextField) {
                if (((JTextField) comp).getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio para modificar el siniestro.");
                } else {
                    int codBrigada = Integer.parseInt(textBrigadaSiniestro.getText());
                    String detalle = textDescSiniestro.getText();
                    LocalDate fecha_siniestro = LocalDate.parse(textFechaFinSiniestro.getText());
                    LocalDate fecha_resol = LocalDate.parse(textFechaInicioSiniestro.getText());
                    int puntaje = Integer.parseInt(textPuntajeSiniestro2.getText());
                    String tipo = textTipoSiniestro.getText();
                    int coor_X = Integer.parseInt(textPuntox.getText());
                    int cood_Y = Integer.parseInt(textPuntoY.getText());
                    Siniestro accidente = new Siniestro(tipo, fecha_siniestro, coor_X, cood_Y, detalle, fecha_resol, puntaje, codBrigada);
                    siniestroDB.modificarSiniestro(accidente);
                }
            }
        }
    }//GEN-LAST:event_botonModificarSiniestroActionPerformed

    private void botonFinalizarSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFinalizarSiniestroActionPerformed

        Component[] comps = panelBot.getComponents();
        for (Component comp : comps) {
            if (comp instanceof JTextField) {
                if (((JTextField) comp).getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio para finalizar el siniestro.");
                } else {
                    int codBrigada = Integer.parseInt(textBrigadaSiniestro.getText());
                    String detalle = textDescSiniestro.getText();
                    LocalDate fecha_siniestro = LocalDate.parse(textFechaFinSiniestro.getText());
                    LocalDate fecha_resol = LocalDate.parse(textFechaInicioSiniestro.getText());
                    int puntaje = Integer.parseInt(textPuntajeSiniestro2.getText());
                    String tipo = textTipoSiniestro.getText();
                    int coor_X = Integer.parseInt(textPuntox.getText());
                    int cood_Y = Integer.parseInt(textPuntoY.getText());
                    Siniestro accidente = new Siniestro(tipo, fecha_siniestro, coor_X, cood_Y, detalle, fecha_resol, puntaje, codBrigada);
                    siniestroDB.anotarTerminacionDeSiniestro(cood_Y, fecha_resol, puntaje);
                }
            }
        }
    }//GEN-LAST:event_botonFinalizarSiniestroActionPerformed

    private void cbListarAdminActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonFinalizarSiniestro;
    private javax.swing.JButton botonModificarSiniestro;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelBot;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelMid;
    private javax.swing.JPanel panelTop;
    private javax.swing.JTable tablaListarAdmin;
    private javax.swing.JTextField textBrigadaSiniestro;
    private javax.swing.JTextArea textDescSiniestro;
    private javax.swing.JTextField textFechaFinSiniestro;
    private javax.swing.JTextField textFechaInicioSiniestro;
    private javax.swing.JTextField textPuntajeSiniestro2;
    private javax.swing.JTextField textPuntoY;
    private javax.swing.JTextField textPuntox;
    private javax.swing.JTextField textTipoSiniestro;
    // End of variables declaration//GEN-END:variables

    public void mostrarTablaSiniestro() {
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

    public void botones() {
        JButton btns[] = {botonModificarSiniestro, botonFinalizarSiniestro};
        for (JButton btn : btns) {
            btn.setBackground(new Color(184, 34, 34));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(new Color(252, 68, 22));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(new Color(184, 34, 34));
                }
            });
        }
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
}