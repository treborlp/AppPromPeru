/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Ventanas.Actividades.FrmActividades;
import com.sun.glass.events.ViewEvent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 * @author 4ser
 */
public class HiloRotar implements Runnable {

    JFrame frame;
    Thread t;
    private BufferedImage slate;

    private Image dbImage;
    private Graphics dbg;
    private int aleatorio;

    public HiloRotar(JFrame frame, int aleatorio) {
        this.frame = frame;
        this.aleatorio = aleatorio;
        t = new Thread(this, "Hilo Rotar");
        t.start();

    }

    public void parar() {
        t.interrupt();
    }

    @Override
    public void run() {

        try {

            Graphics g = frame.getGraphics();

            Graphics2D g2 = (Graphics2D) g;

            try {
                slate = ImageIO.read(new File(getClass().getResource("/Imagenes/ruleta.png").getFile()));
            } catch (Exception e) {
                System.out.println(e);
            }
            int i = 0;
            int j = 10;
            do {
                Thread.sleep(j);
                g2.rotate(Math.toRadians(45), 540, 473 + 560);
                g2.drawImage(slate, 68, 560, frame);
                //Thread.sleep(150);
                // g2.drawImage(dbImage, 0,0, frame);
                // Thread.sleep(1000);

                i++;
                if (j < 100) {
                    j++;
                } else if (j < 1000) {
                    j += 100;
                    // System.out.println(j);
                }

                // System.out.println(j);
                if (j == aleatorio) {
                    Thread.sleep(5000);
                    
                    
                    switch (aleatorio) {
                        case 100:
                            System.out.println("Avanzo al Frame:" +aleatorio);
                            frame.dispose();
                            new FrmActividades().show();
                            break;
                        case 200:
                            System.out.println("Avanzo al Frame:" +aleatorio);
                            frame.dispose();
                            new FrmActividades().show();
                            break;
                        case 300:
                            System.out.println("Avanzo al Frame:" +aleatorio);
                            frame.dispose();
                            new FrmActividades().show();
                            break;
                        case 400:
                            System.out.println("Avanzo al Frame:" +aleatorio);
                            frame.dispose();
                            new FrmActividades().show();
                            break;
                        case 500:
                            System.out.println("Avanzo al Frame:" +aleatorio);
                            frame.dispose();
                            new FrmActividades().show();
                            break;
                        case 600:
                            System.out.println("Avanzo al Frame:" +aleatorio);
                            frame.dispose();
                            new FrmActividades().show();
                            break;
                        case 700:
                            System.out.println("Avanzo al Frame:" +aleatorio);
                            frame.dispose();
                            new FrmActividades().show();
                            break;
                        case 800:
                            System.out.println("Avanzo al Frame:" +aleatorio);
                            frame.dispose();
                            new FrmActividades().show();
                            break;
                        case 900:
                            System.out.println("Avanzo al Frame:" +aleatorio);
                            frame.dispose();
                            new FrmActividades().show();
                            break;
                        case 1000:
                            System.out.println("Avanzo al Frame:" +aleatorio);
                            frame.dispose();
                            new FrmActividades().show();
                            break;

                        default:

                            break;
                    }
                    
                    t.interrupt();

                }

            } while (true);

        } catch (Exception e) {
        }

    }

}
