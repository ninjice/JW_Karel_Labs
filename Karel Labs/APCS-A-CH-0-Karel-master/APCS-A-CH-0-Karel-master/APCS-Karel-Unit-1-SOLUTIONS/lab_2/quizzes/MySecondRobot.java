package lab_2.quizzes;

import kareltherobot.*; 
/**
 * @author :  D. Appel
 */
public class MySecondRobot extends MyRobot
{
   
    public MySecondRobot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void move() {
        super.move();
    }
    
    public void move(int steps) {
        move();
        move();
        move();
        
        
        
    }
}

