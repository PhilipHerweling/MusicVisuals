package c18470774;
import ie.tudublin.Visual;


public class Cube extends Visual{

    float smoothedBoxSize = 0;
    float smoothedBoxSize1 = 0;
    int count = 0;
    int xcube2 = 0;
    int xcube3 = 0;
    int xcube4 = -200;
    int xcube5 = 200;
    int xleft = -200;
    int xright = 200;
    int ylower = 200;
    int yupper = -200;
    int ycube2 = 0;
    int ycube3 = 0;
    int z = 0;
    int z1 = -600;


    public void calculate(){

        calculateAverageAmplitude();
        noFill();
        lights();
        stroke(map(getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        translate(0, 0, -250);
               
        float boxSize = 50 + (getAmplitude() * 200);//map(average, 0, 1, 100, 400); 
        smoothedBoxSize = lerp(smoothedBoxSize, boxSize, 0.2f);

        calculateAverageAmplitude();
        noFill();
        lights();
        stroke(map(getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        translate(0, 0, -250);
               
        float boxSize1 = 30 + (getAmplitude() * 200);//map(average, 0, 1, 100, 400); 
        smoothedBoxSize1 = lerp(smoothedBoxSize1, boxSize1, 0.2f);

    }
    

    public void cube1(){

        calculate();

        //left square
        if(z > -600)
        {
            pushMatrix();
            translate(xcube2, ycube2, z);
            rotateY(angle2);
            rotateX(angle2);
            strokeWeight(5);
            box(smoothedBoxSize);
            box(smoothedBoxSize1);
            strokeWeight(1);
            sphere(smoothedBoxSize1/3);
            popMatrix();
        }

        if(xcube2!= -200){
            xcube2--;
        }

        if(ycube2 != -200){
             ycube2--;
        
        }

        if(ycube2 == -200 && xcube2 == -200)
        {
                
            if(z > -600){
                pushMatrix();
                translate(xcube4, ycube2, z);
                rotateY(angle2);
                rotateX(angle2);
                strokeWeight(5);
                box(smoothedBoxSize);
                box(smoothedBoxSize1);
                strokeWeight(1);
                sphere(smoothedBoxSize1/3);
                popMatrix();
            }

            if (xcube5 != -200){
                xcube5--;
            }
                
        }
            
            
        //middle square
        pushMatrix();
        translate(0, 0, 0);
        rotateY(angle);
        rotateX(angle);
        strokeWeight(5); 
        box(smoothedBoxSize);
        box(smoothedBoxSize1);
        strokeWeight(1);
        sphere(smoothedBoxSize1/ 3);
        popMatrix();

        //rightsquare
        if(z > -600)
        {
            pushMatrix();
            translate(xcube3, ycube3, z);
            rotateY(angle2);
            rotateX(angle2);
            strokeWeight(5); 
            box(smoothedBoxSize);
            box(smoothedBoxSize1);
            strokeWeight(1);
            sphere(smoothedBoxSize1/ 3);
            popMatrix();
        }

        if(xcube3 != 200){
            xcube3++;
        }
            
        if(ycube3 != 200){
            ycube3++;
        }

        if(ycube3 == 200 && xcube3 == 200)
        {

            if(z > -600)
            {
                pushMatrix();
                translate(xcube5, ycube3, z);
                rotateY(angle2);
                rotateX(angle2);
                strokeWeight(5);
                box(smoothedBoxSize);
                box(smoothedBoxSize1);
                strokeWeight(1);
                sphere(smoothedBoxSize1/3);
                popMatrix();
            }

            if (xcube4 != 200){
                xcube4++;
            }
                
        }
             
        if(xcube4 == 200 && xcube5 == -200 && getSmoothedAmplitude() > 0.18){
                
            if(z!=-600){
                z = z-2;
            }    
           
                
        }

        if(z <= -590 ){
            //left
            pushMatrix();
            translate(xleft, 0, z1);
            rotateY(angle);
            rotateX(angle);
            strokeWeight(5);
            box(smoothedBoxSize);
            box(smoothedBoxSize1);
            strokeWeight(1);
            sphere(smoothedBoxSize1/3);
            popMatrix();

            //right
            pushMatrix();
            translate(xright, 0, z1);
            rotateY(angle);
            rotateX(angle);
            strokeWeight(5);
            box(smoothedBoxSize);
            box(smoothedBoxSize1);
            strokeWeight(1);
            sphere(smoothedBoxSize1/3);
            popMatrix();

            //upper
            pushMatrix();
            translate(0, yupper, z1);
            rotateY(angle);
            rotateX(angle);
            strokeWeight(5);
            box(smoothedBoxSize);
            box(smoothedBoxSize1);
            strokeWeight(1);
            sphere(smoothedBoxSize1/3);
            popMatrix();

            //lower
            pushMatrix();
            translate(0, ylower, z1);
            rotateY(angle);
            rotateX(angle);
            strokeWeight(5);
            box(smoothedBoxSize);
            box(smoothedBoxSize1);
            strokeWeight(1);
            sphere(smoothedBoxSize1/3);
            popMatrix();


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