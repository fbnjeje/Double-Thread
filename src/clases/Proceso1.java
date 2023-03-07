
package clases;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Proceso1  extends Thread{
    
    /**
     *
     * @throws LineUnavailableException
     */
    @Override
    public void run() {
        
        try {
            song();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Proceso1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Proceso1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Proceso1.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
    }

    static void song() throws  UnsupportedAudioFileException, IOException, LineUnavailableException{
        
        String fileName = "C:/Users/Neonx/Desktop/hilos/src/clases/Oliver.wav";
        File file = new File(fileName);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

    }
}