package c18470774;

import ie.tudublin.Visual;

public class Square extends Visual{
    boolean threecubes = false;

    public void settings()
    {
        size(800, 800, P3D);
        println("CWD: " + System.getProperty("user.dir"));
        //fullScreen(P3D, SPAN);
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
            
        }
        if (key == '1')
        {
            threecubes = ! threecubes;

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
        
    }

    float smoothedBoxSize = 0;
    float smoothedBoxSize1 = 0;
    int xcube2 = 0;
    int xcube3 = 0;
    int xcube4 = -200;
    int xcube5 = 200;
    int ycube2 = 0;
    int ycube3 = 0;
    int z = 0;
    

    public void cube1(){

        calculateAverageAmplitude();
        noFill();
        lights();
        stroke(map(getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        translate(0, 0, -250);
               
        float boxSize = 50 + (getAmplitude() * 200);//map(average, 0, 1, 100, 400); 
        smoothedBoxSize = lerp(smoothedBoxSize, boxSize, 0.2f);
    }

    public void cube2(){

        calculateAverageAmplitude();
        noFill();
        lights();
        stroke(map(getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        translate(0, 0, -250);
               
        float boxSize1 = 30 + (getAmplitude() * 200);//map(average, 0, 1, 100, 400); 
        smoothedBoxSize1 = lerp(smoothedBoxSize1, boxSize1, 0.2f);
    }

    public void draw()
    {
    
        background(0);
        camera(0, 0, 0, 0, 0, -1, 0, 1, 0);

        cube1();
        cube2();

        
            //left square
            if(z > -600){
            pushMatrix();
            translate(xcube2, ycube2, z);
            rotateY(angle2);
            rotateX(angle2);
            strokeWeight(5);
            box(smoothedBoxSize);
            box(smoothedBoxSize1);
            strokeWeight(1);
            sphere(smoothedBoxSize1/3);
            popMatrix();
            }

            if(xcube2!= -200){
                xcube2--;
            }
            if(ycube2 != -200){
                ycube2--;
            }
            if(ycube2 == -200 && xcube2 == -200){
                
                if(z > -600){
                pushMatrix();
                translate(xcube4, ycube2, z);
                rotateY(angle2);
                rotateX(angle2);
                strokeWeight(5);
                box(smoothedBoxSize);
                box(smoothedBoxSize1);
                strokeWeight(1);
                sphere(smoothedBoxSize1/3);
                popMatrix();
                }

                if (xcube5 != -200){
                    xcube5--;
                }
                
            }
            
            
            //middle square
            pushMatrix();
            translate(0, 0, 0);
            rotateY(angle);
            rotateX(angle);
            strokeWeight(5); 
            box(smoothedBoxSize);
            box(smoothedBoxSize1);
            strokeWeight(1);
            sphere(smoothedBoxSize1/ 3);
            popMatrix();
            //rightsquare
            if(z > -600){
            pushMatrix();
            translate(xcube3, ycube3, z);
            rotateY(angle2);
            rotateX(angle2);
            strokeWeight(5); 
            box(smoothedBoxSize);
            box(smoothedBoxSize1);
            strokeWeight(1);
            sphere(smoothedBoxSize1/ 3);
            popMatrix();
            }

            if(xcube3 != 200){
                xcube3++;
            }
            
            if(ycube3 != 200){
                ycube3++;
            }

            if(ycube3 == 200 && xcube3 == 200){

                if(z > -600){
                pushMatrix();
                translate(xcube5, ycube3, z);
                rotateY(angle2);
                rotateX(angle2);
                strokeWeight(5);
                box(smoothedBoxSize);
                box(smoothedBoxSize1);
                strokeWeight(1);
                sphere(smoothedBoxSize1/3);
                popMatrix();
            }

                if (xcube4 != 200){
                    xcube4++;
                }
                
            }
            if(xcube4 == 200 && xcube5 == -200){
                
                
                    z = z-2;
                

            }
            

        

        angle += 0.02f;
        angle2 += 0.04f;
    }
    float angle = 0;
    float angle2 = 0;
    
}