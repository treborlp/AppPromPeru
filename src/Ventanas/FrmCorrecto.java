/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import Clases.VariablesGoblales;



/**
 *
 * @author 4ser
 */
public class FrmCorrecto extends javax.swing.JFrame {

    /**
     * Creates new form FrmCorrecto
     */
    public FrmCorrecto() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private void Continuar(){
        this.dispose();
        int temp= VariablesGoblales.ruleta;
        switch (temp) {
                        case 100:
                            
                            break;
                        case 200:
                            
                            break;
                        case 300:
                            
                            break;
                        case 400:
                            
                            break;
                        case 500:
                            
                            break;
                        case 600:
                            
                            break;
                        case 700:
                            
                            break;
                        case 800:
                           
                            break;
                        case 900:
                           
                            break;
                        case 1000:
                            
                            break;

                        default:

                            break;
                    }
    
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnContinuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(1080, 1920));
        getContentPane().setLayout(null);

        btnContinuar.setFont(new java.awt.Font("Tekton Pro", 0, 72)); // NOI18N
        btnContinuar.setText("Continuar");
        btnContinuar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar);
        btnContinuar.setBounds(240, 1650, 640, 170);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bgCorrecta.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1080, 1920);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        this.dispose();
       //new Thread(new FrmGastroPreguntas()).start();
        //new Thread(new FrmCiudadesPreguntas()).start();
        //new Thread(new FrmBailesTipicosPreguntas()).start();
        //new Thread(new FrmFestiPreguntas()).start();
    }//GEN-LAST:event_btnContinuarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCorrecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCorrecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCorrecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCorrecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCorrecto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
