package midterm;
import java.awt.Color;
import kareltherobot.*;


public class RobotDriver implements Directions
{
    public static void main(String[] args) {
        //declare robot
        MyRobot karel = new MyRobot(2,2, East, -1);
        
        //call method to complete task
        karel.makeSquare(5);
        
        
    }
    
    static {
        World.reset(); 
        //World.readWorld("worlds/lab-1-pair.kwld");
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(3);  
        World.setVisible(true);
    }
}
