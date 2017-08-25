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
        findBeepers();
        pickFive();
        rightTwo();
        turnRight();
        moveThree();
        turnRight();
        putFive();
        finish();
    }
    public void findBeepers(){
        turnLeft();
        moveTwo();
        rightTwo();
        turnRight();
    }
    public void finish(){
        rightTwo();
        rightTwo();
        move();
        turnRight();
    }
    public void moveThree(){
        move();
        move();
        move();
    }
    public void moveTwo(){
        move();
        move();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void pickFive() {
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
    }
    public void putFive() {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
   
    }   
    public void rightTwo() {
        turnRight();
        moveTwo();
    }
    
}
    
    