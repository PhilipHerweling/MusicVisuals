package c18470774;
import ie.tudublin.Visual;

public class Cilinder extends Cube{

    
    
    public void cilinder(){

        calculate();

        pushMatrix();
        translate(0, 0, 0);
        rotateY(angle);
        rotateX(angle);
        strokeWeight(1);
        sphere(smoothedBoxSize*2);
        popMatrix();

        angle += 0.02f;
        angle2 += 0.04f;
    }
    
}