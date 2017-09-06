package lab_2.pair_programming;


import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Harvester extends Robot
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvest() {
        HarvestTwoRows();
        HarvestTwoRows();
        HarvestTwoRows();
        //Complete this method, using the methods you create below so that all rows are harvested
    }
    //your methods go be
    /**
     * Precondition:    Robot facing east one block away from a row of beepers
     * Postcondition:   RObot facing east, two streets above where it started,
     *                  one block away from a beeper.
     */
    public void HarvestTwoRows(){
        harvestOneRow();
        turnRight();
        harvestOneRow();
        turnLeft();
    }
    public void harvestOneRow(){
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
    }
    private void turnRight() {
        //Your code goes here
        turnLeft();
        turnLeft();
        turnLeft();
    }
    private void repositionToright(){
        turnLeft();
        move();
        turnLeft();
    }
}

