/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author 4ser
 */
public class HiloSonido implements Runnable {

    Thread t;
    String Sonido;
    Boolean loop;
    Player player;

    public HiloSonido(String Sonido, boolean loop) {
        this.Sonido = Sonido;
        this.loop = loop;
        t = new Thread(this, "Hilo Sonido");
        t.start();
    }

    public void close() {
        loop = false;
        player.close();
        t.interrupt();
    }

    @Override
    public void run() {
        try {

            do {
                FileInputStream fis;
                fis = new FileInputStream(getClass().getResource("/Sonidos/" + Sonido).getFile());
                BufferedInputStream bis = new BufferedInputStream(fis);

                player = new Player(bis);

                player.play();

            } while (loop);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException ex) {
            Logger.getLogger(HiloSonido.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
