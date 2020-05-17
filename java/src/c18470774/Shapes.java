package c18470774;
import ie.tudublin.Visual;
import processing.core.PApplet;

public class Shapes {

    Scene se;

    public Shapes(Scene se)
    {
        this.se = se; 
    }

    float smoothedBoxSize = 0;
    float smoothedBoxSize1 = 0;
    float boxSize =0;
    float angle = 0;
    float angle2 = 0;

    public void calculate(){

        se.calculateAverageAmplitude();
        se.noFill();
        se.lights();
        se.stroke(se.map(se.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        se.translate(0, 0, -250);
               
        boxSize = 50 + (se.getAmplitude() * 200);//map(average, 0, 1, 100, 400); 
        smoothedBoxSize = se.lerp(smoothedBoxSize, boxSize, 0.2f);

        se.calculateAverageAmplitude();
        se.noFill();
        se.lights();
        se.stroke(se.map(se.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        se.translate(0, 0, -250);
               
        float boxSize1 = 30 + (se.getAmplitude() * 200);//map(average, 0, 1, 100, 400); 
        smoothedBoxSize1 = se.lerp(smoothedBoxSize1, boxSize1, 0.2f);

    }
    
}