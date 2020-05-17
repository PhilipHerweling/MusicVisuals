
package c18470774;
import ie.tudublin.Visual;
import processing.core.PApplet;

//creating cube class whihc is a child class of Shapes 
public class Cube {

    Scene se;
    Cilinder cc;
    float smoothedBoxSize = 0;
    float smoothedBoxSize1 = 0;
    float boxSize =0;
    
    int count = 0;
    int xcube2 = 0;
    int xcube3 = 0;
    int xcube4 = -300;
    int xcube5 = 300;
    int xleft = -300;
    int xright = 300;
    int ylower = 200;
    int yupper = -200;
    int ycube2 = 0;
    int ycube3 = 0;
    int z = 0;
    int z1 = -600;

    public Cube(Scene se)
    {
        this.se = se; 
    }


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


    void cube1(){

        calculate();

        //left square
        if(z > -600)
        {
            se.pushMatrix();
            se.translate(xcube2, ycube2, z);
            se.rotateY(angle2);
            se.rotateX(angle2);
            se.strokeWeight(5);
            se.box(smoothedBoxSize);
            se.box(smoothedBoxSize1);
            se.strokeWeight(1);
            se.sphere(smoothedBoxSize1/3);
            se.popMatrix();
        }

        if(xcube2 != -300){
            xcube2--;
        }

        if(ycube2 != -200){
             ycube2--;
        
        }

        if(ycube2 == -200 && xcube2 == -300)
        {
                
            if(z > -600){
                se.pushMatrix();
                se.translate(xcube4, ycube2, z);
                se.rotateY(angle2);
                se.rotateX(angle2);
                se.strokeWeight(5);
                se.box(smoothedBoxSize);
                se.box(smoothedBoxSize1);
                se.strokeWeight(1);
                se.sphere(smoothedBoxSize1/3);
                se.popMatrix();
            }

            if (xcube5 != -300){
                xcube5--;
            }
                
        }
            
            
        //middle square
        se.pushMatrix();
        se.translate(0, 0, 0);
        se.rotateY(angle);
        se.rotateX(angle);
        se.strokeWeight(5); 
        se.box(smoothedBoxSize);
        se.box(smoothedBoxSize1);
        se.strokeWeight(1);
        se.sphere(smoothedBoxSize1/ 3);
        se.popMatrix();

        //rightsquare
        if(z > -600)
        {
            se.pushMatrix();
            se.translate(xcube3, ycube3, z);
            se.rotateY(angle2);
            se.rotateX(angle2);
            se.strokeWeight(5); 
            se.box(smoothedBoxSize);
            se.box(smoothedBoxSize1);
            se.strokeWeight(1);
            se.sphere(smoothedBoxSize1/ 3);
            se.popMatrix();
        }

        if(xcube3 != 300){
            xcube3++;
        }
            
        if(ycube3 != 200){
            ycube3++;
        }

        if(ycube3 == 200 && xcube3 == 300)
        {

            if(z > -600)
            {
                se.pushMatrix();
                se.translate(xcube5, ycube3, z);
                se.rotateY(angle2);
                se.rotateX(angle2);
                se.strokeWeight(5);
                se.box(smoothedBoxSize);
                se.box(smoothedBoxSize1);
                se.strokeWeight(1);
                se.sphere(smoothedBoxSize1/3);
                se.popMatrix();
            }

            if (xcube4 != 300){
                xcube4++;
            }
                
        }
             
        if(xcube4 == 300 && xcube5 == -300 && se.getSmoothedAmplitude() > 0.18){
                
            if(z!=-600){
                z = z-2;
            }    
           
                
        }

        if(z <= -590 ){
            //left
            se.pushMatrix();
            se.translate(xleft, 0, z1);
            se.rotateY(angle);
            se.rotateX(angle);
            se.strokeWeight(5);
            se.box(smoothedBoxSize);
            se.box(smoothedBoxSize1);
            se.strokeWeight(1);
            se.sphere(smoothedBoxSize1/3);
            se.popMatrix();

            //right
            se.pushMatrix();
            se.translate(xright, 0, z1);
            se.rotateY(angle);
            se.rotateX(angle);
            se.strokeWeight(5);
            se.box(smoothedBoxSize);
            se.box(smoothedBoxSize1);
            se.strokeWeight(1);
            se.sphere(smoothedBoxSize1/3);
            se.popMatrix();

            //upper
            se.pushMatrix();
            se.translate(0, yupper, z1);
            se.rotateY(angle);
            se.rotateX(angle);
            se.strokeWeight(5);
            se.box(smoothedBoxSize);
            se.box(smoothedBoxSize1);
            se.strokeWeight(1);
            se.sphere(smoothedBoxSize1/3);
            se.popMatrix();

            //lower
            se.pushMatrix();
            se.translate(0, ylower, z1);
            se.rotateY(angle);
            se.rotateX(angle);
            se.strokeWeight(5);
            se.box(smoothedBoxSize);
            se.box(smoothedBoxSize1);
            se.strokeWeight(1);
            se.sphere(smoothedBoxSize1/3);
            se.popMatrix();


            if(z1 != 0){
                z1 = z1 +2;
            }

            if(z1 == 0){
                if(xright != 0){
                    xright--;
                }
                if(xleft != 0){
                    xleft++;
                }
                if(yupper != 0){
                    yupper++;
                }
                if(ylower != 0){
                    ylower--;
                }
                
            }
            if(xleft == 0){
                if(count!=100){
                    count++;
                }
            }

        }            

        

        angle += 0.02f;
        angle2 += 0.04f;
    }
    float angle = 0;
    float angle2 = 0;
    
}