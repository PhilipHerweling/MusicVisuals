package c18470774;

import processing.core.*;

public class Spiral extends Shapes
{
    float r = 0;
    float theta = 0;
    int z;
    float x = 0;  
    float y = 0;

    public Spiral(Scene se) {
        super(se);
    }

    public void render() {

        calculate();
        

        x= 0;
        y = 0;
        int i = 0;
        r = 0;
        
        

        for( i = 0; i < se.height+boxSize; i++){

            x = r * PApplet.cos(theta);
            y = r * PApplet.sin(theta);
            se.noFill();
            se.ellipse(x, y, 6, 6);

        
            theta += 0.01;
            // Increment the radius
            r += 0.2;
        }
        
        
        
        
        
        




    }
}