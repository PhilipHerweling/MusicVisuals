package c18470774;

import processing.core.*;

public class Spiral extends Shapes
{
    float r = 0;
    float theta = 0;
    int z;
    float x = 0;  
    float y = 0;
    boolean flag = true;

    public Spiral(Scene se) {
        super(se);
    }

    public void render() {

        calculate();

        float r = 0;
        float x =0;
        float y = 0;
        
        for(int i = 0; i <= se.height*1.5; i++){

            x = r * PApplet.cos(theta);
            y = r * PApplet.sin(theta);
            se.noFill();
            se.ellipse(x, y, 10, 10);

        
            theta += 0.01;
            // Increment the radius
            r += 0.2;

        }   

        
        
        
        //this is where i make little 
        //cubes which give an effect of colourful stars
        for(int j = 0; j<=50;j++){
            se.pushMatrix();
            se.translate(se.random(-500,500), se.random(-300,300), se.random(0,-600));
            se.strokeWeight(1);
            se.box(smoothedBoxSize/20);
            se.popMatrix();
        
            
        }
        




    }
}