/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppromperu;

import Clases.VariablesGoblales;
import Ventanas.FrmPrincipal;

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
        test.setVisible(true);
        new Thread(new FrmPrincipal()).start();
        
      /*  for (int i = 0; i < VariablesGoblales.tempnorepeet.length; i++) {
            System.out.println(VariablesGoblales.tempnorepeet[i]);
        }*/
    }

}
