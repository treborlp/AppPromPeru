/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

/**
 *
 * @author 4ser
 */
public class HiloGirarRuleta implements Runnable {

    Thread t;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
    ImageIcon iconBorde = new ImageIcon(getClass().getResource("/Imagenes/Icono.png"));
    Border borde = new MatteBorder(32, 32, 32, 32, iconBorde);

    public HiloGirarRuleta(JButton b1, JButton b2, JButton b3, JButton b4, JButton b5, JButton b6, JButton b7, JButton b8, JButton b9, JButton b10) {
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.b4 = b4;
        this.b5 = b5;
        this.b6 = b6;
        this.b7 = b7;
        this.b8 = b8;
        this.b9 = b9;
        this.b10 = b10;

        t = new Thread(this, "Hilo Ruleta");
        t.start();

    }

    @Override
    public void run() {

        try {

            int numeroGenerado = (int) Math.floor(Math.random() * (100 - 50 + 1) + 50);

            int vueltasEnteras = (int) numeroGenerado / 11;
            int recorridoRestante = numeroGenerado % 11;

            for (int j = 0; j < vueltasEnteras; j++) {

                int pos = 11;
                int velocidad = 20;
                if (j == vueltasEnteras - 1) {
                    velocidad = 60;
                }

                for (int i = 1; i <= pos; i++) {

                    switch (i) {
                        case 1:
                            b1.setBorder(borde);
                            Thread.sleep(velocidad);
                            if (i != pos) {
                                b1.setBorder(null);
                            }
                            Thread.sleep(velocidad);
                            break;
                        case 2:
                            b2.setBorder(borde);
                            Thread.sleep(velocidad);
                            if (i != pos) {
                                b2.setBorder(null);
                            }
                            Thread.sleep(velocidad);
                            break;
                        case 3:
                            b3.setBorder(borde);
                            Thread.sleep(velocidad);
                            if (i != pos) {
                                b3.setBorder(null);
                            }
                            Thread.sleep(velocidad);
                            break;
                        case 4:
                            b10.setBorder(borde);
                            Thread.sleep(velocidad);
                            if (i != pos) {
                                b10.setBorder(null);
                            }
                            Thread.sleep(velocidad);
                            break;
                        case 5:
                            b9.setBorder(borde);
                            Thread.sleep(velocidad);
                            if (i != pos) {
                                b9.setBorder(null);
                            }
                            Thread.sleep(velocidad);
                            break;
                        case 6:
                            b8.setBorder(borde);
                            Thread.sleep(velocidad);
                            if (i != pos) {
                                b8.setBorder(null);
                            }
                            Thread.sleep(velocidad);
                            break;
                        case 7:
                            b7.setBorder(borde);
                            Thread.sleep(velocidad);
                            if (i != pos) {
                                b7.setBorder(null);
                            }
                            Thread.sleep(velocidad);
                            break;
                        case 8:
                            b6.setBorder(borde);
                            Thread.sleep(velocidad);
                            if (i != pos) {
                                b6.setBorder(null);
                            }
                            Thread.sleep(velocidad);
                            break;
                        case 9:
                            b5.setBorder(borde);
                            Thread.sleep(velocidad);
                            if (i != pos) {
                                b5.setBorder(null);
                            }
                            Thread.sleep(velocidad);
                            break;
                        case 10:
                            b4.setBorder(borde);
                            Thread.sleep(velocidad);
                            if (i != pos) {
                                b4.setBorder(null);
                            }
                            Thread.sleep(velocidad);
                            break;
                        case 11:
                            b1.setBorder(borde);
                            //Thread.sleep(30);
                            if (i != pos) {
                                b1.setBorder(null);
                            }
                            Thread.sleep(velocidad);
                            break;

                        default:

                            break;
                    }

                }
            }

            if (recorridoRestante > 0) {

                int pos = recorridoRestante;
                for (int i = 1; i <= pos; i++) {
                    int velocidad = 60;
                    switch (i) {
                        case 1:
                            b1.setBorder(borde);
                            Thread.sleep(velocidad);
                            if (i != pos) {
                                b1.setBorder(null);
                            }
                            Thread.sleep(velocidad);
                            break;
                        case 2:
                            b2.setBorder(borde);
                            Thread.sleep(velocidad);
                            if (i != pos) {
                                b2.setBorder(null);
                            }
                            Thread.sleep(velocidad);
                            break;
                        case 3:
                            b3.setBorder(borde);
                            Thread.sleep(velocidad);
                            if (i != pos) {
                                b3.setBorder(null);
                            }
                            Thread.sleep(velocidad);
                            break;
                        case 4:
                            b10.setBorder(borde);
                            Thread.sleep(velocidad);
                            if (i != pos) {
                                b10.setBorder(null);
                            }
                            Thread.sleep(velocidad);
                            break;
                        case 5:
                            b9.setBorder(borde);
                            Thread.sleep(velocidad);
                            if (i != pos) {
                                b9.setBorder(null);
                            }
                            Thread.sleep(velocidad);
                            break;
                        case 6:
                            b8.setBorder(borde);
                            Thread.sleep(velocidad);
                            if (i != pos) {
                                b8.setBorder(null);
                            }
                            Thread.sleep(velocidad);
                            break;
                        case 7:
                            b7.setBorder(borde);
                            Thread.sleep(velocidad);
                            if (i != pos) {
                                b7.setBorder(null);
                            }
                            Thread.sleep(velocidad);
                            break;
                        case 8:
                            b6.setBorder(borde);
                            Thread.sleep(velocidad);
                            if (i != pos) {
                                b6.setBorder(null);
                            }
                            Thread.sleep(velocidad);
                            break;
                        case 9:
                            b5.setBorder(borde);
                            Thread.sleep(velocidad);
                            if (i != pos) {
                                b5.setBorder(null);
                            }
                            Thread.sleep(velocidad);
                            break;
                        case 10:
                            b4.setBorder(borde);
                            Thread.sleep(velocidad);
                            if (i != pos) {
                                b4.setBorder(null);
                            }
                            Thread.sleep(velocidad);
                            break;
                        case 11:
                            b1.setBorder(borde);
                            Thread.sleep(velocidad);
                            if (i != pos) {
                                b1.setBorder(null);
                            }
                            Thread.sleep(velocidad);
                            break;

                        default:

                            break;
                    }

                }

            }

        } catch (Exception e) {

        }

    }

}
