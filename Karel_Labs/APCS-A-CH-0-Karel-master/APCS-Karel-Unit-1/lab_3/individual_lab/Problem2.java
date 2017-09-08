package lab_3.individual_lab;

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

    public void carpetRooms(){
        doFirstOne();
        doSecondOne();
        doThirdOne();
        doFourthOne();
        doFifthOne();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void doFirstOne(){
        move();
        turnLeft();
        checkRoom();
        leave();
    }
    public void checkRoom(){
        if (frontIsClear()){
            move();
            turnRight();
            if (frontIsClear() == false){
                turnLeft();
                if (frontIsClear()==false){
                    turnLeft();
                    if (frontIsClear()==false){
                        putBeeper();
                    }
                }
            }
        }  
    }
    public void leave(){
        if (facingWest()) {
            turnLeft();
            move();
            turnLeft();
        }
        else if (facingNorth()) {
            turnLeft();
            turnLeft();
            move();
            turnLeft();
        }
    }
    public void doSecondOne(){
        move();
        turnLeft();
        checkRoom();
        leave();
    }
    public void doThirdOne(){
        move();
        move();
        turnLeft();
        checkRoom();
        leave();
    }
    public void doFourthOne(){
        move();
        move();
        turnLeft();
        checkRoom();
        leave();
        
    }
    public void doFifthOne(){
        
    }
}
