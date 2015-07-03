/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author 4ser
 */
public class VariablesGoblales {

    public static int idCategoria;
    public static int intentos = 0;
    public static boolean primerIntento = false;
    public static boolean segundoIntento = false;
    public static boolean tercerIntento = false;
    public static int[] tempnorepeet={666,666,666};
    

    public static int ruleta;

    public void resetearVariblaes() {
        intentos = 0;
        primerIntento = false;
        segundoIntento = false;
        tercerIntento = false;
        tempnorepeet[0]=666;
        tempnorepeet[1]=666;
        tempnorepeet[2]=666;
    }

}
