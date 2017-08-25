package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        findBeeperEnd();
        pickFiveBeepers();
        reposition();
        placeFiveBeepers();
        endPosition();
    }
    
    public void findBeeperEnd() {
        turnRight();
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
    }
    
    public void pickFiveBeepers() {
        //assumes karel starts on a beeper
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
    }
    
     public void placeFiveBeepers() {
        //assumes karel starts on a beeper
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    
    
    public void reposition() {
        turnLeft();
        move();
        move();
        turnLeft();
        turnLeft();
    }
    
    public void endPosition() {
        turnRight();
        move();
        move();
        turnRight();
        move();
        move();
        turnLeft();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
   
}