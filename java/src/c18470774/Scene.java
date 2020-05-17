package c18470774;

import c18470774.Cube;

public class Scene extends Cilinder {

    int x =0;

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

        
        
    }


    
    public void draw()
    {
    
        background(0);

        camera(0, 0, 0, 0, 0, -1, 0, 2, 0);
        
        if(count != 100 && key == ' '){
            cube1();
        }
        else if(count >= 90){
            cilinder();
            
        }
        

    }
    
    
}