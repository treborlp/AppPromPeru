/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppromperu;

import Clases.VariablesGoblales;
import Ventanas.Actividades.FrmActividadesPreguntas;
import Ventanas.FrmPrincipal;

import Ventanas.FrmTest;

/**
 *
 * @author Robert
 */
public class AppPromPeru {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmActividadesPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmActividadesPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmActividadesPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmActividadesPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        FrmTest test = new FrmTest();
        test.setVisible(true);
        new Thread(new FrmPrincipal()).start();
        
      /*  for (int i = 0; i < VariablesGoblales.tempnorepeet.length; i++) {
            System.out.println(VariablesGoblales.tempnorepeet[i]);
        }*/
        
        /*MI PRIMER JUERGO xD*/
    }

}
