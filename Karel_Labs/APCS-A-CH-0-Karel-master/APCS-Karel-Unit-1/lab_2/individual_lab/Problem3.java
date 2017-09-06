package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }
    
    public void putLetters(){
        
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
    
    
    public void begin(){
        turnRight();
        move();
        turnLeft();
    }
       
    }

