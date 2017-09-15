 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void closeAllWindows() {
        breakAndEnter();
        findWindows();
    }
    public void beepNMove(int spaces){
        int counter = spaces;
        while (counter > 0){
            putBeeper();
            move();
            counter -= 1;
        }
    }
    public void moveMore(int spaces){
        int counter = spaces;
        while (counter > 0){
            move();
            counter -= 1;
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
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
    public void breakAndEnter(){
        turnLeft();
        moveMore(3);
        turnRight();
        move();
        turnLeft();
        move();
        turnRight();
    }
    public void findWindows(){
        int windows = 9;
        
        while(windows > 0){
            turnLeft();
            if (!frontIsClear()){
                turnRight();
                /**
                 * The second conditional is true if the robot is in a corner of the room
                 */
                if(!frontIsClear()){
                    turnRight();
                }
                move();
                }
            else{
                 putBeeper();
                 windows -= 1;
                 turnRight();
                 move();
            }
        }
    }
}
