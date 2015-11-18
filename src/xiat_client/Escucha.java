/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xiat_client;

import java.util.Scanner;

/**
 *
 * @author Joan Galiana Magán
 */
public class Escucha implements Runnable {

    Sonido play = new Sonido();

    Scanner dentro;
    Ventanasa ventana;

    Boolean sonido = true;

    public void setSonido(Boolean sonido) {
        this.sonido = sonido;
    }

    /**
     *
     * @param dentro
     * @param ventana
     */
    public Escucha(Scanner dentro, Ventanasa ventana) {
        this.dentro = dentro;
        this.ventana = ventana;
    }

    private void lee() {
        String str;

        str = dentro.nextLine();
        System.err.println(str);
        ventana.escribe(str, 1);
        System.err.println(sonido);
        if (sonido) {
            play.playSound();
        }
    }

    @Override
    public void run() {
        while (true) {
            lee();
        }
    }

}
