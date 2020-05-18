
package c18470774;
import ie.tudublin.Visual;
import processing.core.PApplet;

//creating cube class whihc is a child class of Shapes 
public class Cube extends Shapes{


    //constructor calling the super class 
    public Cube(Scene se) {
        super(se);
    }

    //initialsing variables
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


    void render(){

        //calling calculate from perant class shapes
        calculate();

        //left cube being created here
        //this will appear until its a certain 
        //depth on the screen
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

        //these if statements move
        //the cube
        if(xcube2 != -300){
            xcube2--;
        }

        if(ycube2 != -200){
             ycube2--;
        
        }

        if(ycube2 == -200 && xcube2 == -300)
        {
            //this creates a new cube which will 
            //appear from the top left cube and 
            //move accross the screen    
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
            
            
        //middle cube
        //this cube never changes
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

        //right cube gets made until its
        //to far in the depth 
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

        //these if statements move the square from the center
        //of the screen to the bottom right
        if(xcube3 != 300){
            xcube3++;
        }
            
        if(ycube3 != 200){
            ycube3++;
        }

        //when the cube reaches the bottom right
        //then a new cube is made on top of it and slowly 
        //moves to the bottom left of the screen
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
        //when all four squares are in there corners and the ampiltude is 
        //above .18 then the z varaible is decremented by 2. this makes.
        //the four squares go back into the depths untill z > 600 
        //them the four cubes disappear      
        if(xcube4 == 300 && xcube5 == -300 && se.getSmoothedAmplitude() > 0.18){
                
            if(z!=-600){
                z = z-2;
            }    
           
                
        }

        //when the four corner cubes disappear
        // 4 new cubes are created 
        if(z <= -590 ){
            //left cube
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

            //right cube
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

            //upper cube
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

            //lower cube
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


            //this brings the cubes from the background to the four ground
            if(z1 != 0){
                z1 = z1 +2;
            }

            //when the cubes are at the 
            //forground they then move towards the middle cube
            //and for one
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
            
            //this is used for timing purposes
            // when all four cubes meet in the middle
            //i want them to stay as one cube for a few seconds and then
            //a new method with differnt shapes is called
            if(xleft == 0){
                if(count!=100){
                    count++;
                }
            }

        }            

        //incrementing angles
        //so that the cubes spin
        angle += 0.02f;
        angle2 += 0.04f;
    }
    
    
}