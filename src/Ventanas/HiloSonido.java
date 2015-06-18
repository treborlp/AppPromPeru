/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author 4ser
 */
public class HiloSonido implements Runnable {

    Thread t;

    public HiloSonido() {
        t = new Thread(this, "Hilo Sonido");
        t.start();
    }

    @Override
    public void run() {
        try {
            FileInputStream fis;
            Player player;
            //"C:\\Users\\4ser\\Downloads\\audio_pantalla2.mp3"
            fis = new FileInputStream(getClass().getResource("/Sonidos/Laser.mp3").getFile());
            BufferedInputStream bis = new BufferedInputStream(fis);

            player = new Player(bis);
            player.play();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
