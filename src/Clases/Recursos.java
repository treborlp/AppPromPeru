/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author 4ser
 */
public class Recursos {

    public int[] verificarNoRepiteElementoEnArray(int dimencion) {

        int[] v = new int[4];
        int temp;
        boolean cont = true;

        for (int i = 0; i < v.length; i++) {
            v[i] = dimencion + 1;
        }

        for (int i = 0; i < v.length; i++) {
            temp = (int) Math.floor((Math.random() * dimencion) + 0);
            for (int j = 0; j < v.length; j++) {
                if (temp == v[j]) {
                    cont = false;
                    break;
                } else {
                    cont = true;
                }
            }
            if (cont) {
                v[i] = temp;
            } else {
                i--;
            }

        }

        return v;

    }

    public void asignarNombresBotones(String[] ArrayRespuestas, JButton b1, JButton b2, JButton b3, JButton b4) {

        int dimencionArray = ArrayRespuestas.length;

        int v[] = verificarNoRepiteElementoEnArray(dimencionArray);

        int i = 0;
        while (i < 4) {

            switch (i) {
                case 0:
                    b1.setText(ArrayRespuestas[v[i]]);
                    break;
                case 1:
                    b2.setText(ArrayRespuestas[v[i]]);
                    break;
                case 2:
                    b3.setText(ArrayRespuestas[v[i]]);
                    break;
                case 3:
                    b4.setText(ArrayRespuestas[v[i]]);
                    break;
                default:
                    break;
            }
            i++;
        }

    }

    public String[] getData(String[][] v, int id, int posicionId, int posicionData) {

        String[] getv;
        int c = 0;
        for (int i = 0; i < v.length; i++) {
            if (String.valueOf(id).equalsIgnoreCase(v[i][posicionId])) {
                c++;
            }
        };
        int temp = 0;
        getv = new String[c];
        for (int i = 0; i < v.length; i++) {

            if (String.valueOf(id).equalsIgnoreCase(v[i][posicionId])) {
                getv[temp] = v[i][posicionData];
                temp++;
            }

        }

        return getv;
    }

    public int verificarNoRepeirNumero(String[] v) {

        boolean b = true;
        int temp;

        do {
            temp = (int) ((Math.random() * v.length) + 0);
            System.out.println("Se Genero:" +temp);
            if (temp != VariablesGoblales.tempnorepeet[0] && temp != VariablesGoblales.tempnorepeet[1] && temp != VariablesGoblales.tempnorepeet[2]) {
                b = false;
                System.out.println("Se Acepto:" +temp);
            }
            //System.out.println("Se Descarto:" +temp);

        } while (b);

        return temp;
    }

    public String getPregunta(String[] v) {
        //int temp = (int) ((Math.random() * v.length) + 0);
        int temp = verificarNoRepeirNumero(v);
        VariablesGoblales.tempnorepeet[VariablesGoblales.intentos] = temp;
        return v[temp];
    }

    public String getID(String[][] v, String dato, int posicionId) {

        String id = "";

        for (int i = 0; i < v.length; i++) {

            for (int j = 0; j < v[i].length; j++) {

                if (dato.equalsIgnoreCase(v[i][j])) {
                    id = v[i][posicionId];
                    break;
                }

            }

        }
        return id;
    }

    public void verificarHaciertos(JLabel lblPrimerIntento, JLabel lblSegundoIntento, JLabel lblTercerIntento) {

        ImageIcon correcta = new ImageIcon(getClass().getResource("/Imagenes/correcto.png"));
        ImageIcon incorrecta = new ImageIcon(getClass().getResource("/Imagenes/incorrecto.png"));

        if (VariablesGoblales.intentos == 0) {
            lblPrimerIntento.hide();
            lblSegundoIntento.hide();
            lblTercerIntento.hide();
        } else {

            if (VariablesGoblales.intentos == 1) {
                lblSegundoIntento.hide();
                lblTercerIntento.hide();
                if (VariablesGoblales.primerIntento) {
                    lblPrimerIntento.setIcon(correcta);
                } else {
                    lblPrimerIntento.setIcon(incorrecta);
                }

            } else if ((VariablesGoblales.intentos == 2)) {
                lblTercerIntento.hide();
                if (VariablesGoblales.segundoIntento) {
                    lblSegundoIntento.setIcon(correcta);
                } else {
                    lblSegundoIntento.setIcon(incorrecta);
                }

                if (VariablesGoblales.primerIntento) {
                    lblPrimerIntento.setIcon(correcta);
                } else {
                    lblPrimerIntento.setIcon(incorrecta);
                }

            } else {

                if (VariablesGoblales.tercerIntento) {
                    lblTercerIntento.setIcon(correcta);
                } else {
                    lblTercerIntento.setIcon(incorrecta);
                }

                if (VariablesGoblales.segundoIntento) {
                    lblSegundoIntento.setIcon(correcta);
                } else {
                    lblSegundoIntento.setIcon(incorrecta);
                }

                if (VariablesGoblales.primerIntento) {
                    lblPrimerIntento.setIcon(correcta);
                } else {
                    lblPrimerIntento.setIcon(incorrecta);
                }

            }

        }

    }

    public ImageIcon setIcono() {
        ImageIcon icon = null;
        try {
            BufferedImage icono = ImageIO.read(getClass().getResourceAsStream("/Imagenes/icono_1.png"));
            icon = new ImageIcon(icono);
        } catch (Exception e) {

        }
        return icon;
    }

}
