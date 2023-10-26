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
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;

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
        jcb48hs = new javax.swing.JCheckBox();
        panelMid = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListarAdmin = new javax.swing.JTable();
        panelBot = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textDescSiniestro = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textPuntox = new javax.swing.JTextField();
        textFechaInicioSiniestro = new javax.swing.JTextField();
        textPuntoY = new javax.swing.JTextField();
        textFechaFinSiniestro = new javax.swing.JTextField();
        textTipoSiniestro = new javax.swing.JTextField();
        textPuntajeSiniestro2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        botonFinalizarSiniestro = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        botonModificarSiniestro = new javax.swing.JButton();
        textCodigoSiniestro = new javax.swing.JTextField();
        textBrigadaSiniestro = new javax.swing.JTextField();

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

        jcb48hs.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jcb48hs.setForeground(java.awt.Color.white);
        jcb48hs.setText("Ultimas 48 horas");
        jcb48hs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb48hsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        panelTop.add(jcb48hs, gridBagConstraints);

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
        tablaListarAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaListarAdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaListarAdmin);

        panelMid.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        panelBot.setBackground(new Color(161, 27, 27));
        panelBot.setPreferredSize(new java.awt.Dimension(0, 300));
        panelBot.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new Color(161, 27, 27));
        jPanel1.setPreferredSize(new java.awt.Dimension(326, 300));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Descripcion:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jLabel2, gridBagConstraints);

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
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jScrollPane2, gridBagConstraints);

        panelBot.add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel2.setBackground(new Color(161, 27, 27));
        jPanel2.setPreferredSize(new java.awt.Dimension(328, 300));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Y:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Fecha fin:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Fecha inicio:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Tipo:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Puntaje:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("X:");

        textPuntox.setBackground(new Color(193,29,29));
        textPuntox.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textPuntox.setForeground(java.awt.Color.white);
        textPuntox.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textPuntox.setPreferredSize(new java.awt.Dimension(40, 30));

        textFechaInicioSiniestro.setBackground(new Color(193,29,29));
        textFechaInicioSiniestro.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textFechaInicioSiniestro.setForeground(java.awt.Color.white);
        textFechaInicioSiniestro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textFechaInicioSiniestro.setPreferredSize(new java.awt.Dimension(100, 30));

        textPuntoY.setBackground(new Color(193,29,29));
        textPuntoY.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textPuntoY.setForeground(java.awt.Color.white);
        textPuntoY.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textPuntoY.setPreferredSize(new java.awt.Dimension(40, 30));

        textFechaFinSiniestro.setBackground(new Color(193,29,29));
        textFechaFinSiniestro.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textFechaFinSiniestro.setForeground(java.awt.Color.white);
        textFechaFinSiniestro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textFechaFinSiniestro.setPreferredSize(new java.awt.Dimension(100, 30));

        textTipoSiniestro.setBackground(new Color(193,29,29));
        textTipoSiniestro.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textTipoSiniestro.setForeground(java.awt.Color.white);
        textTipoSiniestro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textTipoSiniestro.setPreferredSize(new java.awt.Dimension(200, 30));

        textPuntajeSiniestro2.setBackground(new Color(193,29,29));
        textPuntajeSiniestro2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textPuntajeSiniestro2.setForeground(java.awt.Color.white);
        textPuntajeSiniestro2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textPuntajeSiniestro2.setPreferredSize(new java.awt.Dimension(40, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFechaInicioSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFechaFinSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTipoSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPuntajeSiniestro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPuntox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPuntoY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFechaInicioSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFechaFinSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTipoSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textPuntajeSiniestro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPuntox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(textPuntoY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        panelBot.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new Color(161, 27, 27));
        jPanel3.setPreferredSize(new java.awt.Dimension(326, 300));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Brigada asignada:");

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

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Codigo:");

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

        textCodigoSiniestro.setBackground(new Color(193,29,29));
        textCodigoSiniestro.setPreferredSize(new java.awt.Dimension(50, 30));

        textBrigadaSiniestro.setBackground(new Color(193,29,29));
        textBrigadaSiniestro.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textBrigadaSiniestro.setForeground(java.awt.Color.white);
        textBrigadaSiniestro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textBrigadaSiniestro.setPreferredSize(new java.awt.Dimension(50, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textBrigadaSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textCodigoSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonModificarSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonFinalizarSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textBrigadaSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(textCodigoSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(botonModificarSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(botonFinalizarSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        panelBot.add(jPanel3, java.awt.BorderLayout.EAST);

        panelMid.add(panelBot, java.awt.BorderLayout.PAGE_END);

        panelMain.add(panelMid, java.awt.BorderLayout.CENTER);

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

    private void tablaListarAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaListarAdminMouseClicked
        int seleccionar = tablaListarAdmin.rowAtPoint(evt.getPoint());
        textBrigadaSiniestro.setText(String.valueOf(tablaListarAdmin.getValueAt(seleccionar, 8)));
        textCodigoSiniestro.setText(String.valueOf(tablaListarAdmin.getValueAt(seleccionar, 0)));
        textDescSiniestro.setText(String.valueOf(tablaListarAdmin.getValueAt(seleccionar, 3)));
        textFechaFinSiniestro.setText(String.valueOf(tablaListarAdmin.getValueAt(seleccionar, 6)));
        textFechaInicioSiniestro.setText(String.valueOf(tablaListarAdmin.getValueAt(seleccionar, 2)));
        textPuntajeSiniestro2.setText(String.valueOf(tablaListarAdmin.getValueAt(seleccionar, 7)));
        textPuntox.setText(String.valueOf(tablaListarAdmin.getValueAt(seleccionar, 4)));
        textPuntoY.setText(String.valueOf(tablaListarAdmin.getValueAt(seleccionar, 5)));
        textTipoSiniestro.setText(String.valueOf(tablaListarAdmin.getValueAt(seleccionar, 1)));
    }//GEN-LAST:event_tablaListarAdminMouseClicked

    private void botonModificarSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarSiniestroActionPerformed
        if (textBrigadaSiniestro == null || textCodigoSiniestro == null || textDescSiniestro == null || textFechaFinSiniestro == null || textFechaInicioSiniestro == null || textPuntajeSiniestro2 == null || textPuntox == null || textPuntoY == null || textTipoSiniestro == null) {
            JOptionPane.showMessageDialog(null, "debe cliquear la tabla  ");
        } else {
            int codBrigada = Integer.valueOf(textBrigadaSiniestro.getText());
            int codigo = Integer.valueOf(textCodigoSiniestro.getText());
            String detalle = textDescSiniestro.getText();
            LocalDate fecha_resol = LocalDate.parse(textFechaFinSiniestro.getText());
            LocalDate fecha_Inicio = LocalDate.parse(textFechaInicioSiniestro.getText());
            int puntuacion = Integer.parseInt(textPuntajeSiniestro2.getText());
            int cood_x = Integer.parseInt(textPuntox.getText());
            int cood_y = Integer.parseInt(textPuntoY.getText());
            String tipo = textFechaInicioSiniestro.getText();
            Siniestro siniestro = new Siniestro(codigo, tipo, fecha_Inicio, cood_x, cood_y, detalle, fecha_resol, puntuacion, codBrigada);
            siniestroDB.modificarSiniestro(siniestro);
            actualizarTabla();
            mostrarTablaSiniestro();
        }
    }//GEN-LAST:event_botonModificarSiniestroActionPerformed

    private void botonFinalizarSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFinalizarSiniestroActionPerformed
        if (textBrigadaSiniestro == null || textCodigoSiniestro == null || textDescSiniestro == null || textFechaFinSiniestro == null || textFechaInicioSiniestro == null || textPuntajeSiniestro2 == null || textPuntox == null || textPuntoY == null || textTipoSiniestro == null) {
            JOptionPane.showMessageDialog(null, "debe cliquear la tabla  ");
        } else {
            int codBrigada = Integer.valueOf(textBrigadaSiniestro.getText());
            int codigo = Integer.valueOf(textCodigoSiniestro.getText());
            String detalle = textDescSiniestro.getText();
            LocalDate fecha_resol = LocalDate.parse(textFechaFinSiniestro.getText());
            LocalDate fecha_Inicio = LocalDate.parse(textFechaInicioSiniestro.getText());
            int puntuacion = Integer.parseInt(textPuntajeSiniestro2.getText());
            int cood_x = Integer.parseInt(textPuntox.getText());
            int cood_y = Integer.parseInt(textPuntoY.getText());
            String tipo = textFechaInicioSiniestro.getText();
            Siniestro siniestro = new Siniestro(codigo, tipo, fecha_Inicio, cood_x, cood_y, detalle, fecha_resol, puntuacion, codBrigada);
            siniestroDB.anotarTerminacionDeSiniestro(codigo, fecha_resol, puntuacion);

        }
    }//GEN-LAST:event_botonFinalizarSiniestroActionPerformed

    private void jcb48hsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb48hsActionPerformed
        if (jcb48hs.isSelected()) {
            actualizarTabla();
            modeloTablaSiniestro();
            mostrarTabla48hsSiniestro();
        } else {
            mostrarTablaSiniestro();
        }
    }//GEN-LAST:event_jcb48hsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonFinalizarSiniestro;
    private javax.swing.JButton botonModificarSiniestro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox jcb48hs;
    private javax.swing.JPanel panelBot;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelMid;
    private javax.swing.JPanel panelTop;
    private javax.swing.JTable tablaListarAdmin;
    private javax.swing.JTextField textBrigadaSiniestro;
    private javax.swing.JTextField textCodigoSiniestro;
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
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloSiniestroAct);
        tablaListarAdmin.setRowSorter(sorter);
        for (Siniestro siniestro : siniestros) {
            modeloSiniestroAct.addRow(new Object[]{
                siniestro.getCodigo(),
                siniestro.getTipo(),
                siniestro.getFecha_siniestro(),
                siniestro.getDetalles(),
                siniestro.getCoord_X(),
                siniestro.getCoord_Y(),
                siniestro.getFecha_resol(),
                siniestro.getPuntuacion(),
                siniestro.getCodBrigada()
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

    public void actualizarTabla() {
        DefaultTableModel mod = (DefaultTableModel) tablaListarAdmin.getModel();
        mod.setRowCount(0);
    }

    public void mostrarTabla48hsSiniestro() {
        Siniestro siniestro1 = new Siniestro();
        List<Siniestro> siniestros = siniestroDB.consultarSiniestros48hs(siniestro1);
        for (Siniestro siniestro : siniestros) {
            modeloSiniestroAct.addRow(new Object[]{
                siniestro.getCodigo(),
                siniestro.getTipo(),
                siniestro.getFecha_siniestro(),
                siniestro.getDetalles(),
                siniestro.getCoord_X(),
                siniestro.getCoord_Y(),
                siniestro.getFecha_resol(),
                siniestro.getPuntuacion(),
                siniestro.getCodBrigada()
            });
        }
    }
}
