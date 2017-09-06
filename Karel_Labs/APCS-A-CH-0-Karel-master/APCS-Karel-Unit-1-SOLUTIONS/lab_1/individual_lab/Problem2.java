package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        turnRight();
        move();
        turnAround();
        loop();
        
    }
    
    public void loop() {
        //assumes karel is facing west
        loopRight();
        loopLeft();
        loop();
    }
    
    public void loopRight() {
        moveTwo();
        turnRight();
        moveTwo();
        turnRight();
        moveTwo();
        turnLeft();
    }
    
    public void loopLeft() {
        moveTwo();
        turnLeft();
        moveTwo();
        turnLeft();
        moveTwo();
        turnLeft();
        moveTwo();
        turnRight();
        moveTwo();
        turnRight();
    }
    
    public void moveTwo() {
        move();
        move();
    }
    
    public void turnAround() {
        turnLeft();
        turnLeft();
    }
    
    public void turnRight() {
        World.setDelay(0);
        turnLeft();
        turnLeft();
        turnLeft();
        World.setDelay(10);
    }
   
}