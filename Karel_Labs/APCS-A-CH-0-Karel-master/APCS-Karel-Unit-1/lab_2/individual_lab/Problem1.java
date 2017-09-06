package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setPins(){
        move();
        putBeeper();
        move();
        setLeft1();
        put2Beepers();
        setRight();
        put3Beepers();
        setLeft2();
        put4Beepers();
        finish();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void putBeepers(){
        putBeeper();
        move();
    }
    public void put4Beepers(){
        putBeepers();
        move();
        putBeepers();
        move();
        putBeepers();
        move();
        putBeepers();
    }
    public void put3Beepers(){
        putBeepers();
        move();
        putBeepers();
        move();
        putBeepers();
    }
    public void put2Beepers(){
        putBeepers();
        move();
        putBeepers();
    }
    public void setLeft1(){
        
        turnLeft();
        move();
        turnLeft();
        turnLeft();
        
    }
    public void setRight(){
        turnLeft();
        move();
        turnLeft();
        
        
    }
    public void setLeft2(){
        
        turnRight();
        move();
        turnRight();
        
    }
    public void finish(){
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        move();
        move();
        move();
        move();
        move();
    }
}
