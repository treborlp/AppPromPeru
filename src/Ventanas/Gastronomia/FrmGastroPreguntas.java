/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas.Gastronomia;

import Clases.Data;
import Clases.Recursos;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author 4ser
 */
public class FrmGastroPreguntas extends javax.swing.JFrame implements Runnable {

    Thread hilo1, hilo2, hilo3, hilo4, hilo5;
    private int velocidad = 10, x = 280, y = 120;
    Recursos tools = new Recursos();
    Data data = new Data();

    // String ArrayRespuestas[] = {"Respuesta 1", "Respuesta 2", "Respuesta 3", "Respuesta 4", "Respuesta 5", "Respuesta 6", "Respuesta 7", "Respuesta 8", "Respuesta 9", "Respuesta 10"};
    //tools.asignarNombresBotones(ArrayRespuestas, jButton1, jButton2, jButton3, jButton4);
    

    public FrmGastroPreguntas() {
        this.setUndecorated(true);
        initComponents();
        this.setSize(x, y);
        this.setLocationRelativeTo(null);
        inicio();
        jButton1.setBounds(-320, 700, 320, 50);
        jButton2.setBounds(-320, 800, 320, 50);
        jButton3.setBounds(-320, 900, 320, 50);
        jButton4.setBounds(-320, 1000, 320, 50);
        lblPregunta.setBounds(-390, 770, 390, 80);
    }
    
    public void inicio(){
        lblPregunta.setText(tools.getPregunta(tools.getData(data.Preguntas, 1, 2, 1)));
        String pregunta = lblPregunta.getText();
        String idPregunta = tools.getID(data.Preguntas, pregunta, 0);
        String ArrayRespuestas[] = tools.getData(data.Respuestas, Integer.parseInt(idPregunta), 0, 1);
        tools.asignarNombresBotones(ArrayRespuestas, jButton1, jButton2, jButton3, jButton4);
    }


    public void verificarRespuesta(JButton btnRespuesta, JLabel lblPregunta) {

        String pregunta = lblPregunta.getText();
        String respuesta = btnRespuesta.getText();
        String idPregunta = tools.getID(data.Preguntas, pregunta, 0);
        String idRespuesta = tools.getID(data.Respuestas, respuesta, 2);

        System.out.println(idPregunta + "-----" + idRespuesta);
        
        if(idPregunta.equalsIgnoreCase(idRespuesta)){
            btnRespuesta.setBackground(Color.green);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPregunta = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblPregunta.setFont(new java.awt.Font("Arabic Typesetting", 0, 24)); // NOI18N
        lblPregunta.setText("jLabel2");
        getContentPane().add(lblPregunta);
        lblPregunta.setBounds(480, 770, 390, 80);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 430, 320, 50);

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(90, 500, 320, 50);

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(90, 570, 320, 50);

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(90, 640, 320, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bgPreguntasGastro.jpg"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1080, 1920);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        verificarRespuesta(jButton1, lblPregunta);
        // verificarRespuesta(jButton1, lblPregunta);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        verificarRespuesta(jButton2, lblPregunta);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        verificarRespuesta(jButton3, lblPregunta);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        verificarRespuesta(jButton4, lblPregunta);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmGastroPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGastroPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGastroPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGastroPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Thread(new FrmGastroPreguntas()).start();
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
                        //System.out.println(this.getSize().height);
                    }
                }
            }

            for (int i = 0; i < 400; i += 50) {
                hilo1.sleep(30);
                jButton1.setBounds(i, 430, 320, 50);
            }
            for (int i = 0; i < 400; i += 50) {
                hilo2.sleep(20);
                jButton2.setBounds(i, 500, 320, 50);
            }
            for (int i = 0; i < 400; i += 50) {
                hilo3.sleep(20);
                jButton3.setBounds(i, 570, 320, 50);
            }
            for (int i = 0; i < 400; i += 50) {
                hilo4.sleep(20);
                jButton4.setBounds(i, 640, 320, 50);
            }
            for (int i = 0; i < 400; i += 50) {
                hilo5.sleep(20);
                lblPregunta.setBounds(i, 770, 390, 80);
            }
             //ArrayRespuestas=tools.getData(data.Respuestas, 1, 0, 1);

        } catch (Exception e) {

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPregunta;
    // End of variables declaration//GEN-END:variables
}
