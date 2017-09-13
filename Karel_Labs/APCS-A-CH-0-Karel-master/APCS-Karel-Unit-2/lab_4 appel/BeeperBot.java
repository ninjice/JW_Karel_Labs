
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void runRace() {
        collectBeeperSteeple();
    }

    public void retraceSteps(){
        turnLeft();
        turnLeft();
        while(frontIsClear()){
            move();
        }
        faceEast();
    }
    public void collectBeeperSteeple(){
        findBeepers();
        findBeepers();
        findBeepers();
        findBeepers();
        findBeepers();
        findBeepers();
        findBeepers();
    }
    public void pickBeepers(){
        while(nextToABeeper()){
            pickBeeper();
            move();
        }
    }
    
    public void findBeepers(){
        faceEast();
        while(!nextToABeeper()) {
            if(frontIsClear()){
                move();
            }
            else{
                turnOff();
            
            }
        }
        turnLeft();
        pickBeepers();
        retraceSteps();
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
                    turnLeft();
                    }
            }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}