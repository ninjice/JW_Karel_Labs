
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        faceEast();
        while(frontIsClear()){
            move();
        }
        
        findExit();
        
    }
    public void findExit(){
        while(true){
            if (!frontIsClear()){
                turnLeft();
                if (!frontIsClear()){
                    turnLeft();
                }
                move();
                turnRight();
                
            }
            else {
                move();
                move();
                turnOff();
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
                    turnLeft();
                    }
            }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

