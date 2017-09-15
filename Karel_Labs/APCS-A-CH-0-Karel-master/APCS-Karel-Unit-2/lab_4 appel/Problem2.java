
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        while(!nextToABeeper()){
            turnLeft();
            if(!frontIsClear()){
                turnRight();
                beepNMove(1);
            }
                /**
                    *the else is used in the event that Karel reaches a corner of the shape, 
                    *and instructs it to turn around the curve, rather than crash into the wall
                */
            else{
                beepNMove(1);
                turnLeft();
                beepNMove(1);
            }
            if(!frontIsClear()){
                turnRight();
            }
        }
    }
    public void faceEast()
    {
            if(facingWest()){
                turnLeft();
                turnLeft();
            }
            else if(facingNorth()){
                turnRight();
                }
            else if(facingSouth()){
                    turnRight();
                    }
            }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void beepNMove(int spaces){
        int counter = spaces;
        while (counter > 0){
        putBeeper();
        move();
        counter -= 1;
        }
    }
}

