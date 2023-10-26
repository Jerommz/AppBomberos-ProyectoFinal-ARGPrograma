package bomberos.Vistas;

import bomberos.AccesoADatos.BrigadaData;
import bomberos.AccesoAdatos.BomberoData;
import bomberos.Entidades.Bombero;
import bomberos.Entidades.Brigada;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicButtonUI;

public final class Bomberos extends javax.swing.JPanel {

    BomberoData bomberoDB = new BomberoData();
    BrigadaData brigadaDB = new BrigadaData();
    String[] modelo = {"AB+", "AB-", "B+", "B-", "A+", "A-", "O+", "O-"};

    public Bomberos() {
        initComponents();
        botones();
        mostrarComboCodBrig(1);
        textNombreApBombero.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                if (textNombreApBombero.getText().length() >= 50) {
                    evt.consume();
                    JOptionPane.showMessageDialog(null, "Maximo 50 caracteres.");    // ---> Control de caracteres maximo por campo
                }
            }
        });
    }

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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelInternoDer = new javax.swing.JPanel();
        panelInternoDer2 = new javax.swing.JPanel();
        botonAgregarBombero = new javax.swing.JButton();
        botonEliminarBomberos = new javax.swing.JButton();
        botonModificarBomberos = new javax.swing.JButton();
        botonBuscarBomberos = new javax.swing.JButton();
        botonListarBombero = new javax.swing.JButton();
        panelInternoIzq2 = new javax.swing.JPanel();
        checkEstadoBombero = new javax.swing.JCheckBox();
        dateFechaNacBombero = new com.toedter.calendar.JDateChooser();
        comboCodBriBombero = new javax.swing.JComboBox<>();
        textCelularBombero = new javax.swing.JTextField();
        textNombreApBombero = new javax.swing.JTextField();
        textDNIBombero = new javax.swing.JTextField();
        textIDBombero = new javax.swing.JTextField();
        comboSangreBombero = new javax.swing.JComboBox<>(modelo);
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        panelRoot.setPreferredSize(new java.awt.Dimension(1280, 640));

        jPanel1.setBackground(new Color(0,0,0,0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 600));

        jPanel2.setBackground(new java.awt.Color(161, 27, 27,20));
        jPanel2.setMinimumSize(new java.awt.Dimension(1100, 640));
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
        jLabel2.setText("ID bombero:");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 215;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 240, 20, 0);
        panelInternoIzq.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Nombre y apellido:");
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
        jLabel4.setText("DNI:");
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
        jLabel5.setText("Celular:");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 215;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 240, 20, 0);
        panelInternoIzq.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Grupo sanguineo:");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 215;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 240, 20, 0);
        panelInternoIzq.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Fecha de nacimiento:");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 215;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 240, 20, 0);
        panelInternoIzq.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Codigo de brigada:");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 215;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 240, 20, 0);
        panelInternoIzq.add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Estado:");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
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

        botonAgregarBombero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonAgregarBombero.setForeground(java.awt.Color.white);
        botonAgregarBombero.setText("Agregar");
        botonAgregarBombero.setBorder(null);
        botonAgregarBombero.setBorderPainted(false);
        botonAgregarBombero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAgregarBombero.setMaximumSize(new java.awt.Dimension(100, 25));
        botonAgregarBombero.setPreferredSize(new java.awt.Dimension(100, 25));
        botonAgregarBombero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarBomberoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        panelInternoDer2.add(botonAgregarBombero, gridBagConstraints);

        botonEliminarBomberos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonEliminarBomberos.setForeground(java.awt.Color.white);
        botonEliminarBomberos.setText("Eliminar");
        botonEliminarBomberos.setBorder(null);
        botonEliminarBomberos.setBorderPainted(false);
        botonEliminarBomberos.setMaximumSize(new java.awt.Dimension(100, 25));
        botonEliminarBomberos.setPreferredSize(new java.awt.Dimension(100, 25));
        botonEliminarBomberos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarBomberosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        panelInternoDer2.add(botonEliminarBomberos, gridBagConstraints);

        botonModificarBomberos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonModificarBomberos.setForeground(java.awt.Color.white);
        botonModificarBomberos.setText("Modificar");
        botonModificarBomberos.setBorder(null);
        botonModificarBomberos.setBorderPainted(false);
        botonModificarBomberos.setMaximumSize(new java.awt.Dimension(100, 25));
        botonModificarBomberos.setPreferredSize(new java.awt.Dimension(100, 25));
        botonModificarBomberos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarBomberosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        panelInternoDer2.add(botonModificarBomberos, gridBagConstraints);

        botonBuscarBomberos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonBuscarBomberos.setForeground(java.awt.Color.white);
        botonBuscarBomberos.setText("Buscar");
        botonBuscarBomberos.setBorder(null);
        botonBuscarBomberos.setBorderPainted(false);
        botonBuscarBomberos.setMaximumSize(new java.awt.Dimension(100, 25));
        botonBuscarBomberos.setPreferredSize(new java.awt.Dimension(100, 25));
        botonBuscarBomberos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarBomberosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        panelInternoDer2.add(botonBuscarBomberos, gridBagConstraints);

        botonListarBombero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonListarBombero.setForeground(java.awt.Color.white);
        botonListarBombero.setText("Listar");
        botonListarBombero.setBorder(null);
        botonListarBombero.setBorderPainted(false);
        botonListarBombero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonListarBombero.setMaximumSize(new java.awt.Dimension(100, 25));
        botonListarBombero.setPreferredSize(new java.awt.Dimension(100, 25));
        botonListarBombero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarBomberoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        panelInternoDer2.add(botonListarBombero, gridBagConstraints);

        panelInternoDer.add(panelInternoDer2, java.awt.BorderLayout.EAST);

        panelInternoIzq2.setBackground(new Color(161, 27, 27,220));
        panelInternoIzq2.setPreferredSize(new java.awt.Dimension(300, 0));
        panelInternoIzq2.setLayout(new java.awt.GridBagLayout());

        checkEstadoBombero.setBackground(new Color(193,29,29));
        checkEstadoBombero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        checkEstadoBombero.setForeground(java.awt.Color.white);
        checkEstadoBombero.setText("Marque si esta activo o no");
        checkEstadoBombero.setBorder(null);
        checkEstadoBombero.setPreferredSize(new java.awt.Dimension(256, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 30;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 15, 0);
        panelInternoIzq2.add(checkEstadoBombero, gridBagConstraints);

        dateFechaNacBombero.setBackground(new Color(193,29,29));
        dateFechaNacBombero.setForeground(java.awt.Color.white);
        dateFechaNacBombero.setDateFormatString("dd-MM-yyyy");
        dateFechaNacBombero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dateFechaNacBombero.setPreferredSize(new java.awt.Dimension(215, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 15, 0);
        panelInternoIzq2.add(dateFechaNacBombero, gridBagConstraints);

        comboCodBriBombero.setBackground(new Color(193,29,29));
        comboCodBriBombero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        comboCodBriBombero.setForeground(java.awt.Color.white);
        comboCodBriBombero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        comboCodBriBombero.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 29;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 15, 0);
        panelInternoIzq2.add(comboCodBriBombero, gridBagConstraints);

        textCelularBombero.setBackground(new Color(193,29,29));
        textCelularBombero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textCelularBombero.setForeground(java.awt.Color.white);
        textCelularBombero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textCelularBombero.setPreferredSize(new java.awt.Dimension(200, 30));
        textCelularBombero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCelularBomberoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 15, 0);
        panelInternoIzq2.add(textCelularBombero, gridBagConstraints);

        textNombreApBombero.setBackground(new Color(193,29,29));
        textNombreApBombero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textNombreApBombero.setForeground(java.awt.Color.white);
        textNombreApBombero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textNombreApBombero.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 15, 0);
        panelInternoIzq2.add(textNombreApBombero, gridBagConstraints);

        textDNIBombero.setBackground(new Color(193,29,29));
        textDNIBombero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textDNIBombero.setForeground(java.awt.Color.white);
        textDNIBombero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textDNIBombero.setPreferredSize(new java.awt.Dimension(200, 30));
        textDNIBombero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textDNIBomberoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 15, 0);
        panelInternoIzq2.add(textDNIBombero, gridBagConstraints);

        textIDBombero.setEditable(false);
        textIDBombero.setBackground(new Color(193,29,29));
        textIDBombero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textIDBombero.setForeground(java.awt.Color.white);
        textIDBombero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textIDBombero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textIDBombero.setPreferredSize(new java.awt.Dimension(50, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 15, 0);
        panelInternoIzq2.add(textIDBombero, gridBagConstraints);

        comboSangreBombero.setBackground(new Color(193,29,29));
        comboSangreBombero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        comboSangreBombero.setForeground(java.awt.Color.white);
        comboSangreBombero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        comboSangreBombero.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 15, 0);
        panelInternoIzq2.add(comboSangreBombero, gridBagConstraints);

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoBombero.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1280, 853));
        jLabel1.setMinimumSize(new java.awt.Dimension(1280, 640));
        jLabel1.setPreferredSize(new java.awt.Dimension(1280, 640));

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

    private void botonBuscarBomberosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarBomberosActionPerformed
        // TODO add your handling code here:
        try {
            if (textDNIBombero.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Introduzca un DNI.");
            } else {
                String dni = textDNIBombero.getText();
                if (dni.matches("\\d+")) {
                    Bombero bombero = bomberoDB.buscarBomberoPorDni(Integer.valueOf(dni));
                    textIDBombero.setText(String.valueOf(bombero.getId_Bombero()));
                    textNombreApBombero.setText(bombero.getNombre_ape());
                    textCelularBombero.setText(String.valueOf(bombero.getCelular()));
                    comboSangreBombero.setSelectedItem((Object) bombero.getGrupo_sang());
                    dateFechaNacBombero.setDate(Date.valueOf(bombero.getFecha()));
                    mostrarComboCodBrig(bombero.getCodBrigada());
                    checkEstadoBombero.setSelected(bombero.isEstado());
                } else {
                    JOptionPane.showMessageDialog(null, "El campo DNI no puede contener letras.");
                }
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro bombero con ese DNI, pruebe con uno diferente.");
            textIDBombero.setText("");
            textCelularBombero.setText("");
            textDNIBombero.setText("");
        }
    }//GEN-LAST:event_botonBuscarBomberosActionPerformed

    private void botonAgregarBomberoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarBomberoActionPerformed
        // TODO add your handling code here:
        try {
            int cont = 0;
            Component[] comps = panelInternoIzq2.getComponents();
            for (Component comp : comps) {
                if (comp instanceof JTextField) {
                    if (((JTextField) comp).getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio.");
                        break;
                    } else {
                        String dni = textDNIBombero.getText();
                        String nombre_ape = textNombreApBombero.getText();
                        String celular = textCelularBombero.getText();
                        String fecha = ((JTextField) dateFechaNacBombero.getDateEditor().getUiComponent()).getText();

                        if (dni.matches("\\d+") && celular.matches("\\d+")) {
                            cont += 1;
                        } else {
                            JOptionPane.showMessageDialog(null, "Los campos dni y celular no pueden contener letras.");
                            break;
                        }
                        if (nombre_ape.matches("[a-z A-Z]+")) {
                            cont += 1;
                        } else {
                            JOptionPane.showMessageDialog(null, "El campo nombre no puede contener numeros.");
                            break;
                        }
                        if (fecha.matches("[-0-9]+")) {
                            cont += 1;
                        } else {
                            JOptionPane.showMessageDialog(null, "El campo fecha no puede contener letras.");
                            break;
                        }
                        if (cont == 3) {
                            String grupo_sang = String.valueOf(comboSangreBombero.getSelectedItem());
                            String codBrigada = String.valueOf(comboCodBriBombero.getSelectedItem());
                            boolean estado = checkEstadoBombero.isSelected();
                            Bombero bombero = new Bombero(Integer.valueOf(dni), nombre_ape, grupo_sang, LocalDate.parse(fecha), Integer.valueOf(celular), Integer.parseInt(codBrigada), estado);
                            bomberoDB.nuevoBombero(bombero);
                            textIDBombero.setText("");
                            textDNIBombero.setText("");
                            textNombreApBombero.setText("");
                            textCelularBombero.setText("");
                            dateFechaNacBombero.setDate(null);
                            checkEstadoBombero.setSelected(false);
                            break;
                        }
                    }
                }
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar agregar un bombero nuevo.");
        }
    }//GEN-LAST:event_botonAgregarBomberoActionPerformed

    private void botonEliminarBomberosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarBomberosActionPerformed
        // TODO add your handling code here:
        try {
            Component[] comps = panelInternoIzq2.getComponents();
            for (Component comp : comps) {
                if (comp instanceof JTextField) {
                    if (((JTextField) comp).getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio, primero realice una busqueda.");
                        break;
                    } else {
                        int dni = Integer.valueOf(textDNIBombero.getText());
                        bomberoDB.eliminarBombero(dni);
                        break;
                    }
                }
            }
            textIDBombero.setText("");
            textDNIBombero.setText("");
            textNombreApBombero.setText("");
            textCelularBombero.setText("");
            dateFechaNacBombero.setDate(null);
            checkEstadoBombero.setSelected(false);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar eliminar bombero.");
        }
    }//GEN-LAST:event_botonEliminarBomberosActionPerformed

    private void botonModificarBomberosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarBomberosActionPerformed
        // TODO add your handling code here:
        try {
            int cont = 0;
            Component[] comps = panelInternoIzq2.getComponents();
            for (Component comp : comps) {
                if (comp instanceof JTextField) {
                    if (((JTextField) comp).getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio, primero realice una busqueda.");
                        break;
                    } else {
                        int idBombero = Integer.valueOf(textIDBombero.getText());
                        String dni = textDNIBombero.getText();
                        String nombre_ape = textNombreApBombero.getText();
                        String celular = textCelularBombero.getText();
                        String fecha = ((JTextField) dateFechaNacBombero.getDateEditor().getUiComponent()).getText();
                        if (dni.matches("\\d+") && celular.matches("\\d+")) {
                            cont += 1;
                        } else {
                            JOptionPane.showMessageDialog(null, "Los campos dni y celular no pueden contener letras.");
                            break;
                        }
                        if (nombre_ape.matches("[a-z A-Z]+")) {
                            cont += 1;
                        } else {
                            JOptionPane.showMessageDialog(null, "El campo nombre no puede contener numeros.");
                            break;
                        }
                        if (fecha.matches("[-0-9]+")) {
                            cont += 1;
                        } else {
                            JOptionPane.showMessageDialog(null, "El campo fecha no puede contener letras.");
                            break;
                        }
                        if (cont == 3) {
                            String grupo_sang = String.valueOf(comboSangreBombero.getSelectedItem());
                            String codBrigada = String.valueOf(comboCodBriBombero.getSelectedItem());
                            boolean estado = checkEstadoBombero.isSelected();
                            Bombero bombero = new Bombero(idBombero, Integer.valueOf(dni), nombre_ape, grupo_sang, LocalDate.parse(fecha), Integer.valueOf(celular), Integer.parseInt(codBrigada), estado);
                            bomberoDB.modificarBombero(bombero);
                            break;
                        }
                    }
                }
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar modificar bombero.");
        }
    }//GEN-LAST:event_botonModificarBomberosActionPerformed

    private void textDNIBomberoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textDNIBomberoKeyTyped
        // TODO add your handling code here:
        if (textDNIBombero.getText().length() >= 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 8 numeros.");    // ---> Control de caracteres maximo por campo
        }
    }//GEN-LAST:event_textDNIBomberoKeyTyped

    private void textCelularBomberoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCelularBomberoKeyTyped
        // TODO add your handling code here:
        if (textCelularBombero.getText().length() >= 11) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 11 numeros.");    // ---> Control de caracteres maximo por campo
        }
    }//GEN-LAST:event_textCelularBomberoKeyTyped

    private void botonListarBomberoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarBomberoActionPerformed
        // TODO add your handling code here:
        mostrarPanel(new ListarBomberos());
    }//GEN-LAST:event_botonListarBomberoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarBombero;
    private javax.swing.JButton botonBuscarBomberos;
    private javax.swing.JButton botonEliminarBomberos;
    private javax.swing.JButton botonListarBombero;
    private javax.swing.JButton botonModificarBomberos;
    private javax.swing.JCheckBox checkEstadoBombero;
    private javax.swing.JComboBox<String> comboCodBriBombero;
    private javax.swing.JComboBox<String> comboSangreBombero;
    private com.toedter.calendar.JDateChooser dateFechaNacBombero;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel panelInterno;
    private javax.swing.JPanel panelInternoDer;
    private javax.swing.JPanel panelInternoDer2;
    private javax.swing.JPanel panelInternoIzq;
    private javax.swing.JPanel panelInternoIzq2;
    private javax.swing.JPanel panelRoot;
    private javax.swing.JTextField textCelularBombero;
    private javax.swing.JTextField textDNIBombero;
    private javax.swing.JTextField textIDBombero;
    private javax.swing.JTextField textNombreApBombero;
    // End of variables declaration//GEN-END:variables

    public void botones() {
        JButton btns[] = {botonAgregarBombero, botonEliminarBomberos, botonModificarBomberos, botonBuscarBomberos, botonListarBombero};
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

    public void mostrarComboCodBrig(int codBrigada) {
        List<Brigada> brigada = new ArrayList<>();
        brigada = brigadaDB.obtenerBrigadas();
        for (Brigada brigadas : brigada) {
            comboCodBriBombero.addItem(String.valueOf(brigadas.getCodBrigada()));
            int codigo = brigadas.getCodBrigada();
            listarComboCodBrig(codigo, codBrigada);
        }
    }

    public void listarComboCodBrig(int codigo, int codBrigada) {
        if (codigo == codBrigada) {
            comboCodBriBombero.setSelectedItem(String.valueOf(codigo));
        }
    }

    public void mostrarPanel(Component com) {
        panelInterno.removeAll();
        panelInterno.add(com);
        panelInterno.repaint();
        panelInterno.revalidate();
    }
}
