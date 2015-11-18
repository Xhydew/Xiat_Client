/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xiat_client;

import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author Joan Galiana Magán
 */
public class Sonido {

    public void playSound()  {
        try {
            // get the sound file as a resource out of my jar file;
            // the sound file must be in the same directory as this class file.
            // the input stream portion of this recipe comes from a javaworld.com article.
            InputStream inputStream = getClass().getResourceAsStream("/recursos/Surprise.wav");
            AudioStream audioStream = new AudioStream(inputStream);
            AudioPlayer.player.start(audioStream);
        } catch (Exception e) {
            // a special way i'm handling logging in this application
            // if (debugFileWriter != null) {
            e.printStackTrace();
            ///}
        }
    }

}
