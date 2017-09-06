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
        leftOne();
        rightCurve();
        leftCurve();
        leftCurve();
        finish();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void leftOne(){
        turnLeft();
        move();
    }
    public void rightCurve(){
        turnRight();
        move();
        move();
        turnRight();
        move();
        move();
    }
    public void leftCurve(){
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
    }
    public void rightOne(){
        turnRight();
        move();
    }
    public void finish(){
        turnRight();
        move();
        move();
        turnRight();
        move();
        turnRight();
    }
}