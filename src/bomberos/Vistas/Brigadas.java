package bomberos.Vistas;

import bomberos.AccesoADatos.BrigadaData;
import bomberos.AccesoADatos.CuartelData;
import bomberos.AccesoAdatos.BomberoData;
import bomberos.Entidades.Brigada;
import bomberos.Entidades.Cuartel;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicButtonUI;

public final class Brigadas extends javax.swing.JPanel {

    CuartelData cuartelDB = new CuartelData();
    BrigadaData brigadaDB = new BrigadaData();
    BomberoData bomberoDB = new BomberoData();

    public Brigadas() {
        initComponents();
        botones();
        mostrarComboCodCuart(1);
        textNombreBrigada.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                if (textNombreBrigada.getText().length() >= 20) {
                    evt.consume();
                    JOptionPane.showMessageDialog(null, "Maximo 20 caracteres.");    // ---> Control de caracteres maximo por campo
                }
            }
        });
        textEspecialidadBrigada.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                if (textEspecialidadBrigada.getText().length() >= 80) {
                    evt.consume();
                    JOptionPane.showMessageDialog(null, "Maximo 80 caracteres.");    // ---> Control de caracteres maximo por campo
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelRoot = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelInterno = new javax.swing.JPanel();
        panelInternoIzq = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelInternoDer = new javax.swing.JPanel();
        panelInternoDer2 = new javax.swing.JPanel();
        botonAgregarBrigadas = new javax.swing.JButton();
        botonEliminarBrigadas = new javax.swing.JButton();
        botonModificarBrigadas = new javax.swing.JButton();
        botonBuscarBrigadas = new javax.swing.JButton();
        botonListarBrigadas = new javax.swing.JButton();
        panelInternoIzq2 = new javax.swing.JPanel();
        checkLibreBrigada = new javax.swing.JCheckBox();
        textNombreBrigada = new javax.swing.JTextField();
        textCodigoBrigada = new javax.swing.JTextField();
        textEspecialidadBrigada = new javax.swing.JTextField();
        comboCodCuartelBrigada = new javax.swing.JComboBox<>();
        textBomberosActivos = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        panelRoot.setPreferredSize(new java.awt.Dimension(1280, 640));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoBrigada.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1280, 853));
        jLabel1.setMinimumSize(new java.awt.Dimension(1280, 640));
        jLabel1.setPreferredSize(new java.awt.Dimension(1280, 640));

        jPanel1.setBackground(new Color(0,0,0,0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 600));

        jPanel2.setBackground(new java.awt.Color(161, 27, 27,20));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 70);
        flowLayout1.setAlignOnBaseline(true);
        jPanel2.setLayout(flowLayout1);

        panelInterno.setBackground(new Color(161, 27, 27,180));
        panelInterno.setMinimumSize(new java.awt.Dimension(1000, 500));
        panelInterno.setPreferredSize(new java.awt.Dimension(1000, 500));
        panelInterno.setLayout(new java.awt.BorderLayout());

        panelInternoIzq.setBackground(new Color(161, 27, 27,220));
        panelInternoIzq.setPreferredSize(new java.awt.Dimension(500, 0));
        panelInternoIzq.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Codigo de brigada:");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 215;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 240, 20, 0);
        panelInternoIzq.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Especialidad:");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 215;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 240, 20, 0);
        panelInternoIzq.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Nombre:");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 215;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 240, 20, 0);
        panelInternoIzq.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Libre:");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 215;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 240, 20, 0);
        panelInternoIzq.add(jLabel5, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Codigo de cuartel:");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 215;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 240, 20, 0);
        panelInternoIzq.add(jLabel8, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Bomberos activos:");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 215;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 240, 20, 0);
        panelInternoIzq.add(jLabel6, gridBagConstraints);

        panelInterno.add(panelInternoIzq, java.awt.BorderLayout.WEST);

        panelInternoDer.setBackground(new Color(161, 27, 27,220));
        panelInternoDer.setPreferredSize(new java.awt.Dimension(500, 0));
        panelInternoDer.setLayout(new java.awt.BorderLayout());

        panelInternoDer2.setBackground(new Color(161, 27, 27,220));
        panelInternoDer2.setPreferredSize(new java.awt.Dimension(200, 0));
        panelInternoDer2.setLayout(new java.awt.GridBagLayout());

        botonAgregarBrigadas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonAgregarBrigadas.setForeground(java.awt.Color.white);
        botonAgregarBrigadas.setText("Agregar");
        botonAgregarBrigadas.setBorder(null);
        botonAgregarBrigadas.setBorderPainted(false);
        botonAgregarBrigadas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAgregarBrigadas.setPreferredSize(new java.awt.Dimension(100, 25));
        botonAgregarBrigadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarBrigadasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        panelInternoDer2.add(botonAgregarBrigadas, gridBagConstraints);

        botonEliminarBrigadas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonEliminarBrigadas.setForeground(java.awt.Color.white);
        botonEliminarBrigadas.setText("Eliminar");
        botonEliminarBrigadas.setBorder(null);
        botonEliminarBrigadas.setBorderPainted(false);
        botonEliminarBrigadas.setPreferredSize(new java.awt.Dimension(100, 25));
        botonEliminarBrigadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarBrigadasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        panelInternoDer2.add(botonEliminarBrigadas, gridBagConstraints);

        botonModificarBrigadas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonModificarBrigadas.setForeground(java.awt.Color.white);
        botonModificarBrigadas.setText("Modificar");
        botonModificarBrigadas.setBorder(null);
        botonModificarBrigadas.setBorderPainted(false);
        botonModificarBrigadas.setPreferredSize(new java.awt.Dimension(100, 25));
        botonModificarBrigadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarBrigadasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        panelInternoDer2.add(botonModificarBrigadas, gridBagConstraints);

        botonBuscarBrigadas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonBuscarBrigadas.setForeground(java.awt.Color.white);
        botonBuscarBrigadas.setText("Buscar");
        botonBuscarBrigadas.setBorder(null);
        botonBuscarBrigadas.setBorderPainted(false);
        botonBuscarBrigadas.setPreferredSize(new java.awt.Dimension(100, 25));
        botonBuscarBrigadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarBrigadasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        panelInternoDer2.add(botonBuscarBrigadas, gridBagConstraints);

        botonListarBrigadas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonListarBrigadas.setForeground(java.awt.Color.white);
        botonListarBrigadas.setText("Listar");
        botonListarBrigadas.setBorder(null);
        botonListarBrigadas.setBorderPainted(false);
        botonListarBrigadas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonListarBrigadas.setMaximumSize(new java.awt.Dimension(100, 25));
        botonListarBrigadas.setPreferredSize(new java.awt.Dimension(100, 25));
        botonListarBrigadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarBrigadasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        panelInternoDer2.add(botonListarBrigadas, gridBagConstraints);

        panelInternoDer.add(panelInternoDer2, java.awt.BorderLayout.EAST);

        panelInternoIzq2.setBackground(new Color(161, 27, 27,220));
        panelInternoIzq2.setPreferredSize(new java.awt.Dimension(300, 0));
        panelInternoIzq2.setLayout(new java.awt.GridBagLayout());

        checkLibreBrigada.setBackground(new Color(193,29,29));
        checkLibreBrigada.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        checkLibreBrigada.setForeground(java.awt.Color.white);
        checkLibreBrigada.setText("Marque si esta libre o no");
        checkLibreBrigada.setBorder(null);
        checkLibreBrigada.setPreferredSize(new java.awt.Dimension(256, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 30;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 5, 15, 0);
        panelInternoIzq2.add(checkLibreBrigada, gridBagConstraints);

        textNombreBrigada.setBackground(new Color(193,29,29));
        textNombreBrigada.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textNombreBrigada.setForeground(java.awt.Color.white);
        textNombreBrigada.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textNombreBrigada.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 5, 15, 0);
        panelInternoIzq2.add(textNombreBrigada, gridBagConstraints);

        textCodigoBrigada.setBackground(new Color(193,29,29));
        textCodigoBrigada.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textCodigoBrigada.setForeground(java.awt.Color.white);
        textCodigoBrigada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textCodigoBrigada.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textCodigoBrigada.setPreferredSize(new java.awt.Dimension(50, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 5, 15, 0);
        panelInternoIzq2.add(textCodigoBrigada, gridBagConstraints);

        textEspecialidadBrigada.setBackground(new Color(193,29,29));
        textEspecialidadBrigada.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        textEspecialidadBrigada.setForeground(java.awt.Color.white);
        textEspecialidadBrigada.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textEspecialidadBrigada.setPreferredSize(new java.awt.Dimension(250, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 5, 15, 0);
        panelInternoIzq2.add(textEspecialidadBrigada, gridBagConstraints);

        comboCodCuartelBrigada.setBackground(new Color(193,29,29));
        comboCodCuartelBrigada.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        comboCodCuartelBrigada.setForeground(java.awt.Color.white);
        comboCodCuartelBrigada.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        comboCodCuartelBrigada.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 32;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 15, 0);
        panelInternoIzq2.add(comboCodCuartelBrigada, gridBagConstraints);

        textBomberosActivos.setEditable(false);
        textBomberosActivos.setBackground(new Color(193,29,29));
        textBomberosActivos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textBomberosActivos.setForeground(java.awt.Color.white);
        textBomberosActivos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textBomberosActivos.setPreferredSize(new java.awt.Dimension(50, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 33;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 5, 15, 0);
        panelInternoIzq2.add(textBomberosActivos, gridBagConstraints);

        panelInternoDer.add(panelInternoIzq2, java.awt.BorderLayout.WEST);

        panelInterno.add(panelInternoDer, java.awt.BorderLayout.EAST);

        jPanel2.add(panelInterno);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelRootLayout = new javax.swing.GroupLayout(panelRoot);
        panelRoot.setLayout(panelRootLayout);
        panelRootLayout.setHorizontalGroup(
            panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
            .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRootLayout.setVerticalGroup(
            panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(panelRoot, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarBrigadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarBrigadasActionPerformed
        // TODO add your handling code here:
        try {
            if (textCodigoBrigada.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Introduzca un codigo valido.");
            } else {
                String codBrigada = textCodigoBrigada.getText();
                if (codBrigada.matches("\\d+")) {
                    Brigada brigada = brigadaDB.buscarBrigada(Integer.valueOf(codBrigada));
                    textCodigoBrigada.setText(Integer.toString(brigada.getCodBrigada()));                        //<------ control de no ingreso de letras al buscar
                    textNombreBrigada.setText(brigada.getNombre_br());
                    textEspecialidadBrigada.setText(brigada.getEspecialidad());
                    checkLibreBrigada.setSelected(brigada.isLibre());
                    mostrarComboCodCuart(brigada.getCodCuartel());
                    textBomberosActivos.setText(bomberoDB.sumarBomberos(Integer.valueOf(codBrigada)) + "");
                } else {
                    JOptionPane.showMessageDialog(null, "El campo codigo no puede contener letras.");
                    textCodigoBrigada.setText("");
                    textNombreBrigada.setText("");
                    textEspecialidadBrigada.setText("");
                    checkLibreBrigada.setSelected(false);
                }
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Brigada no encontrada, corrija el codigo.");
        }
    }//GEN-LAST:event_botonBuscarBrigadasActionPerformed

    private void botonAgregarBrigadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarBrigadasActionPerformed
        // TODO add your handling code here:
        try {
            Component[] comps = panelInternoIzq2.getComponents();
            for (Component comp : comps) {
                if (comp instanceof JTextField) {
                    if (((JTextField) comp).getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio.");
                        break;
                    } else {
                        //String codBrigada = textCodigoBrigada.getText();
                        String nomBrig = textNombreBrigada.getText();
                        if (!nomBrig.matches("\\d+")) {
                            String nombre_br = textNombreBrigada.getText();
                            String especialidad = textEspecialidadBrigada.getText();
                            boolean libre = checkLibreBrigada.isSelected();
                            String codCuartel = String.valueOf(comboCodCuartelBrigada.getSelectedItem());
                            Brigada brigada = new Brigada(nombre_br, especialidad, libre, Integer.parseInt(codCuartel));
                            brigadaDB.nuevaBrigada(brigada);
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "El campo codigo no puede contener letras.");
                            textCodigoBrigada.setText("");
                            textNombreBrigada.setText("");
                            textEspecialidadBrigada.setText("");
                            checkLibreBrigada.setSelected(false);
                            break;
                        }
                    }
                }
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar agregar una brigada nuevo.");
        }
    }//GEN-LAST:event_botonAgregarBrigadasActionPerformed

    private void botonEliminarBrigadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarBrigadasActionPerformed
        // TODO add your handling code here:
        try {
            Component[] comps = panelInternoIzq2.getComponents();
            for (Component comp : comps) {
                if (comp instanceof JTextField) {
                    if (((JTextField) comp).getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio, primero realice una busqueda.");
                        break;
                    } else {
                        int codBrig = Integer.valueOf(textCodigoBrigada.getText());
                        brigadaDB.eliminarBrigada(codBrig);
                        break;
                    }
                }
            }
            textCodigoBrigada.setText("");
            textNombreBrigada.setText("");
            textEspecialidadBrigada.setText("");
            comboCodCuartelBrigada.setSelectedItem("");
            checkLibreBrigada.setSelected(false);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar eliminar brigada.");
        }
    }//GEN-LAST:event_botonEliminarBrigadasActionPerformed

    private void botonModificarBrigadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarBrigadasActionPerformed
        // TODO add your handling code here:
        try {
            Component[] comps = panelInternoIzq2.getComponents();
            for (Component comp : comps) {
                if (comp instanceof JTextField) {
                    if (((JTextField) comp).getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio, primero realice una busqueda.");
                        break;
                    } else {
                        String codBrigada = textCodigoBrigada.getText();
                        if (codBrigada.matches("\\d+")) {
                            String nombre_br = textNombreBrigada.getText();
                            String especialidad = textEspecialidadBrigada.getText();
                            boolean libre = checkLibreBrigada.isSelected();
                            String codCuartel = String.valueOf(comboCodCuartelBrigada.getSelectedItem());
                            Brigada brigada = new Brigada(nombre_br, especialidad, libre, Integer.parseInt(codCuartel));
                            brigadaDB.modificarBrigada(brigada);
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "El campo codigo no puede contener letras.");
                            textCodigoBrigada.setText("");
                            textNombreBrigada.setText("");
                            textEspecialidadBrigada.setText("");
                            checkLibreBrigada.setSelected(false);
                            break;
                        }
                    }
                }
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar modificar brigada.");
        }
    }//GEN-LAST:event_botonModificarBrigadasActionPerformed

    private void botonListarBrigadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarBrigadasActionPerformed
        // TODO add your handling code here:
        mostrarPanel(new ListarBrigadas());
    }//GEN-LAST:event_botonListarBrigadasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarBrigadas;
    private javax.swing.JButton botonBuscarBrigadas;
    private javax.swing.JButton botonEliminarBrigadas;
    private javax.swing.JButton botonListarBrigadas;
    private javax.swing.JButton botonModificarBrigadas;
    private javax.swing.JCheckBox checkLibreBrigada;
    private javax.swing.JComboBox<String> comboCodCuartelBrigada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelInterno;
    private javax.swing.JPanel panelInternoDer;
    private javax.swing.JPanel panelInternoDer2;
    private javax.swing.JPanel panelInternoIzq;
    private javax.swing.JPanel panelInternoIzq2;
    private javax.swing.JPanel panelRoot;
    private javax.swing.JTextField textBomberosActivos;
    private javax.swing.JTextField textCodigoBrigada;
    private javax.swing.JTextField textEspecialidadBrigada;
    private javax.swing.JTextField textNombreBrigada;
    // End of variables declaration//GEN-END:variables

    public void botones() {
        JButton btns[] = {botonAgregarBrigadas, botonEliminarBrigadas, botonModificarBrigadas, botonBuscarBrigadas, botonListarBrigadas};
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

    public void mostrarComboCodCuart(int codCuartel) {
        List<Cuartel> cuarteles = new ArrayList<>();
        cuarteles = cuartelDB.obtenerCuarteles();
        for (Cuartel cuartel : cuarteles) {
            comboCodCuartelBrigada.addItem(String.valueOf(cuartel.getCodCuartel()));
            int codigo = cuartel.getCodCuartel();
            listarComboCodBrig(codigo, codCuartel);
        }
    }

    public void listarComboCodBrig(int codigo, int codCuartel) {
        if (codigo == codCuartel) {
            comboCodCuartelBrigada.setSelectedItem(String.valueOf(codigo));
        }
    }

    public void mostrarPanel(Component com) {
        panelInterno.removeAll();
        panelInterno.add(com);
        panelInterno.repaint();
        panelInterno.revalidate();
    }
}
