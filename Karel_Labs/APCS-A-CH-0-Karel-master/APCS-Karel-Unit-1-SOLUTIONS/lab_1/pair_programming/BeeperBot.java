package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    /**
     * Precondition:  robot is at 1st AVE and 4th ST facing west
     * Postcondition:  robot will have 4 beepers
     */
    public void findAllBeepers() {
        findFirstBeeper();
        pickTwoBeepers();
        findNextBeeper();
        pickTwoBeepers();
    }
    
    
    /**
     * Precondition:  Test
     * Postcondition: Testing
     */

    public void findFirstBeeper() {
        turnAround();
        move();
        move();
    }
    
    /**
     * Precondition: Assumes Karel is three steps above beeper
     * Postcondition:  Will be on a beeper
     */
    public void findNextBeeper() {
        //Assumes that karel is three steps above a beeper and facing East
        turnRight();
        moveThree();
        turnRight();
    }
    
    
    /**
     * Another comment--after clone
     */
    public void pickTwoBeepers() {
        pickBeeper();
        moveThree();
        pickBeeper();
    }
    
    public void moveThree() {
        move();
        move();
        move();
    }
    
    public void turnAround() {
        turnLeft();
        turnLeft();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
   
}

