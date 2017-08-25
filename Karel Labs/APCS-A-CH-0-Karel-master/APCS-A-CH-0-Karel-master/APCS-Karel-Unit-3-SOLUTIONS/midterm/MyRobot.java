package midterm;
import kareltherobot.*;

public class MyRobot extends Robot
{
    
    public MyRobot(int st, int av, Direction dir, int beeps)
    {
        super(st, av, dir, beeps);
    }
    
    /**
     * Creates a square of a given size specified by parameter length
     */
    public void makeSquare(int length) {
        //Implement your solution below
        for(int row = 0; row < length; row++) {
            for (int col = 0; col < length; col++) {
                putBeeper();
                move();
            }
            reposition(length);
        }

    }
    
    public void reposition(int row) {
            turnLeft();
            move();
            turnLeft();
            move(row);
            turnLeft();
            turnLeft();
    }

    /**
     * Moves the robot the given number of steps
     */
    public void move(int steps) {
        //implementation not shown
        for(int i = 0; i < steps; i++) {
             move();
        }
    }
    
    public void turnRight() {
        //implementation not shown
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void faceNorth() {
        //implementation not shown
        while(!facingNorth()) turnLeft();
    }
    
    public void faceSouth() {
        //implementation not shown
        while(!facingSouth()) turnLeft();
    }
    
    public void faceWest() {
        //implementation not shown
        while(!facingWest()) turnLeft();
    }
    
    public void faceEast() {
        //implementation not shown
        while(!facingEast()) turnLeft();
    }
    
}
