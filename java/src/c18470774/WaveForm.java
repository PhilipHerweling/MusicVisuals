package c18470774;

import processing.core.*;

public class WaveForm extends Shapes
{
    float r = 0;
    float theta = 0;
    int z;
    public WaveForm(Scene se) {
        super(se);
    }

    public void wave() {

        calculate();

        float x = r * PApplet.cos(theta);
        float y = r * PApplet.sin(theta);

        
        //se.pushMatrix();
        se.translate(0,0,z);
        se.noFill();
        // Adjust for center of window
        se.ellipse(x, y, 16, 16); 
        //se.popMatrix();
        
        // Increment the angle
        theta += 0.01;
        // Increment the radius
        r += 0.1;
        //z = z-1;



    }
}