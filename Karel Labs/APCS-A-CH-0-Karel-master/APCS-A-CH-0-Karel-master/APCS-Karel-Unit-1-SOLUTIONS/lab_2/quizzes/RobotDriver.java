package lab_2.quizzes;


import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class RobotDriver implements Directions
{
    public static void main(String[] args) {
        MyRobot molly = new MyRobot(1,2,East, 0);
        MySecondRobot max = new MySecondRobot(4,1, South, 1);
        
        //molly.move();
        //max.move();
        
        MySecondRobot marv = new MySecondRobot(2,2, East, 0);
        //marv.move();
        marv.move(2);
        
        molly.turnOff();
        max.turnOff();
    }
    
    
    static {
        World.reset(); 
        World.readWorld("worlds/quiz1.kwld"); 
        
        World.setDelay(50);  
        World.setVisible(true);
    }
    
}

