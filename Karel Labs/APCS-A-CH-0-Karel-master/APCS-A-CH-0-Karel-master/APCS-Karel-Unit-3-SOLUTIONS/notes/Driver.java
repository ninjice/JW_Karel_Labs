package notes;
import kareltherobot.*;
import java.awt.Color.*;

/**
 * Shows how 1D arrays are created and used
 */
public class Driver implements Directions
{
    public static void main(String[] args) {
        OneDimArrays art = new OneDimArrays(1,1,East,1);
        
        art.print(art.arrayName);
        
        art.setValue(2, 4);
        art.print(art.arrayName);
        
        Robot[] robotArmy = new Robot[3];
      
        for(int ave = 0; ave < 3; ave++){
            
            Robot bob = new Robot(1,ave+1, East, 0);
            robotArmy[ave] = bob;
            System.out.print(robotArmy[ave]+ " , ");
        }
        
        System.out.println("What are the robot ID's?");
        
        for(int ave = 0; ave < 3; ave++){
          
            System.out.println("robot: " + robotArmy[ave]);
        }
        
        //Move all robots in robot army by same directions
        for(int bot =0; bot < robotArmy.length; bot++) {
            robotArmy[bot].move();
            robotArmy[bot].turnLeft();
            robotArmy[bot].move();
        }
        
        //Manipulate a single robot
        robotArmy[2].turnLeft();
        robotArmy[2].turnLeft();
        robotArmy[2].turnLeft();
        robotArmy[2].move();
        robotArmy[2].turnOff();
    }
    
    static {
        World.reset(); 
        World.readWorld("worlds/fig6-24.kwld");
        
        World.setDelay(25);  
        World.setVisible(true);
    }
}
