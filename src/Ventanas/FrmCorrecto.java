/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.VariablesGoblales;
import Ventanas.Actividades.FrmActividades;
import Ventanas.Actividades.FrmActividadesPreguntas;
import Ventanas.AreaNatural.FrmAreaNatural;
import Ventanas.AreaNatural.FrmAreaNaturalPreguntas;
import Ventanas.Atractivos.FrmAtractivos;
import Ventanas.Atractivos.FrmAtractivosPreguntas;
import Ventanas.BailesTipicos.FrmBailesTipicos;
import Ventanas.BailesTipicos.FrmBailesTipicosPreguntas;
import Ventanas.Ciudades.FrmCiudades;
import Ventanas.Ciudades.FrmCiudadesPreguntas;
import Ventanas.Comodin.FrmComodin;
import Ventanas.ComunidadesNativas.FrmComunidadNativa;
import Ventanas.ComunidadesNativas.FrmComunidadNativaPreguntas;
import Ventanas.FrmFestividades.FrmFestiPreguntas;
import Ventanas.FrmFestividades.FrmFestividades;
import Ventanas.Gastronomia.FrmGastroPreguntas;
import Ventanas.Gastronomia.FrmGastronomia;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 4ser
 */
public class FrmCorrecto extends javax.swing.JFrame {

    /**
     * Creates new form FrmCorrecto
     */
    HiloSonido playSonidoInicial;

    public FrmCorrecto() {
        this.setUndecorated(true);
        initComponents();
        playSonidoInicial = new HiloSonido("SonidoAccion.mp3", true);
        this.setLocationRelativeTo(null);
    }

    private void verificarPremio() {
        if (VariablesGoblales.primerIntento && VariablesGoblales.segundoIntento && VariablesGoblales.tercerIntento) {
            new FrmGanaste().show();
            this.dispose();
        } else if (VariablesGoblales.primerIntento && VariablesGoblales.segundoIntento) {
            new FrmBuenJuego().show();
            this.dispose();
        } else if (VariablesGoblales.primerIntento && VariablesGoblales.tercerIntento) {
            new FrmBuenJuego().show();
            this.dispose();
        } else if (VariablesGoblales.segundoIntento && VariablesGoblales.tercerIntento) {
            new FrmBuenJuego().show();
            this.dispose();
        } else {
            new FrmSuerteProxima().show();
            this.dispose();
        }

    }

    private void Continuar(JFrame frame, int aleatorio) {

        int temp = VariablesGoblales.ruleta;
        switch (aleatorio) {
            case 100:
                if (VariablesGoblales.intentos == 3) {
                    playSonidoInicial.close();
                    verificarPremio();
                    break;
                } else {
                    playSonidoInicial.close();
                    //new FrmAreaNatural().show();
                    new Thread(new FrmAreaNaturalPreguntas()).start();
                    frame.dispose();
                    break;
                }
            case 200:
                if (VariablesGoblales.intentos == 3) {
                    playSonidoInicial.close();
                    verificarPremio();
                    System.out.println("Se acabo el Juego");
                    break;
                } else {
                    playSonidoInicial.close();
                    //new FrmAtractivos().show();
                    new Thread(new FrmAtractivosPreguntas()).start();
                    frame.dispose();
                    break;
                }

            case 300:
                if (VariablesGoblales.intentos == 3) {
                    playSonidoInicial.close();
                    verificarPremio();
                    System.out.println("Se acabo el Juego");
                    break;
                } else {
                    playSonidoInicial.close();
                    new FrmComodin().show();
                    frame.dispose();
                    break;
                }
            case 400:
                if (VariablesGoblales.intentos == 3) {
                    playSonidoInicial.close();
                    verificarPremio();
                    System.out.println("Se acabo el Juego");
                    break;
                } else {
                    playSonidoInicial.close();
                    //new FrmFestividades().show();
                    new Thread(new FrmFestiPreguntas()).start();
                    frame.dispose();
                    break;
                }
            case 500:
                if (VariablesGoblales.intentos == 3) {
                    playSonidoInicial.close();
                    verificarPremio();
                    System.out.println("Se acabo el Juego");
                    break;
                } else {
                    playSonidoInicial.close();
                    new Thread(new FrmGastroPreguntas()).start();
                    frame.dispose();
                    break;
                }
            case 600:
                if (VariablesGoblales.intentos == 3) {
                    playSonidoInicial.close();
                    verificarPremio();
                    System.out.println("Se acabo el Juego");
                    break;
                } else {
                    playSonidoInicial.close();
                    //new FrmCiudades().show();
                    new Thread(new FrmCiudadesPreguntas()).start();
                    frame.dispose();
                    break;
                }
            case 700:
                if (VariablesGoblales.intentos == 3) {
                    playSonidoInicial.close();
                    verificarPremio();
                    System.out.println("Se acabo el Juego");
                    break;
                } else {
                    playSonidoInicial.close();
                    new FrmComodin().show();
                    frame.dispose();
                    break;
                }
            case 800:
                if (VariablesGoblales.intentos == 3) {
                    playSonidoInicial.close();
                    verificarPremio();
                    System.out.println("Se acabo el Juego");
                    break;
                } else {
                    playSonidoInicial.close();
                    //new FrmComunidadNativa().show();
                    new Thread(new FrmComunidadNativaPreguntas()).start();
                    frame.dispose();
                    break;
                }
            case 900:
                if (VariablesGoblales.intentos == 3) {
                    playSonidoInicial.close();
                    verificarPremio();
                    System.out.println("Se acabo el Juego");
                    break;
                } else {
                    playSonidoInicial.close();
                    //new FrmActividades().show();
                    new Thread(new FrmActividadesPreguntas()).start();
                    frame.dispose();
                    break;
                }
            case 1000:
                if (VariablesGoblales.intentos == 3) {
                    playSonidoInicial.close();
                    verificarPremio();
                    System.out.println("Se acabo el Juego");
                    break;
                } else {
                    playSonidoInicial.close();
                    //new FrmAtractivos().show();
                    new Thread(new FrmAtractivosPreguntas()).start();
                    frame.dispose();
                    break;
                }
            case 1100:
                if (VariablesGoblales.intentos == 3) {
                    playSonidoInicial.close();
                    verificarPremio();
                    System.out.println("Se acabo el Juego");
                    break;
                } else {
                    playSonidoInicial.close();
                    new FrmComodin().show();
                    frame.dispose();
                    break;
                }
            case 1200:
                if (VariablesGoblales.intentos == 3) {
                    playSonidoInicial.close();
                    verificarPremio();
                    System.out.println("Se acabo el Juego");
                    break;
                } else {
                    playSonidoInicial.close();
                    //new FrmFestividades().show();
                    new Thread(new FrmFestiPreguntas()).start();
                    frame.dispose();
                    break;
                }
            case 1300:
                if (VariablesGoblales.intentos == 3) {
                    playSonidoInicial.close();
                    verificarPremio();
                    System.out.println("Se acabo el Juego");
                    break;
                } else {
                    playSonidoInicial.close();
                    //new FrmBailesTipicos().show();
                    new Thread(new FrmBailesTipicosPreguntas()).start();
                    frame.dispose();
                    break;
                }

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
        btnContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnContinuarGif.gif"))); // NOI18N
        btnContinuar.setBorder(null);
        btnContinuar.setBorderPainted(false);
        btnContinuar.setContentAreaFilled(false);
        btnContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinuar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnContinuarGif.gif"))); // NOI18N
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar);
        btnContinuar.setBounds(280, 1680, 490, 160);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bgCorrecta.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1080, 1920);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        Continuar(this, VariablesGoblales.ruleta);
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
