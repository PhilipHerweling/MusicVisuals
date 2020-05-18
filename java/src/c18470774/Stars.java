package c18470774;

public class Stars extends Shapes{

    
    
    

    public Stars(Scene se) {
        super(se);
    }

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
    }
}