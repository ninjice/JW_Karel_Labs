package lab_4.pair_programming;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    /**
     * This will pickup columns of beepers until it has a wall while facing east
     */
    public void runRace() {
        //Loop until facing east and blocked by a wall
        findColumnOfBeepers();
        pickBeeperColumn();
        returnToFloor();
    }
    
    /**
     * Will face a robot east and move until locating a beeper
     */
    public void findColumnOfBeepers() {
        faceEast();
        //Loop until on a beeper
        
    }
    
    /**
     * This will face a robot north and collect a vertical column of beepers
     * Assume:  Only one beeper on a corner
     */
    public void pickBeeperColumn() {
        faceNorth();
        //Loop until no more beepers
        
    }
    
    /**
     * Will turn a robot south and move until blocked. 
     */
    public void returnToFloor() {
        faceSouth();
        //loop until blocked
        move();
    }
    
    /**
     * Will leave a robot facing east
     */
    public void faceEast() {
        while(!facingEast()) {
            turnLeft();
        }
    }
    
    /**
     * Will leave a robot facing east
     */
    public void faceNorth() {
        while(!facingEast()) {
            turnLeft();
        }
    }
    
    /**
     * Will leave a robot facing east
     */
    public void faceSouth() {
        while(!facingEast()) {
            turnLeft();
        }
    }
    
    
    
   
}

