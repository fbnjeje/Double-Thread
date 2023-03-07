package clases;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class clases {
    public static void main(String[] args) {

        
        
        
        
        Proceso1 hilo1 = new Proceso1();
        Proceso2 hilo2 = new Proceso2();
        Audio song = new Audio();

        Thread hilo3 = new Thread();
        hilo1.start();
        hilo2.start();
        song.setVisible(true);
    }

}
