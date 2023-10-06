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
        cambiarTheme(true);
        JButton btns[] = {jBotonBombero, jBotonBrigada, jBotonCuartel, jBotonSiniestro, jBotonTheme};
        for (JButton btn : btns) {
            btn.setBackground(new Color(255,0,0));
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
                    btn.setBackground(new Color(80, 41, 179));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(new Color(255,0,0));
                }
            });
        }
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

        panelTop.setBackground(new java.awt.Color(186, 53, 53));
        panelTop.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelTop.setPreferredSize(new java.awt.Dimension(0, 80));
        panelTop.setLayout(new java.awt.GridBagLayout());

        jBotonBombero.setText("Bomberos");
        jBotonBombero.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 404, 0, 0);
        panelTop.add(jBotonBombero, gridBagConstraints);

        jBotonBrigada.setText("Brigadas");
        jBotonBrigada.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        panelTop.add(jBotonBrigada, new java.awt.GridBagConstraints());

        jBotonCuartel.setText("Cuarteles");
        jBotonCuartel.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        panelTop.add(jBotonCuartel, new java.awt.GridBagConstraints());

        jBotonSiniestro.setText("Siniestros");
        jBotonSiniestro.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        panelTop.add(jBotonSiniestro, new java.awt.GridBagConstraints());

        jBotonTheme.setText("Theme");
        jBotonTheme.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 439, 0, 0);
        panelTop.add(jBotonTheme, gridBagConstraints);

        panelRoot.add(panelTop, java.awt.BorderLayout.NORTH);

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

    private void cambiarTheme(boolean dark) {
        if (FlatLaf.isLafDark() != dark) {
            if (dark) {
                FlatMacDarkLaf.setup();
                FlatLaf.updateUI();
            } else {
                FlatMacLightLaf.setup();
                FlatLaf.updateUI();
            }
        }
    }
    
    public  void mousePos(){
        // Get the current mouse pointer info
        PointerInfo pointerInfo = MouseInfo.getPointerInfo();

        // Get the mouse coordinates
        int mouseX = pointerInfo.getLocation().x;
        int mouseY = pointerInfo.getLocation().y;

        // Display the mouse coordinates
        System.out.println("Mouse X: " + mouseX);
        System.out.println("Mouse Y: " + mouseY);
    }
}
