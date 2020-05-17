package c18470774;
import ie.tudublin.Visual;

public class Cilinder extends Cube{

    float[] sphere;

    public void make()
    {
        calculate();
        
    }    
    

    public void cilinder(){

        calculate();

        pushMatrix();
        translate(0,0,0);
        rotateY(angle);
        rotateX(angle);
        strokeWeight(1);
        sphere(smoothedBoxSize1);
        popMatrix();

        for(int j = 0; j<=20;j++){
            pushMatrix();
            translate(random(-500,500), random(-300,300), random(0,-600));
            rotateY(angle);
            rotateX(angle);
            strokeWeight(1);
            box(smoothedBoxSize/20);
            popMatrix();
        }

        angle += 0.06f;
    }
    
}