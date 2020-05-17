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
        popMatrix();

        pushMatrix();
        translate(0,0,0);
        strokeWeight(10);
        rotateY(angle2);
        ellipse(0,0,boxSize+100,boxSize+100);
        popMatrix();

        pushMatrix();
        translate(0,0,0);
        strokeWeight(10);
        rotateX(angle2);
        ellipse(0,0,boxSize+150,boxSize+150);
        popMatrix();

        pushMatrix();
        translate(0,0,0);
        strokeWeight(10);
        rotateZ(angle);
        ellipse(0,0,boxSize+200,boxSize+200);
        popMatrix();


        
        for(int j = 0; j<=50;j++){
            pushMatrix();
            translate(random(-500,500), random(-300,300), random(0,-600));
            strokeWeight(1);
            box(smoothedBoxSize/20);
            popMatrix();
        
            
        }
        
        if(getSmoothedAmplitude() > 0.13){
            pushMatrix();
            translate(0,0,0);
            strokeWeight(10);
            rotateZ(angle);
            ellipse(0,0,boxSize+250,boxSize+250);
            popMatrix();
            angle2 = 0;
        }
        else if(getSmoothedAmplitude() > 0.16){
            pushMatrix();
            translate(0,0,0);
            strokeWeight(10);
            rotateZ(angle);
            ellipse(0,0,boxSize+300,boxSize+300);
            popMatrix();
            angle2 = 0;
        }
        else if(getSmoothedAmplitude() > 0.2){
            pushMatrix();
            translate(0,0,0);
            strokeWeight(10);
            rotateZ(angle);
            ellipse(0,0,boxSize+350,boxSize+350);
            popMatrix();
            angle2 = 0;
        }
        else if(getSmoothedAmplitude() > 0.25){
            pushMatrix();
            translate(0,0,0);
            strokeWeight(10);
            rotateZ(angle);
            ellipse(0,0,boxSize+400,boxSize+400);
            popMatrix();
            angle2 = 0;
        }
        else{
        
        angle2 -= 0.04f;
        }
        angle += 0.04f;
    }
    
}