package c18470774;
import ie.tudublin.Visual;
import ie.tudublin.*;
import processing.core.*;



public class Scene extends Visual {

    Cilinder cc;
    Cube cb;



    public void settings()
    {
        size(800, 800, P3D);
        println("CWD: " + System.getProperty("user.dir"));
        fullScreen(P3D, SPAN);
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
            
        }
    }


    public void setup()
    {

        colorMode(HSB);
        noCursor();
        
        setFrameSize(256);

        startMinim();
        loadAudio("gbBaseBoost.mp3");
        //getAp().play();
        //startListening(); 

        cc = new Cilinder(this);
        cb = new Cube(this);


    }


    
    public void draw()
    {
        background(0);

        camera(0, 0, 0, 0, 0, -1, 0, 2, 0);
        
        if(cb.count != 100 && key == ' '){

            cb.cube1();
        }
        else if(cb.count >= 90){

            cc.cilinder();
            
        }
        

    }
    
    
}