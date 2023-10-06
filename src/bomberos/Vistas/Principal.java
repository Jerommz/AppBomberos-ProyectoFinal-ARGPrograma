package bomberos.Vistas;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;

public class Principal extends javax.swing.JFrame {

    int var = 1;
    boolean dark = false;
    int spacing = 1;

    public Principal() {
        initComponents();
        this.setTitle("Bomberos");
        FlatLaf.updateUI();
//        cambiarTheme(true);
        theme();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelRoot = new javax.swing.JPanel();
        panelTop = new javax.swing.JPanel();
        jBotonBombero = new javax.swing.JButton();
        jBotonBrigada = new javax.swing.JButton();
        jBotonCuartel = new javax.swing.JButton();
        jBotonSiniestro = new javax.swing.JButton();
        jBotonTheme = new javax.swing.JButton();
        panelBot = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelRoot.setPreferredSize(new java.awt.Dimension(1280, 720));
        panelRoot.setLayout(new java.awt.BorderLayout());

        panelTop.setBackground(new java.awt.Color(184, 30, 30));
        panelTop.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelTop.setPreferredSize(new java.awt.Dimension(1280, 80));
        panelTop.setLayout(new java.awt.GridBagLayout());

        jBotonBombero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-hombre-bombero-32.png"))); // NOI18N
        jBotonBombero.setText("Bomberos");
        jBotonBombero.setBorderPainted(false);
        jBotonBombero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBotonBombero.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weighty = 1.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 315, 0, 10);
        panelTop.add(jBotonBombero, gridBagConstraints);

        jBotonBrigada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bomberos.png"))); // NOI18N
        jBotonBrigada.setText("Brigadas");
        jBotonBrigada.setBorderPainted(false);
        jBotonBrigada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBotonBrigada.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBotonBrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonBrigadaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weighty = 1.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panelTop.add(jBotonBrigada, gridBagConstraints);

        jBotonCuartel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cuartel.png"))); // NOI18N
        jBotonCuartel.setText("Cuarteles");
        jBotonCuartel.setBorderPainted(false);
        jBotonCuartel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBotonCuartel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weighty = 1.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panelTop.add(jBotonCuartel, gridBagConstraints);

        jBotonSiniestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-incendios-32.png"))); // NOI18N
        jBotonSiniestro.setText("Siniestros");
        jBotonSiniestro.setBorderPainted(false);
        jBotonSiniestro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBotonSiniestro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weighty = 1.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panelTop.add(jBotonSiniestro, gridBagConstraints);

        jBotonTheme.setBorderPainted(false);
        jBotonTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonThemeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weighty = 1.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 349, 0, 0);
        panelTop.add(jBotonTheme, gridBagConstraints);

        panelRoot.add(panelTop, java.awt.BorderLayout.NORTH);

        panelBot.setBackground(new java.awt.Color(136, 14, 32));
        panelBot.setForeground(new java.awt.Color(159, 66, 45));
        panelBot.setPreferredSize(new java.awt.Dimension(0, 640));

        javax.swing.GroupLayout panelBotLayout = new javax.swing.GroupLayout(panelBot);
        panelBot.setLayout(panelBotLayout);
        panelBotLayout.setHorizontalGroup(
            panelBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        panelBotLayout.setVerticalGroup(
            panelBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        panelRoot.add(panelBot, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelRoot, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonBrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonBrigadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBotonBrigadaActionPerformed

    private void jBotonThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonThemeActionPerformed
        // TODO add your handling code here:
        theme();
    }//GEN-LAST:event_jBotonThemeActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        FlatLaf.registerCustomDefaultsSource("theme");
        FlatIntelliJLaf.install();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonBombero;
    private javax.swing.JButton jBotonBrigada;
    private javax.swing.JButton jBotonCuartel;
    private javax.swing.JButton jBotonSiniestro;
    private javax.swing.JButton jBotonTheme;
    private javax.swing.JPanel panelBot;
    private javax.swing.JPanel panelRoot;
    private javax.swing.JPanel panelTop;
    // End of variables declaration//GEN-END:variables
//
//    private void cambiarTheme(boolean dark) {
//        if (FlatLaf.isLafDark() != dark) {
//            if (dark) {
//                FlatMacDarkLaf.setup();
//                FlatLaf.updateUI();
//            } else {
//                FlatMacLightLaf.setup();
//                FlatLaf.updateUI();
//            }
//        }
//    }

    public void mousePos() {
        // Get the current mouse pointer info
        PointerInfo pointerInfo = MouseInfo.getPointerInfo();

        // Get the mouse coordinates
        int mouseX = pointerInfo.getLocation().x;
        int mouseY = pointerInfo.getLocation().y;

        // Display the mouse coordinates
        System.out.println("Mouse X: " + mouseX);
        System.out.println("Mouse Y: " + mouseY);
    }

    public void theme() {
        if (var == 1) {
            JButton btns[] = {jBotonBombero, jBotonBrigada, jBotonCuartel, jBotonSiniestro, jBotonTheme};
            for (JButton btn : btns) {
                btn.setBackground(new Color(173, 33, 33));
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
                        btn.setBackground(new Color(209, 73, 13));
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        btn.setBackground(new Color(173, 33, 33));
                    }
                });
            }
            jBotonTheme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/apagado.png")));
            panelTop.setBackground(new Color(184, 30, 30));
            panelBot.setBackground(new Color(136, 14, 32));
            var = 0;
        } else {
            JButton btns[] = {jBotonBombero, jBotonBrigada, jBotonCuartel, jBotonSiniestro, jBotonTheme};
            for (JButton btn : btns) {
                btn.setBackground(new Color(179, 60, 60));
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
                        btn.setBackground(new Color(242, 103, 44));
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        btn.setBackground(new Color(179, 60, 60));
                    }
                });
            }
            jBotonTheme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/encendido.png")));
            panelTop.setBackground(new Color(192, 63, 63));
            panelBot.setBackground(new Color(218, 53, 79));
            var = 1;
        }
    }
}
