/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Ventanas.FrmIncorrecto;
import Ventanas.HiloSonido;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author 4ser
 */
public class HiloEsperar implements Runnable {

    Thread t;
    JFrame frame;
    JButton b1, b2, b3, b4;
    JLabel lbl;
    HiloSonido playSonidoAccion;

    public HiloEsperar(JFrame frame, JButton b1, JButton b2, JButton b3, JButton b4, JLabel lbl, HiloSonido playSonidoAccion) {
        this.frame = frame;
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.b4 = b4;
        this.lbl = lbl;
        this.playSonidoAccion=playSonidoAccion;

        t = new Thread(this, "Hilo");
        t.start();
    }

    /*  public HiloEsperar() {
     t = new Thread(this, "Hilo");
     t.start();
     }*/
    public void cerrarHilo() {
        // t.interrupt();
        t.stop();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 13; i++) {
                Thread.sleep(1000);
                System.out.println("Esperando:" + i);
            }
            HiloCorrectoIncorrecto hiloCorrectoIncorrecto = new HiloCorrectoIncorrecto(new FrmIncorrecto(), frame, b1, b2, b3, b4, lbl);
            VariablesGoblales.intentos++;
            playSonidoAccion.close();
            t.stop();
        } catch (Exception e) {
        }
    }

}
