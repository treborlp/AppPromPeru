/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Ventanas.FrmCorrecto;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author 4ser
 */
public class HiloCorrectoIncorrecto implements Runnable {

    Thread t, t1,t3, hilo1, hilo2, hilo3, hilo4, hilo5;
    JFrame FrmAbre;
    JFrame FrmCierra;
    JButton jButton1, jButton2, jButton3, jButton4;
    JLabel lblPregunta;

    public HiloCorrectoIncorrecto(JFrame FrmAbre, JFrame FrmCierra, JButton jButton1, JButton jButton2, JButton jButton3, JButton jButton4, JLabel lblPregunta) {
        this.FrmAbre = FrmAbre;
        this.FrmCierra = FrmCierra;
        this.jButton1 = jButton1;
        this.jButton2 = jButton2;
        this.jButton3 = jButton3;
        this.jButton4 = jButton4;
        this.lblPregunta = lblPregunta;

        t1 = new Thread(this, "Hilo");
        t1.start();
    }

    @Override
    public void run() {
        try {
            //System.out.println("Ejecutar Hilo");

            //jButton1.setBounds(0, 430, 320, 50);
            t3.sleep(300);
            
            for (int i = 400; i < 1400; i += 50) {
                hilo1.sleep(10);
                jButton1.setBounds(i, 430, 320, 50);
             //   System.out.println("Avanzado Primer Botton");
            }

            for (int i = 400; i < 1400; i += 50) {
                hilo2.sleep(10);
                jButton2.setBounds(i, 500, 320, 50);
              //  System.out.println("Avanzado Segundo Botton");
            }

            for (int i = 400; i < 1400; i += 50) {
                hilo3.sleep(10);
                jButton3.setBounds(i, 570, 320, 50);
                //System.out.println("Avanzado Tercer Botton");
            }

            for (int i = 400; i < 1400; i += 50) {
                hilo4.sleep(10);
                jButton4.setBounds(i, 640, 320, 50);
               // System.out.println("Avanzado Cuarto Botton");
            }

            for (int i = 400; i < 1400; i += 50) {
                hilo5.sleep(10);
                lblPregunta.setBounds(i, 770, 390, 80);
               // System.out.println("Avanzado Pregunta");
            }


             t.sleep(150);
             FrmAbre.show();
             FrmCierra.dispose();
        } catch (Exception e) {

        }
    }

}
