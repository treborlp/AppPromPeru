/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas.Ciudades;

import Ventanas.Gastronomia.*;
import Clases.Data;
import Clases.HiloCorrectoIncorrecto;
import Clases.Recursos;
import Ventanas.FrmCorrecto;
import Ventanas.FrmIncorrecto;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import Clases.VariablesGoblales;
import Ventanas.HiloSonido;

/**
 *
 * @author 4ser
 */
public class FrmCiudadesPreguntas extends javax.swing.JFrame implements Runnable {

    Thread hilo1, hilo2, hilo3, hilo4, hilo5;
    private int velocidad = 10, x = 280, y = 120;
    Recursos tools = new Recursos();
    Data data = new Data();
    HiloSonido playSonidoAccion;
    HiloSonido playBoton;
    
    HiloSonido playSonidoCorrecto;
    HiloSonido playSonidoIncorrecto;

    // String ArrayRespuestas[] = {"Respuesta 1", "Respuesta 2", "Respuesta 3", "Respuesta 4", "Respuesta 5", "Respuesta 6", "Respuesta 7", "Respuesta 8", "Respuesta 9", "Respuesta 10"};
    //tools.asignarNombresBotones(ArrayRespuestas, jButton1, jButton2, jButton3, jButton4);
    public FrmCiudadesPreguntas() {
        this.setUndecorated(true);
        initComponents();
        playSonidoAccion= new HiloSonido("SonidoAccion.mp3",true);
        this.setSize(x, y);
        this.setLocationRelativeTo(null);
        this.setIconImage(tools.setIcono().getImage());
        inicio();
        jButton1.setBounds(-990, 980, 890, 110);
        jButton2.setBounds(-990, 1110, 890, 110);
        jButton3.setBounds(-990, 1240, 890, 110);
        jButton4.setBounds(-990, 1370, 890, 110);
        lblPregunta.setBounds(-920, 560, 760, 230);
    }

    public void inicio() {
        ocultarElementos();
        tools.verificarHaciertos(lblPrimerOpcion, lblSegundaOpcion, lblTerceraOpcion);
        lblPregunta.setText(tools.getPregunta(tools.getData(data.Preguntas, 2, 2, 1)));
        //lblPregunta.setText("<html>"+ajustarTexto(tools.getPregunta(tools.getData(data.Preguntas, 2, 2, 1)))+"</html>");
        String pregunta = lblPregunta.getText();
        String idPregunta = tools.getID(data.Preguntas, pregunta, 0);
        String ArrayRespuestas[] = tools.getData(data.Respuestas, Integer.parseInt(idPregunta), 0, 1);
        tools.asignarNombresBotones(ArrayRespuestas, jButton1, jButton2, jButton3, jButton4);
    }

    public void ocultarElementos() {
        jButton1.hide();
        jButton2.hide();
        jButton3.hide();
        jButton4.hide();
        lblPregunta.hide();
    }

    public void revelarElementos() {
        jButton1.show();
        jButton2.show();
        jButton3.show();
        jButton4.show();
        lblPregunta.show();
    }

    public void verificarRespuesta(JButton btnRespuesta, JLabel lblPregunta) {

        String pregunta = lblPregunta.getText();
        String respuesta = btnRespuesta.getText();
        String idPregunta = tools.getID(data.Preguntas, pregunta, 0);
        String ArrayId[] = tools.getData(data.Respuestas, Integer.parseInt(idPregunta), 0, 0);
        String ArrayRespuestas[] = tools.getData(data.Respuestas, Integer.parseInt(idPregunta), 0, 1);
        String ArrayIdCorrecta[] = tools.getData(data.Respuestas, Integer.parseInt(idPregunta), 0, 2);

        String temp = "";
        for (int i = 0; i < ArrayRespuestas.length; i++) {
            if (ArrayId[i].equals(ArrayIdCorrecta[i])) {
                temp = ArrayRespuestas[i];
            }
        }

        if (temp.equalsIgnoreCase(respuesta)) {
            playSonidoCorrecto= new HiloSonido("SonidoRespCorrecta.mp3",false);
            btnRespuesta.setBackground(Color.green);

            HiloCorrectoIncorrecto hiloCorrectoIncorrecto = new HiloCorrectoIncorrecto(new FrmCorrecto(), this, jButton1, jButton2, jButton3, jButton4, lblPregunta);
            VariablesGoblales.intentos++;
            if (VariablesGoblales.intentos == 1) {
                VariablesGoblales.primerIntento = true;
            }
            if (VariablesGoblales.intentos == 2) {
                VariablesGoblales.segundoIntento = true;
            }
            if (VariablesGoblales.intentos == 3) {
                VariablesGoblales.tercerIntento = true;
            }
            System.out.println(VariablesGoblales.intentos);
        } else {
            playSonidoIncorrecto= new HiloSonido("SonidoRespIncorrecta.mp3",false);
            btnRespuesta.setBackground(Color.red);
            //System.out.println(idPregunta+"---"+idRespuesta);
            HiloCorrectoIncorrecto hiloCorrectoIncorrecto = new HiloCorrectoIncorrecto(new FrmIncorrecto(), this, jButton1, jButton2, jButton3, jButton4, lblPregunta);
            VariablesGoblales.intentos++;
            // HiloCorrectoIncorrecto hiloCorrectoIncorrecto = new HiloCorrectoIncorrecto(new FrmIncorrecto(), this);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblTerceraOpcion = new javax.swing.JLabel();
        lblSegundaOpcion = new javax.swing.JLabel();
        lblPrimerOpcion = new javax.swing.JLabel();
        lblPregunta = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        pnlText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 1920));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reloj.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 260, 140, 140);

        lblTerceraOpcion.setText("Tercer");
        getContentPane().add(lblTerceraOpcion);
        lblTerceraOpcion.setBounds(680, 1670, 77, 87);

        lblSegundaOpcion.setText("Segundo Intento");
        getContentPane().add(lblSegundaOpcion);
        lblSegundaOpcion.setBounds(500, 1670, 77, 87);

        lblPrimerOpcion.setText("Primer Intento");
        getContentPane().add(lblPrimerOpcion);
        lblPrimerOpcion.setBounds(320, 1670, 77, 87);

        lblPregunta.setFont(new java.awt.Font("Tekton Pro", 0, 58)); // NOI18N
        lblPregunta.setText("jLabel2");
        lblPregunta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblPregunta);
        lblPregunta.setBounds(200, 560, 760, 340);

        jButton1.setFont(new java.awt.Font("Tekton Pro", 0, 72)); // NOI18N
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 980, 890, 110);

        jButton2.setFont(new java.awt.Font("Tekton Pro", 0, 72)); // NOI18N
        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(100, 1110, 890, 110);

        jButton3.setFont(new java.awt.Font("Tekton Pro", 0, 72)); // NOI18N
        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(100, 1240, 890, 110);

        jButton4.setFont(new java.awt.Font("Tekton Pro", 0, 72)); // NOI18N
        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(100, 1370, 890, 110);

        pnlText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bgPreguntaCiudades.jpg"))); // NOI18N
        pnlText.setAlignmentY(0.0F);
        getContentPane().add(pnlText);
        pnlText.setBounds(0, 0, 1080, 1920);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        playBoton= new HiloSonido("SonidoClick.mp3",false);
        verificarRespuesta(jButton1, lblPregunta);
        playSonidoAccion.close();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        playBoton= new HiloSonido("SonidoClick.mp3",false);
        verificarRespuesta(jButton2, lblPregunta);
        playSonidoAccion.close();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        playBoton= new HiloSonido("SonidoClick.mp3",false);
        verificarRespuesta(jButton3, lblPregunta);
        playSonidoAccion.close();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        playBoton= new HiloSonido("SonidoClick.mp3",false);
        verificarRespuesta(jButton4, lblPregunta);
        playSonidoAccion.close();
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
            java.util.logging.Logger.getLogger(FrmCiudadesPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCiudadesPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCiudadesPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCiudadesPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Thread(new FrmCiudadesPreguntas()).start();
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
                    for (int j = 0; j < 19; j++) {
                        hilo2.sleep(velocidad);
                        this.setSize(x, y);
                        this.setLocationRelativeTo(null);
                        y = y + 100;
                        //System.out.println(this.getSize().height);
                    }
                }
            }

            revelarElementos();

            for (int i = 0; i < 101; i++) {
                hilo1.sleep(1);
                jButton1.setBounds(i, 980, 890, 110);
            }
            for (int i = 0; i < 101; i++) {
                hilo2.sleep(1);
                jButton2.setBounds(i, 1110, 890, 110);
            }
            for (int i = 0; i < 101; i++) {
                hilo3.sleep(1);
                jButton3.setBounds(i, 1240, 890, 110);
            }
            for (int i = 0; i < 101; i++) {
                hilo4.sleep(1);
                jButton4.setBounds(i, 1370, 890, 110);
            }
            for (int i = 0; i < 190; i++) {
                hilo5.sleep(1);
                lblPregunta.setBounds(i, 560, 760, 230);
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
    private javax.swing.JLabel lblPrimerOpcion;
    private javax.swing.JLabel lblSegundaOpcion;
    private javax.swing.JLabel lblTerceraOpcion;
    private javax.swing.JLabel pnlText;
    // End of variables declaration//GEN-END:variables
}
