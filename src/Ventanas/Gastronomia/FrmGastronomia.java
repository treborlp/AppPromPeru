/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas.Gastronomia;

import Ventanas.HiloSonido;

/**
 *
 * @author 4ser
 */
public class FrmGastronomia extends javax.swing.JFrame implements Runnable {

    Thread hilo1, hilo2;
    private int velocidad = 10, x = 280, y = 120;
    HiloSonido playSonidoAccion;
    HiloSonido playBoton;

    public FrmGastronomia() {
        this.setUndecorated(true);
        initComponents();
        playSonidoAccion = new HiloSonido("SonidoAccion.mp3", true);
        this.setSize(x, y);
        btnJugar.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnJugar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 1920));
        setSize(new java.awt.Dimension(1080, 1920));
        getContentPane().setLayout(null);

        btnJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnJugarGif.gif"))); // NOI18N
        btnJugar.setBorder(null);
        btnJugar.setBorderPainted(false);
        btnJugar.setContentAreaFilled(false);
        btnJugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJugar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnJugarGif.gif"))); // NOI18N
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugar);
        btnJugar.setBounds(280, 1680, 490, 160);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bgGastro.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setPreferredSize(new java.awt.Dimension(1080, 1920));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1080, 1920);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        playBoton = new HiloSonido("SonidoClick.mp3", false);
        this.dispose();
        playSonidoAccion.close();
        new Thread(new FrmGastroPreguntas()).start();
    }//GEN-LAST:event_btnJugarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmGastronomia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGastronomia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGastronomia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGastronomia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Thread(new FrmGastronomia()).start();
            }
        });
    }

    public void run() {
        try {
            this.setVisible(true);
            for (int i = 0; i < 9; i++) {
                hilo1.sleep(velocidad);
                this.setSize(x, y);
                this.setLocationRelativeTo(null);
                x = x + 100;
                //  System.out.println(this.getSize().width);

                if (x == 1080) {
                    for (int j = 0; j < 76; j++) {
                        hilo2.sleep(velocidad);
                        this.setSize(x, y);
                        this.setLocationRelativeTo(null);
                        y = y + 25;
                        System.out.println(this.getSize().height);
                    }
                }
            }

            //btnJugar.setBounds((int) ((this.getSize().width - 300) / 2), 500, 300, 300);
            btnJugar.setVisible(true);

        } catch (Exception e) {

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
