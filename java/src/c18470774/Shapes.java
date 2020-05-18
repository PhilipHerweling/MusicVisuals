package c18470774;
import ie.tudublin.Visual;
import processing.core.PApplet;

//shapes is a perant class to cillinder and cube
public class Shapes {

    //creating a scene object
    Scene se;

    //constructor
    public Shapes(Scene se)
    {
        this.se = se; 
    }

    //initialisng variables
    float smoothedBoxSize = 0;
    float smoothedBoxSize1 = 0;
    float boxSize =0;
    float angle = 0;
    float angle2 = 0;

    //called in the render methods in
    //cilinder, cube and spiral
    public void calculate(){


        //Calling functions which allows me to calculate the sizes of the cubes 
        //and other shapes that i make which constantly change is size with the constant
        //ampiltude changes from high to low
        se.calculateAverageAmplitude();
        se.noFill();
        se.lights();
        se.stroke(se.map(se.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        se.translate(0, 0, -250);
        
        //Making a big box sizes
        boxSize = 50 + (se.getAmplitude() * 200);//map(average, 0, 1, 100, 400); 
        smoothedBoxSize = se.lerp(smoothedBoxSize, boxSize, 0.2f);

        //translate is set here so that the shapes that use
        //these sizes are automatically put further back into the depth 
        se.translate(0, 0, -250);
        
        //making a smaller box size, i.e. use this for cubes, ellipses and spheres etc.
        float boxSize1 = 30 + (se.getAmplitude() * 200);//map(average, 0, 1, 100, 400); 
        smoothedBoxSize1 = se.lerp(smoothedBoxSize1, boxSize1, 0.2f);

    }
    
}