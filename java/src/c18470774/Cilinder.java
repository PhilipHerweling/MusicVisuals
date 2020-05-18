package c18470774;
import ie.tudublin.Visual;
import processing.core.*;


//creating cilinder class which is a child class of Shapes
public class Cilinder extends Shapes{

    int sample = 0;

    
    //calling constructor in 
    //the super class
    public Cilinder(Scene se) {
        super(se);
    }

    //new render method
    public void render() {

        calculate();

        //this is where i make little 
        //cubes which give an effect of colourful stars
        for(int j = 0; j<=50;j++){
            se.pushMatrix();
            se.translate(se.random(-500,500), se.random(-300,300), se.random(0,-600));
            se.strokeWeight(1);
            se.box(smoothedBoxSize/20);
            se.popMatrix();
        }

        //creating sphere and positioning it 
        //in the middle of the screen
        se.pushMatrix();
        se.translate(0,0,0);
        se.rotateY(angle);
        se.rotateX(angle);
        se.strokeWeight(1);
        se.sphere(smoothedBoxSize1);
        se.popMatrix();

        //creating an ellipse which 
        //orbits the sphere around the y axis
        se.pushMatrix();
        se.translate(0,0,0);
        se.strokeWeight(10);
        se.rotateY(angle2);
        se.ellipse(0,0,boxSize+100,boxSize+100);
        se.popMatrix();

        //creating another ellipse which 
        //orbits the sphere around the x axis
        se.pushMatrix();
        se.translate(0,0,0);
        se.strokeWeight(10);
        se.rotateX(angle2);
        se.ellipse(0,0,boxSize+150,boxSize+150);
        se.popMatrix();

        //creating another ellipse which 
        //doesnt orbit the sphere
        se.pushMatrix();
        se.translate(0,0,0);
        se.strokeWeight(10);
        se.ellipse(0,0,boxSize+200,boxSize+200);
        se.popMatrix();


        //these if statements and else if 
        //statements are used to add
        //another ellipse around the sphere 
        //when the ampiltude gets bigger
        //and stops the two inner ellipses from orbiting 
        //around the sphere
        if(se.getSmoothedAmplitude() > 0.13){
            se.pushMatrix();
            se.translate(0,0,0);
            se.strokeWeight(10);
            se.rotateZ(angle);
            se.ellipse(0,0,boxSize+250,boxSize+250);
            se.popMatrix();
            angle2 = 0;
        }
        else if(se.getSmoothedAmplitude() > 0.16){
            se.pushMatrix();
            se.translate(0,0,0);
            se.strokeWeight(10);
            se.rotateZ(angle);
            se.ellipse(0,0,boxSize+300,boxSize+300);
            se.popMatrix();
            angle2 = 0;
        }
        else if(se.getSmoothedAmplitude() > 0.2){
            se.pushMatrix();
            se.translate(0,0,0);
            se.strokeWeight(10);
            se.rotateZ(angle);
            se.ellipse(0,0,boxSize+350,boxSize+350);
            se.popMatrix();
            angle2 = 0;
        }
        else if(se.getSmoothedAmplitude() > 0.25){
            se.pushMatrix();
            se.translate(0,0,0);
            se.strokeWeight(10);
            se.rotateZ(angle);
            se.ellipse(0,0,boxSize+400,boxSize+400);
            se.popMatrix();
            angle2 = 0;
        }
        else{
        
            //decrementing angle2
            angle2 -= 0.04f;

        }
        //incrementing angle
        angle += 0.04f;

        if (sample != 3000){
            sample++;
        }
    }
    
}