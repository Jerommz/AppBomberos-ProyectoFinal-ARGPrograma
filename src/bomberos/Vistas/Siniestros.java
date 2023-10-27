package bomberos.Vistas;

import bomberos.AccesoADatos.BrigadaData;
import bomberos.AccesoADatos.CuartelData;
import bomberos.AccesoADatos.SiniestroData;
import bomberos.Entidades.Brigada;
import bomberos.Entidades.Siniestro;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import bomberos.Entidades.Cuartel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JTextField;

public final class Siniestros extends javax.swing.JPanel {

    SiniestroData siniestroDB = new SiniestroData();
    CuartelData cuartelDB = new CuartelData();
    BrigadaData brigadaDB = new BrigadaData();

    String[] modelo = {"(1)Incendios en viviendas e industrias.",
        "(2)Salvamento en derrumbes.",
        "(3)Rescates en ambito montaña.",
        "(4)Rescate de personas atrapadas en accidentes de trafico.",
        "(5)Socorrer inundaciones.",
        "(6)Operativos de prevencion."};

    String[] modeloBrigada = {"ID", "Nombre", "Especialidad", "Libre", "Distancia"};
    DefaultTableModel modeloBrigadaArt = new DefaultTableModel(null, modeloBrigada) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    public Siniestros() {
        initComponents();
        botones();
        modeloTablaBrigada();
        
        LocalDate fecha = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String text = fecha.format(format);
        textFechaSiniestro.setText(String.valueOf(text));
        
        textAreaDescripcion.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                if (textAreaDescripcion.getText().length() >= 80) {
                    evt.consume();
                    JOptionPane.showMessageDialog(null, "Maximo 80 caracteres para detalle de Siniestros.");
                }
            }
        });

        textCoordX.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                if (textCoordX.getText().length() >= 2) {
                    evt.consume();
                    JOptionPane.showMessageDialog(null, "Maximo 2 caracteres para coordenada X de Siniestros.");
                }
            }
        });

        textCoordY.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                if (textCoordY.getText().length() >= 2) {
                    evt.consume();
                    JOptionPane.showMessageDialog(null, "Maximo 2 caracteres para coordenada Y de Siniestros.");
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        popupMenu = new javax.swing.JPopupMenu();
        popmenuMarcar = new javax.swing.JMenuItem();
        panelRoot = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelIzq = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comboTipoAccidenteSiniestro = new javax.swing.JComboBox<>(modelo);
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textFechaSiniestro = new javax.swing.JTextField();
        textCoordY = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        textAreaDescripcion = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        textCoordX = new javax.swing.JTextField();
        botonCalcularSiniestro = new javax.swing.JButton();
        botonListarSiniestro = new javax.swing.JButton();
        botonRegistrarSiniestro = new javax.swing.JButton();
        panelDer = new javax.swing.JPanel();
        panelDerTop = new javax.swing.JPanel();
        textCuartelCercano = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textDistancia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textDireccion = new javax.swing.JTextField();
        textCoordY1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        textCoordX1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        panelDerBot = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTbrigadas = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        popmenuMarcar.setText("Marcar");
        popupMenu.add(popmenuMarcar);

        panelRoot.setPreferredSize(new java.awt.Dimension(1280, 640));

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 640));

        jPanel2.setBackground(new Color (161, 27, 27,64));
        jPanel2.setPreferredSize(new java.awt.Dimension(1280, 640));
        jPanel2.setLayout(new java.awt.BorderLayout());

        panelIzq.setBackground(new Color (161, 27, 27,160));
        panelIzq.setPreferredSize(new java.awt.Dimension(300, 0));
        panelIzq.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Detalle del accidente:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 0);
        panelIzq.add(jLabel2, gridBagConstraints);

        comboTipoAccidenteSiniestro.setBackground(new Color(193,29,29));
        comboTipoAccidenteSiniestro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        comboTipoAccidenteSiniestro.setForeground(java.awt.Color.white);
        comboTipoAccidenteSiniestro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        comboTipoAccidenteSiniestro.setPreferredSize(new java.awt.Dimension(250, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 10, 0);
        panelIzq.add(comboTipoAccidenteSiniestro, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Tipo de accidente:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panelIzq.add(jLabel5, gridBagConstraints);

        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("X:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 55, 10, 0);
        panelIzq.add(jLabel8, gridBagConstraints);

        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Y:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 10, 0);
        panelIzq.add(jLabel9, gridBagConstraints);

        textFechaSiniestro.setEditable(false);
        textFechaSiniestro.setBackground(new Color(193,29,29));
        textFechaSiniestro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textFechaSiniestro.setForeground(java.awt.Color.white);
        textFechaSiniestro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textFechaSiniestro.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 10, 0);
        panelIzq.add(textFechaSiniestro, gridBagConstraints);

        textCoordY.setBackground(new Color(193,29,29));
        textCoordY.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textCoordY.setForeground(java.awt.Color.white);
        textCoordY.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textCoordY.setPreferredSize(new java.awt.Dimension(40, 30));
        textCoordY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCoordYKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.insets = new java.awt.Insets(5, 65, 10, 0);
        panelIzq.add(textCoordY, gridBagConstraints);

        textAreaDescripcion.setBackground(new Color(193,29,29));
        textAreaDescripcion.setColumns(20);
        textAreaDescripcion.setRows(5);
        textAreaDescripcion.setBorder(null);
        jScrollPane4.setViewportView(textAreaDescripcion);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelIzq.add(jScrollPane4, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Fecha:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panelIzq.add(jLabel10, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(java.awt.Color.white);
        jLabel11.setText("Coordenadas:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panelIzq.add(jLabel11, gridBagConstraints);

        textCoordX.setBackground(new Color(193,29,29));
        textCoordX.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textCoordX.setForeground(java.awt.Color.white);
        textCoordX.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textCoordX.setPreferredSize(new java.awt.Dimension(40, 30));
        textCoordX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCoordXKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 70, 10, 0);
        panelIzq.add(textCoordX, gridBagConstraints);

        botonCalcularSiniestro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonCalcularSiniestro.setForeground(java.awt.Color.white);
        botonCalcularSiniestro.setText("Calcular");
        botonCalcularSiniestro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botonCalcularSiniestro.setBorderPainted(false);
        botonCalcularSiniestro.setPreferredSize(new java.awt.Dimension(140, 30));
        botonCalcularSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularSiniestroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        panelIzq.add(botonCalcularSiniestro, gridBagConstraints);

        botonListarSiniestro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonListarSiniestro.setForeground(java.awt.Color.white);
        botonListarSiniestro.setText("Listar siniestros");
        botonListarSiniestro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botonListarSiniestro.setBorderPainted(false);
        botonListarSiniestro.setPreferredSize(new java.awt.Dimension(140, 30));
        botonListarSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarSiniestroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        panelIzq.add(botonListarSiniestro, gridBagConstraints);

        botonRegistrarSiniestro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonRegistrarSiniestro.setForeground(java.awt.Color.white);
        botonRegistrarSiniestro.setText("Registrar");
        botonRegistrarSiniestro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botonRegistrarSiniestro.setBorderPainted(false);
        botonRegistrarSiniestro.setPreferredSize(new java.awt.Dimension(140, 30));
        botonRegistrarSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarSiniestroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        panelIzq.add(botonRegistrarSiniestro, gridBagConstraints);

        jPanel2.add(panelIzq, java.awt.BorderLayout.WEST);

        panelDer.setBackground(new Color (161, 27, 27,64));
        panelDer.setPreferredSize(new java.awt.Dimension(980, 0));
        panelDer.setLayout(new java.awt.BorderLayout());

        panelDerTop.setBackground(new Color(184, 34, 34));
        panelDerTop.setPreferredSize(new java.awt.Dimension(980, 300));
        panelDerTop.setLayout(new java.awt.GridBagLayout());

        textCuartelCercano.setEditable(false);
        textCuartelCercano.setBackground(new Color(201, 16, 40));
        textCuartelCercano.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textCuartelCercano.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 35, 0, 0);
        panelDerTop.add(textCuartelCercano, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Distancia");
        jLabel3.setMaximumSize(new java.awt.Dimension(200, 30));
        jLabel3.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelDerTop.add(jLabel3, gridBagConstraints);

        textDistancia.setEditable(false);
        textDistancia.setBackground(new Color(201, 16, 40));
        textDistancia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textDistancia.setPreferredSize(new java.awt.Dimension(80, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 110);
        panelDerTop.add(textDistancia, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Cuartel mas cercano");
        jLabel4.setMaximumSize(new java.awt.Dimension(200, 30));
        jLabel4.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 45, 0, 0);
        panelDerTop.add(jLabel4, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Ubicacion");
        jLabel6.setMaximumSize(new java.awt.Dimension(200, 30));
        jLabel6.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 80, 0, 105);
        panelDerTop.add(jLabel6, gridBagConstraints);

        textDireccion.setEditable(false);
        textDireccion.setBackground(new Color(201, 16, 40));
        textDireccion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textDireccion.setPreferredSize(new java.awt.Dimension(150, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 9, 0, 40);
        panelDerTop.add(textDireccion, gridBagConstraints);

        textCoordY1.setEditable(false);
        textCoordY1.setBackground(new Color(201, 16, 40));
        textCoordY1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textCoordY1.setForeground(java.awt.Color.white);
        textCoordY1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textCoordY1.setPreferredSize(new java.awt.Dimension(40, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 65, 10, 20);
        panelDerTop.add(textCoordY1, gridBagConstraints);

        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setText("Y:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 10, 20);
        panelDerTop.add(jLabel12, gridBagConstraints);

        textCoordX1.setEditable(false);
        textCoordX1.setBackground(new Color(201, 16, 40));
        textCoordX1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textCoordX1.setForeground(java.awt.Color.white);
        textCoordX1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textCoordX1.setPreferredSize(new java.awt.Dimension(40, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 70, 10, 20);
        panelDerTop.add(textCoordX1, gridBagConstraints);

        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("X:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 55, 10, 20);
        panelDerTop.add(jLabel13, gridBagConstraints);

        panelDer.add(panelDerTop, java.awt.BorderLayout.NORTH);

        panelDerBot.setBackground(new Color(184, 34, 34));
        panelDerBot.setPreferredSize(new java.awt.Dimension(980, 300));
        panelDerBot.setLayout(new java.awt.BorderLayout());

        jTbrigadas.setBackground(new Color(193,29,29));
        jTbrigadas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTbrigadas.setForeground(java.awt.Color.white);
        jTbrigadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTbrigadas.setRowHeight(24);
        jScrollPane2.setViewportView(jTbrigadas);

        panelDerBot.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jLabel7.setBackground(new Color(184, 34, 34));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Brigadas");
        panelDerBot.add(jLabel7, java.awt.BorderLayout.PAGE_START);

        panelDer.add(panelDerBot, java.awt.BorderLayout.SOUTH);

        jPanel2.add(panelDer, java.awt.BorderLayout.EAST);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoSiniestro.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1280, 853));
        jLabel1.setMinimumSize(new java.awt.Dimension(1280, 640));
        jLabel1.setPreferredSize(new java.awt.Dimension(1280, 640));

        javax.swing.GroupLayout panelRootLayout = new javax.swing.GroupLayout(panelRoot);
        panelRoot.setLayout(panelRootLayout);
        panelRootLayout.setHorizontalGroup(
            panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRootLayout.setVerticalGroup(
            panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonCalcularSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularSiniestroActionPerformed
        // TODO add your handling code here:
        try {
            Component[] comps = panelIzq.getComponents();
            for (Component comp : comps) {
                if (comp instanceof JTextField) {
                    if (((JTextField) comp).getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio para calcular el siniestro.");
                        break;
                    } else {
                        String textXsin = textCoordX.getText();
                        String textYsin = textCoordY.getText();
                        if (!textXsin.matches("\\d+") || !textYsin.matches("\\d+")) {
                            JOptionPane.showMessageDialog(null, "Las coordenadas X e Y deben ser solo numericas.");
                            break;
                        } else {
                            int xSiniestro = Integer.valueOf(textCoordX.getText());
                            int ySiniestro = Integer.valueOf(textCoordY.getText());
                            double min = 0;
                            double sum = 100;
                            int codCuartel = 0;
                            List<Cuartel> cuarteles = cuartelDB.obtenerCuarteles();
                            for (Cuartel cuartel : cuarteles) {
                                int xCuartel = cuartel.getCoord_X();
                                int yCuartel = cuartel.getCoord_Y();
                                int cod = cuartel.getCodCuartel();
                                min = Math.hypot(xCuartel - xSiniestro, yCuartel - ySiniestro);
                                if (min <= sum) {
                                    sum = min;
                                    codCuartel = cod;
                                }
                            }
                            String desc = textAreaDescripcion.getText();
                            String tipo = comboTipoAccidenteSiniestro.getSelectedItem().toString();
                            Cuartel cuartel = cuartelDB.buscarCuartel(codCuartel);
                            List<Brigada> brigadas = brigadaDB.listarBrigadas(codCuartel);
                            mostrarTablaBrigada(brigadas);
                            textCuartelCercano.setText(cuartel.getNombre_cuartel());
                            textCoordX1.setText(cuartel.getCoord_X() + "");
                            textCoordY1.setText(cuartel.getCoord_Y() + "");
                            textDireccion.setText(cuartel.getDireccion());
                            double distancia = Math.round(sum * 100.0) / 100.0;
                            textDistancia.setText(distancia + "");
                        }
                    }
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar calcular siniestro.");
        }
    }//GEN-LAST:event_botonCalcularSiniestroActionPerformed

    private void textCoordXKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCoordXKeyTyped
        // TODO add your handling code here:
        if (textCoordX.getText().length() >= 3) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 3 numeros para las coordenadas X en Siniestros.");
        }
    }//GEN-LAST:event_textCoordXKeyTyped

    private void textCoordYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCoordYKeyTyped
        // TODO add your handling code here:
        if (textCoordY.getText().length() >= 3) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 3 numeros para las coordenadas Y en Siniestros.");
        }
    }//GEN-LAST:event_textCoordYKeyTyped

    private void botonListarSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarSiniestroActionPerformed
        // TODO add your handling code here:
        mostrarPanel(new ListarSiniestros());
    }//GEN-LAST:event_botonListarSiniestroActionPerformed

    private void botonRegistrarSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarSiniestroActionPerformed

        try {
            boolean campoVacio = false;
            Component[] comps = panelIzq.getComponents();
            for (Component comp : comps) {
                if (comp instanceof JTextField) {
                    if (((JTextField) comp).getText().isEmpty()) {
                        campoVacio = true;
                        break;
                    }
                }
            }
            if (campoVacio) {
                JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio para calcular el siniestro.");
            } else {
                String textXsin = textCoordX.getText();
                String textYsin = textCoordY.getText();
                if (!textXsin.matches("\\d+") || !textYsin.matches("\\d+")) {
                    JOptionPane.showMessageDialog(null, "Las coordenadas X e Y deben ser solo numericas.");
                } else {
                    String tipo = comboTipoAccidenteSiniestro.getSelectedItem().toString();
                    LocalDate fecha = LocalDate.parse(textFechaSiniestro.getText());
                    String detalle = textAreaDescripcion.getText();
                    int coord_x = Integer.parseInt(textCoordX.getText());
                    int coord_Y = Integer.parseInt(textCoordY1.getText());
                    LocalDate fecha_fin = LocalDate.parse(textFechaSiniestro.getText());
                    int puntaje = 0;
                    int selectedRow = jTbrigadas.getSelectedRow();
                    if (selectedRow != -1) {
                        int codBrigada = Integer.parseInt(jTbrigadas.getModel().getValueAt(selectedRow, 0).toString());
                        Siniestro siniestro = new Siniestro(tipo, fecha, coord_x, coord_Y, detalle, fecha_fin, puntaje, codBrigada);
                        siniestroDB.cargarSiniestro(siniestro);
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor, seleccione una brigada.");
                    }
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar calcular el siniestro.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al analizar la fecha. Asegúrate de ingresar la fecha en el formato correcto.");
        }
    }//GEN-LAST:event_botonRegistrarSiniestroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalcularSiniestro;
    private javax.swing.JButton botonListarSiniestro;
    private javax.swing.JButton botonRegistrarSiniestro;
    private javax.swing.JComboBox<String> comboTipoAccidenteSiniestro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTbrigadas;
    private javax.swing.JPanel panelDer;
    private javax.swing.JPanel panelDerBot;
    private javax.swing.JPanel panelDerTop;
    private javax.swing.JPanel panelIzq;
    private javax.swing.JPanel panelRoot;
    private javax.swing.JMenuItem popmenuMarcar;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JTextArea textAreaDescripcion;
    private javax.swing.JTextField textCoordX;
    private javax.swing.JTextField textCoordX1;
    private javax.swing.JTextField textCoordY;
    private javax.swing.JTextField textCoordY1;
    private javax.swing.JTextField textCuartelCercano;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textDistancia;
    private javax.swing.JTextField textFechaSiniestro;
    // End of variables declaration//GEN-END:variables

    public void botones() {
        JButton btns[] = {botonListarSiniestro, botonCalcularSiniestro, botonRegistrarSiniestro};
        for (JButton btn : btns) {
            btn.setBackground(new Color(161, 27, 27));
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
                    btn.setBackground(new Color(161, 27, 27));
                }
            });
        }
    }

    public void mostrarPanel(Component com) {
        panelDer.removeAll();
        panelDer.add(com);
        panelDer.repaint();
        panelDer.revalidate();
    }

    public void modeloTablaBrigada() {
        jTbrigadas.setModel(modeloBrigadaArt);
        TableColumnModel columnaBrigada = jTbrigadas.getColumnModel();
        columnaBrigada.getColumn(0).setMaxWidth(60);
        columnaBrigada.getColumn(1).setMaxWidth(300);
        columnaBrigada.getColumn(2).setMaxWidth(800);
        columnaBrigada.getColumn(3).setMaxWidth(80);
        columnaBrigada.getColumn(4).setMaxWidth(80);
    }

    public void mostrarTablaBrigada(List brig) {
        actualizarTabla();
        List<Brigada> brigadas = brig;
        for (Brigada brigada : brigadas) {
            modeloBrigadaArt.addRow(new Object[]{
                brigada.getCodBrigada(),
                brigada.getNombre_br(),
                brigada.getEspecialidad(),
                brigada.isLibre()
            });
        }
    }

    public void AsignarBrigada(int codCuartel) {
        actualizarTabla();
        List<Brigada> brigadas = brigadaDB.listarBrigadas(codCuartel);
        for (Brigada brigada : brigadas) {
            modeloBrigadaArt.addRow(new Object[]{
                brigada.getCodBrigada(),
                brigada.getNombre_br(),
                brigada.getEspecialidad(),
                brigada.isLibre(),
                brigada.getCodCuartel()
            });
        }
    }

    public void actualizarTabla() {
        DefaultTableModel mod = (DefaultTableModel) jTbrigadas.getModel();
        mod.setRowCount(0);
    }
}
