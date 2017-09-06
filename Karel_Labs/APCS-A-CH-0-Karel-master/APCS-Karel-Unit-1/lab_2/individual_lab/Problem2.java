package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setField(){
        begin();
        setBottom();
        setTop();
        finish();
    }
    public void setBottom(){
        move();
        putBeeper();
        move();
        setLeft1();
        put2Beepers();
        setRight();
        put3Beepers();
        setLeft2();
        put4Beepers();
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
        putBeeper();
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
        turnRight();
        move();
        move();
        move();
        move();
        move();
        move();
        move();
        turnLeft();
        turnLeft();
    }
    public void begin(){
        turnRight();
        move();
        turnLeft();
    }
    public void setRight2(){
       turnLeft();
       move();
       turnLeft();
       move();
    }
    public void setTop(){
       setRight2();
       put3Beepers();
       turnRight();
       move();
       turnRight();
       move();
       move();
       put2Beepers();
       setRight2();
       move();
       putBeepers();
       
    }
}
