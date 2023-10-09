package bomberos.Vistas;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import java.awt.Component;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;

public class Principal extends javax.swing.JFrame {

    int var = 1;

    public Principal() {
        initComponents();
        this.setTitle("Bomberos");
        mostrarPanel(new Bomberos());
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
        panelBotMostrar = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelRoot.setPreferredSize(new java.awt.Dimension(1280, 720));
        panelRoot.setLayout(new java.awt.BorderLayout());

        panelTop.setPreferredSize(new java.awt.Dimension(0, 80));
        panelTop.setLayout(new java.awt.GridBagLayout());

        jBotonBombero.setForeground(java.awt.Color.white);
        jBotonBombero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-hombre-bombero-32.png"))); // NOI18N
        jBotonBombero.setText("Bomberos");
        jBotonBombero.setBorderPainted(false);
        jBotonBombero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBotonBombero.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBotonBombero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonBomberoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 404, 0, 0);
        panelTop.add(jBotonBombero, gridBagConstraints);

        jBotonBrigada.setForeground(java.awt.Color.white);
        jBotonBrigada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bomberos.png"))); // NOI18N
        jBotonBrigada.setText("Brigadas");
        jBotonBrigada.setBorderPainted(false);
        jBotonBrigada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBotonBrigada.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelTop.add(jBotonBrigada, new java.awt.GridBagConstraints());

        jBotonCuartel.setForeground(java.awt.Color.white);
        jBotonCuartel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cuartel.png"))); // NOI18N
        jBotonCuartel.setText("Cuarteles");
        jBotonCuartel.setBorderPainted(false);
        jBotonCuartel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBotonCuartel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelTop.add(jBotonCuartel, new java.awt.GridBagConstraints());

        jBotonSiniestro.setForeground(java.awt.Color.white);
        jBotonSiniestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-incendios-32.png"))); // NOI18N
        jBotonSiniestro.setText("Siniestros");
        jBotonSiniestro.setBorderPainted(false);
        jBotonSiniestro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBotonSiniestro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelTop.add(jBotonSiniestro, new java.awt.GridBagConstraints());

        jBotonTheme.setForeground(java.awt.Color.white);
        jBotonTheme.setBorderPainted(false);
        jBotonTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonThemeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 439, 0, 0);
        panelTop.add(jBotonTheme, gridBagConstraints);

        panelRoot.add(panelTop, java.awt.BorderLayout.NORTH);

        panelBotMostrar.setPreferredSize(new java.awt.Dimension(0, 640));
        panelBotMostrar.setLayout(new java.awt.BorderLayout());
        panelRoot.add(panelBotMostrar, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelRoot, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonThemeActionPerformed
        // TODO add your handling code here:
        theme();
    }//GEN-LAST:event_jBotonThemeActionPerformed

    private void jBotonBomberoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonBomberoActionPerformed
        // TODO add your handling code here:
        mostrarPanel(new Bomberos());
    }//GEN-LAST:event_jBotonBomberoActionPerformed

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
        FlatMacDarkLaf.install();

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
    private javax.swing.JPanel panelBotMostrar;
    private javax.swing.JPanel panelRoot;
    private javax.swing.JPanel panelTop;
    // End of variables declaration//GEN-END:variables

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
                btn.setBackground(new Color(206, 32, 40));
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
                        btn.setBackground(new Color(241, 119, 0));
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        btn.setBackground(new Color(206, 32, 40));
                    }
                });
            }
            jBotonTheme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/apagado.png")));
            panelTop.setBackground(new Color(206, 32, 40));
            panelBotMostrar.setBackground(new Color(161, 27, 27));
            var = 0;
        } else {
            JButton btns[] = {jBotonBombero, jBotonBrigada, jBotonCuartel, jBotonSiniestro, jBotonTheme};
            for (JButton btn : btns) {
                btn.setBackground(new Color(241, 119, 0));
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
                        btn.setBackground(new Color(255, 186, 5));
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        btn.setBackground(new Color(241, 119, 0));
                    }
                });
            }
            jBotonTheme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/encendido.png")));
            panelTop.setBackground(new Color(241, 119, 0));
            panelBotMostrar.setBackground(new Color(255, 186, 5));
            var = 1;
        }
    }
    
    public void mostrarPanel(Component com) {
        panelBotMostrar.removeAll();
        panelBotMostrar.add(com);
        panelBotMostrar.repaint();
        panelBotMostrar.revalidate();
    }
}
