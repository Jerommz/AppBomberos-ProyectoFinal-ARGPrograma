/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberos.Vistas;

import bomberos.AccesoADatos.CuartelData;
import bomberos.Entidades.Brigada;
import bomberos.Entidades.Cuartel;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 *
 * @author jero
 */
public class Cuarteles extends javax.swing.JPanel {

    CuartelData cuartelDB = new CuartelData();

    /**
     * Creates new form Bomberos
     */
    public Cuarteles() {
        initComponents();
        botones();
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

        panelRoot = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelInterno = new javax.swing.JPanel();
        panelInternoIzq = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelInternoDer = new javax.swing.JPanel();
        panelInternoDer2 = new javax.swing.JPanel();
        botonAgregarCuarteles = new javax.swing.JButton();
        botonEliminarCuarteles = new javax.swing.JButton();
        botonModificarCuarteles = new javax.swing.JButton();
        botonBuscarCuarteles = new javax.swing.JButton();
        panelInternoIzq2 = new javax.swing.JPanel();
        textNombreCuartel = new javax.swing.JTextField();
        textCodigoCuartel = new javax.swing.JTextField();
        textCorreoCuartel = new javax.swing.JTextField();
        textDireccionCuartel = new javax.swing.JTextField();
        textCoordenadasCuartel = new javax.swing.JTextField();
        textNumeroCuartel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        panelRoot.setPreferredSize(new java.awt.Dimension(1280, 640));

        jPanel1.setBackground(new Color(0,0,0,0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 640));

        jPanel2.setBackground(new java.awt.Color(161, 27, 27,20));
        jPanel2.setMinimumSize(new java.awt.Dimension(1000, 640));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 70);
        flowLayout1.setAlignOnBaseline(true);
        jPanel2.setLayout(flowLayout1);

        panelInterno.setBackground(new Color(161, 27, 27,180));
        panelInterno.setPreferredSize(new java.awt.Dimension(1000, 500));
        panelInterno.setLayout(new java.awt.BorderLayout());

        panelInternoIzq.setBackground(new Color(161, 27, 27,220));
        panelInternoIzq.setPreferredSize(new java.awt.Dimension(500, 0));
        panelInternoIzq.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Codigo de cuartel:");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 215;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 240, 20, 0);
        panelInternoIzq.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Direccion:");
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
        jLabel5.setText("Coordenadas:");
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
        jLabel8.setText("Correo electronico:");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 215;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 240, 20, 0);
        panelInternoIzq.add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Numero de telefono:");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 215;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 240, 20, 0);
        panelInternoIzq.add(jLabel9, gridBagConstraints);

        panelInterno.add(panelInternoIzq, java.awt.BorderLayout.WEST);

        panelInternoDer.setBackground(new Color(161, 27, 27,220));
        panelInternoDer.setPreferredSize(new java.awt.Dimension(500, 0));
        panelInternoDer.setLayout(new java.awt.BorderLayout());

        panelInternoDer2.setBackground(new Color(161, 27, 27,220));
        panelInternoDer2.setPreferredSize(new java.awt.Dimension(200, 0));
        panelInternoDer2.setLayout(new java.awt.GridBagLayout());

        botonAgregarCuarteles.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonAgregarCuarteles.setForeground(java.awt.Color.white);
        botonAgregarCuarteles.setText("Agregar");
        botonAgregarCuarteles.setBorder(null);
        botonAgregarCuarteles.setBorderPainted(false);
        botonAgregarCuarteles.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAgregarCuarteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarCuartelesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(80, 50, 0, 5);
        panelInternoDer2.add(botonAgregarCuarteles, gridBagConstraints);

        botonEliminarCuarteles.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonEliminarCuarteles.setForeground(java.awt.Color.white);
        botonEliminarCuarteles.setText("Eliminar");
        botonEliminarCuarteles.setBorder(null);
        botonEliminarCuarteles.setBorderPainted(false);
        botonEliminarCuarteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarCuartelesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(80, 49, 0, 5);
        panelInternoDer2.add(botonEliminarCuarteles, gridBagConstraints);

        botonModificarCuarteles.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonModificarCuarteles.setForeground(java.awt.Color.white);
        botonModificarCuarteles.setText("Modificar");
        botonModificarCuarteles.setBorder(null);
        botonModificarCuarteles.setBorderPainted(false);
        botonModificarCuarteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarCuartelesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(80, 45, 60, 45);
        panelInternoDer2.add(botonModificarCuarteles, gridBagConstraints);

        botonBuscarCuarteles.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonBuscarCuarteles.setForeground(java.awt.Color.white);
        botonBuscarCuarteles.setText("Buscar");
        botonBuscarCuarteles.setBorder(null);
        botonBuscarCuarteles.setBorderPainted(false);
        botonBuscarCuarteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarCuartelesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.insets = new java.awt.Insets(80, 50, 0, 5);
        panelInternoDer2.add(botonBuscarCuarteles, gridBagConstraints);

        panelInternoDer.add(panelInternoDer2, java.awt.BorderLayout.EAST);

        panelInternoIzq2.setBackground(new Color(161, 27, 27,220));
        panelInternoIzq2.setPreferredSize(new java.awt.Dimension(300, 0));
        panelInternoIzq2.setLayout(new java.awt.GridBagLayout());

        textNombreCuartel.setBackground(new Color(193,29,29));
        textNombreCuartel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textNombreCuartel.setForeground(java.awt.Color.white);
        textNombreCuartel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textNombreCuartel.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 5, 15, 0);
        panelInternoIzq2.add(textNombreCuartel, gridBagConstraints);

        textCodigoCuartel.setBackground(new Color(193,29,29));
        textCodigoCuartel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textCodigoCuartel.setForeground(java.awt.Color.white);
        textCodigoCuartel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textCodigoCuartel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textCodigoCuartel.setPreferredSize(new java.awt.Dimension(50, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 5, 15, 0);
        panelInternoIzq2.add(textCodigoCuartel, gridBagConstraints);

        textCorreoCuartel.setBackground(new Color(193,29,29));
        textCorreoCuartel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textCorreoCuartel.setForeground(java.awt.Color.white);
        textCorreoCuartel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textCorreoCuartel.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 5, 15, 0);
        panelInternoIzq2.add(textCorreoCuartel, gridBagConstraints);

        textDireccionCuartel.setBackground(new Color(193,29,29));
        textDireccionCuartel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textDireccionCuartel.setForeground(java.awt.Color.white);
        textDireccionCuartel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textDireccionCuartel.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 5, 15, 0);
        panelInternoIzq2.add(textDireccionCuartel, gridBagConstraints);

        textCoordenadasCuartel.setBackground(new Color(193,29,29));
        textCoordenadasCuartel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textCoordenadasCuartel.setForeground(java.awt.Color.white);
        textCoordenadasCuartel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textCoordenadasCuartel.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 5, 15, 0);
        panelInternoIzq2.add(textCoordenadasCuartel, gridBagConstraints);

        textNumeroCuartel.setBackground(new Color(193,29,29));
        textNumeroCuartel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textNumeroCuartel.setForeground(java.awt.Color.white);
        textNumeroCuartel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textNumeroCuartel.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 5, 15, 0);
        panelInternoIzq2.add(textNumeroCuartel, gridBagConstraints);

        panelInternoDer.add(panelInternoIzq2, java.awt.BorderLayout.WEST);

        panelInterno.add(panelInternoDer, java.awt.BorderLayout.EAST);

        jPanel2.add(panelInterno);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoCuartel.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1280, 853));
        jLabel1.setMinimumSize(new java.awt.Dimension(1280, 640));
        jLabel1.setPreferredSize(new java.awt.Dimension(1280, 640));

        javax.swing.GroupLayout panelRootLayout = new javax.swing.GroupLayout(panelRoot);
        panelRoot.setLayout(panelRootLayout);
        panelRootLayout.setHorizontalGroup(
            panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRootLayout.setVerticalGroup(
            panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(panelRoot, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarCuartelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarCuartelesActionPerformed
        // TODO add your handling code here:
        try {
            if (textCodigoCuartel.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Introduzca un codigo valido.");
                textCodigoCuartel.addKeyListener(new KeyAdapter() {
                    public void keyTyped(KeyEvent e) {
                        char c = e.getKeyChar();
                        if (!Character.isDigit(c)) {
                            e.consume(); // Ignora caracteres que no son dígitos
                        }
                    }
                });
                textNombreCuartel.addKeyListener(new KeyAdapter() {
                    public void keyTyped(KeyEvent e) {
                        char c = e.getKeyChar();
                        if (!(Character.isLetter(c) || c == ' ')) {
                            e.consume(); // Ignora caracteres que no son letras ni espacios
                        }
                    }
                });
                textDireccionCuartel.addKeyListener(new KeyAdapter() {
                    public void keyTyped(KeyEvent e) {
                        char c = e.getKeyChar();
                        if (!(Character.isLetter(c) || c == ' ')) {
                            e.consume(); // Ignora caracteres que no son letras ni espacios
                        }
                    }
                });
                textCoordenadasCuartel.addKeyListener(new KeyAdapter() {
                    public void keyTyped(KeyEvent e) {
                        char c = e.getKeyChar();
                        if (!Character.isDigit(c)) {
                            e.consume(); // Ignora caracteres que no son dígitos
                        }
                    }
                });
                textNumeroCuartel.addKeyListener(new KeyAdapter() {
                    public void keyTyped(KeyEvent e) {
                        char c = e.getKeyChar();
                        if (!Character.isDigit(c)) {
                            e.consume(); // Ignora caracteres que no son dígitos
                        }
                    }
                });
                textCorreoCuartel.addKeyListener(new KeyAdapter() {
                    public void keyTyped(KeyEvent e) {
                        char c = e.getKeyChar();
                        if (!(Character.isLetter(c) || c == ' ')) {
                            e.consume(); // Ignora caracteres que no son letras ni espacios
                        }
                    }
                });

            } else {
                int codBrigada = Integer.valueOf(textCodigoCuartel.getText());
                Cuartel cuartel = cuartelDB.buscarCuartel(codBrigada);
                textNombreCuartel.setText(cuartel.getNombre_cuartel());
                textDireccionCuartel.setText(cuartel.getDireccion());
                String coords = "X:" + cuartel.getCoord_X() + " Y:" + cuartel.getCoord_Y();
                textCoordenadasCuartel.setText(coords);
                textNumeroCuartel.setText(cuartel.getTelefono() + "");
                textCorreoCuartel.setText(cuartel.getCorreo());
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Cuartel no encontrado, corrija el codigo.");
        }
    }//GEN-LAST:event_botonBuscarCuartelesActionPerformed

    private void botonAgregarCuartelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarCuartelesActionPerformed
        // TODO add your handling code here:
        try {
            Component[] comps = panelInternoIzq2.getComponents();
            for (Component comp : comps) {
                if (comp instanceof JTextField) {
                    if (((JTextField) comp).getText().equals("")) {
                        textCodigoCuartel.addKeyListener(new KeyAdapter() {
                            public void keyTyped(KeyEvent e) {
                                char c = e.getKeyChar();
                                if (!Character.isDigit(c)) {
                                    e.consume(); // Ignora caracteres que no son dígitos
                                }
                            }
                        });
                        textNombreCuartel.addKeyListener(new KeyAdapter() {
                            public void keyTyped(KeyEvent e) {
                                char c = e.getKeyChar();
                                if (!(Character.isLetter(c) || c == ' ')) {
                                    e.consume(); // Ignora caracteres que no son letras ni espacios
                                }
                            }
                        });
                        textDireccionCuartel.addKeyListener(new KeyAdapter() {
                            public void keyTyped(KeyEvent e) {
                                char c = e.getKeyChar();
                                if (!(Character.isLetter(c) || c == ' ')) {
                                    e.consume(); // Ignora caracteres que no son letras ni espacios
                                }
                            }
                        });
                        textCoordenadasCuartel.addKeyListener(new KeyAdapter() {
                            public void keyTyped(KeyEvent e) {
                                char c = e.getKeyChar();
                                if (!Character.isDigit(c)) {
                                    e.consume(); // Ignora caracteres que no son dígitos
                                }
                            }
                        });
                        textNumeroCuartel.addKeyListener(new KeyAdapter() {
                            public void keyTyped(KeyEvent e) {
                                char c = e.getKeyChar();
                                if (!Character.isDigit(c)) {
                                    e.consume(); // Ignora caracteres que no son dígitos
                                }
                            }
                        });
                        textCorreoCuartel.addKeyListener(new KeyAdapter() {
                            public void keyTyped(KeyEvent e) {
                                char c = e.getKeyChar();
                                if (!(Character.isLetter(c) || c == ' ')) {
                                    e.consume(); // Ignora caracteres que no son letras ni espacios
                                }
                            }
                        });
                        JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio.");
                        break;
                    } else {
                        int codCuartel = Integer.valueOf(textCodigoCuartel.getText());
                        String nombre_cuartel = textNombreCuartel.getText();
                        String direccion = textDireccionCuartel.getText();
                        String cords = textCoordenadasCuartel.getText();
                        String[] cord = cords.split(" ");
                        String cordX = cord[0];
                        String cordY = cord[1];
                        int coord_X = cordX.charAt(cordX.length() - 1);
                        int coord_Y = cordY.charAt(cordY.length() - 1);
                        int telefono = Integer.valueOf(textNumeroCuartel.getText());
                        String correo = textCorreoCuartel.getText();
                        Cuartel cuartel = new Cuartel(codCuartel, nombre_cuartel, direccion, coord_X, coord_Y, telefono, correo);
                        cuartelDB.nuevoCuartel(cuartel);
                        break;
                    }
                }
            }
            textCodigoCuartel.setText("");
            textNombreCuartel.setText("");
            textDireccionCuartel.setText("");
            textCoordenadasCuartel.setText("");
            textNumeroCuartel.setText("");
            textCorreoCuartel.setText("");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar agregar una brigada nuevo.");
        }
    }//GEN-LAST:event_botonAgregarCuartelesActionPerformed

    private void botonEliminarCuartelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarCuartelesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarCuartelesActionPerformed

    private void botonModificarCuartelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarCuartelesActionPerformed
        // TODO add your handling code here:
        try {
            Component[] comps = panelInternoIzq2.getComponents();
            for (Component comp : comps) {
                if (comp instanceof JTextField) {
                    if (((JTextField) comp).getText().equals("")) {
                        textCodigoCuartel.addKeyListener(new KeyAdapter() {
                            public void keyTyped(KeyEvent e) {
                                char c = e.getKeyChar();
                                if (!Character.isDigit(c)) {
                                    e.consume(); // Ignora caracteres que no son dígitos
                                }
                            }
                        });
                        textNombreCuartel.addKeyListener(new KeyAdapter() {
                            public void keyTyped(KeyEvent e) {
                                char c = e.getKeyChar();
                                if (!(Character.isLetter(c) || c == ' ')) {
                                    e.consume(); // Ignora caracteres que no son letras ni espacios
                                }
                            }
                        });
                        textDireccionCuartel.addKeyListener(new KeyAdapter() {
                            public void keyTyped(KeyEvent e) {
                                char c = e.getKeyChar();
                                if (!(Character.isLetter(c) || c == ' ')) {
                                    e.consume(); // Ignora caracteres que no son letras ni espacios
                                }
                            }
                        });
                        textCoordenadasCuartel.addKeyListener(new KeyAdapter() {
                            public void keyTyped(KeyEvent e) {
                                char c = e.getKeyChar();
                                if (!Character.isDigit(c)) {
                                    e.consume(); // Ignora caracteres que no son dígitos
                                }
                            }
                        });
                        textNumeroCuartel.addKeyListener(new KeyAdapter() {
                            public void keyTyped(KeyEvent e) {
                                char c = e.getKeyChar();
                                if (!Character.isDigit(c)) {
                                    e.consume(); // Ignora caracteres que no son dígitos
                                }
                            }
                        });
                        textCorreoCuartel.addKeyListener(new KeyAdapter() {
                            public void keyTyped(KeyEvent e) {
                                char c = e.getKeyChar();
                                if (!(Character.isLetter(c) || c == ' ')) {
                                    e.consume(); // Ignora caracteres que no son letras ni espacios
                                }
                            }
                        });
                        JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio, primero realice una busqueda.");
                        break;
                    } else {
                        int codCuartel = Integer.valueOf(textCodigoCuartel.getText());
                        String nombre_cuartel = textNombreCuartel.getText();
                        String direccion = textDireccionCuartel.getText();
                        String cords = textCoordenadasCuartel.getText();
                        String[] cord = cords.split(" ");
                        String cordX = cord[0];
                        String cordY = cord[1];
                        int coord_X = cordX.charAt(cordX.length() - 1);
                        int coord_Y = cordY.charAt(cordY.length() - 1);
                        int telefono = Integer.valueOf(textNumeroCuartel.getText());
                        String correo = textCorreoCuartel.getText();
                        Cuartel cuartel = new Cuartel(codCuartel, nombre_cuartel, direccion, coord_X, coord_Y, telefono, correo);
                        cuartelDB.modificarCuartel(cuartel);
                        break;
                    }
                }
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar modificar brigada.");
        }
    }//GEN-LAST:event_botonModificarCuartelesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarCuarteles;
    private javax.swing.JButton botonBuscarCuarteles;
    private javax.swing.JButton botonEliminarCuarteles;
    private javax.swing.JButton botonModificarCuarteles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelInterno;
    private javax.swing.JPanel panelInternoDer;
    private javax.swing.JPanel panelInternoDer2;
    private javax.swing.JPanel panelInternoIzq;
    private javax.swing.JPanel panelInternoIzq2;
    private javax.swing.JPanel panelRoot;
    private javax.swing.JTextField textCodigoCuartel;
    private javax.swing.JTextField textCoordenadasCuartel;
    private javax.swing.JTextField textCorreoCuartel;
    private javax.swing.JTextField textDireccionCuartel;
    private javax.swing.JTextField textNombreCuartel;
    private javax.swing.JTextField textNumeroCuartel;
    // End of variables declaration//GEN-END:variables

    public void botones() {
        JButton btns[] = {botonAgregarCuarteles, botonEliminarCuarteles, botonModificarCuarteles, botonBuscarCuarteles};
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

}
