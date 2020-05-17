package c18470774;
import ie.tudublin.Visual;

//creating cilinder class which is a child class of cube
public class Cilinder extends Cube{


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
        strokeWeight(10);
        ellipse(0,0,boxSize+100,boxSize+100);
        rotateY(angle2);
        rotateX(angle2);
        ellipse(0,0,boxSize+200,boxSize+200);
        popMatrix();


        
        for(int j = 0; j<=50;j++){
            pushMatrix();
            translate(random(-500,500), random(-300,300), random(0,-600));
            strokeWeight(1);
            box(smoothedBoxSize/20);
            popMatrix();
        
            
        }
        


        angle += 0.04f;
        angle2 -= 0.04f;
    }
    
}