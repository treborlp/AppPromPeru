/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppromperu;


import Ventanas.FrmPrincipal;
import Ventanas.FrmRuletaRueda;
import Ventanas.FrmTest;

/**
 *
 * @author 4ser
 */
public class AppPromPeru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrmTest test = new FrmTest();
        //DglBackground test=new DglBackground(null, true);
        test.setVisible(true);
        /* FrmRuletaRueda r=new FrmRuletaRueda();
         r.setVisible(true);*/

        new Thread(new FrmPrincipal()).start();
    }

}
