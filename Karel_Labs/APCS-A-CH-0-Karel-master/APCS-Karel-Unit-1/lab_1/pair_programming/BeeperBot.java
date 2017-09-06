package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  Jay Wolff
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAllBeepers() {
        turnLeft();
        moveThree();
        turnLeft();
        move();
        move();
        pickBeeper();
        moveThree();
        pickBeeper();
        turnLeft();
        moveThree();
        pickBeeper();
        turnLeft();
        moveThree();
        pickBeeper();
        move();
        move();
        finish();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void moveThree(){
        move();
        move();
        move();
    }
    public void finish(){
        putBeeper();
        putBeeper();
        putBeeper();
        putBeeper();
    }
    
}

