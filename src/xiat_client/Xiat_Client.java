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

        Socket cliSoc = new Socket("127.0.0.1", puerto);

        Scanner dentro = new Scanner(cliSoc.getInputStream());
        PrintWriter fuera = new PrintWriter(cliSoc.getOutputStream());
        String env;
        System.out.println("Con");
        do {
            env = teclao.nextLine();
            fuera.println(env);
            System.err.println("Enviando " + env);
            fuera.flush();
        } while (!env.equals("0"));
    }

}
