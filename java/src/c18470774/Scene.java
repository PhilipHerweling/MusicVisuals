package c18470774;
import ie.tudublin.Visual;
import ie.tudublin.*;
import processing.core.*;



public class Scene extends Visual {

    //creating objects
    Cilinder cc;
    Cube cb;
    Spiral sp;


    //used to set screen size
    public void settings()
    {
        size(800, 800, P3D);
        println("CWD: " + System.getProperty("user.dir"));
        fullScreen(P3D, SPAN);
    }

    //when space key is hit music plays
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
        loadAudio("greenarmy.mp3");
        //getAp().play();
        //startListening(); 

        cc = new Cilinder(this);
        cb = new Cube(this);
        sp = new Spiral(this);


    }


    
    public void draw()
    {
        
        
        //setting background to black
        background(0);

        //setting up camera angle
        camera(0, 0, 0, 0, 0, -1, 0, 2, 0);

        
        //these if and else if satements
        //are used to switch between 
        //scenes
        //if(cb.count < 100 && key == ' '){

        //    cb.render();
        //}
        //else if(cb.count > 90  && cb.count <=101){

            //cc.render();
            //if(cc.sample == 2000){
            //    cb.count = cb.count+5;
            //}
            
            
        //}

        //else if(cc.sample >= 2000){
            sp.render();
        //}
        

    }
    
    
}