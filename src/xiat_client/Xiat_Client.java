/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xiat_client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Joan Galiana MagÃ¡n
 */
public class Xiat_Client {

    private static final int puerto = 5050;

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        Scanner teclao = new Scanner(System.in);

        Socket cliSoc = new Socket("84.127.50.89", puerto);

        Scanner dentro = new Scanner(cliSoc.getInputStream());
        PrintWriter fuera = new PrintWriter(cliSoc.getOutputStream());
        String env;
        System.out.println("Con");
        
        Ventanasa ventana = new Ventanasa(dentro,fuera);
        ventana.setVisible(true);

    }

}
