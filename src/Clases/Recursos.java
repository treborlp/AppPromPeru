/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JButton;

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

    public String getPregunta(String[] v) {
        int temp = (int) ((Math.random() * v.length) + 0);
        return v[temp];
    }

    public String getID(String[][] v, String dato, int posicionId) {
     
        String id="";

        for (int i = 0; i < v.length; i++) {

            for (int j = 0; j < v[i].length; j++) {

                if (dato.equalsIgnoreCase(v[i][j])) {
                       id=v[i][posicionId];
                       break;
                }

            }

        }
        return id;
    }
    
    

}
