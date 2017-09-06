package lab_7.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Harvester extends Robot
{
    int[][]field = new int[6][5];   //six rows of five columns
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void harvest() {
        //Loop through all the rows
        move();
        for(int row =0; row < field.length ; row++) {
            //harvestRow()---pick up beepers and store values-pass the row number
            harvestRow(row);
            //reposition
            reposition();
        }
        printField();
    }
    
    public void harvestRow(int row) {
        //loop through all the columns
        for(int col=0; col < field[0].length; col++) {
            //on corner asks:
                //if beeper
                if(nextToABeeper()) {

                    //pick
                    pickBeeper();
                    //store in 2D array-- row and column
                    field[row][col] = 1;
                }
                //move
                move();
                
            }
    }
    
    public void reposition() {
        //go back to the start
        turnLeft();
        move();
        turnLeft();
        move();
        move();
        move();
        move();
        move();
        turnLeft();
        turnLeft();
        
    }
    
    public void printField() {
        for(int row = 0; row< field.length; row++) {
            for(int col = 0; col < field[0].length; col++) {
                System.out.print(field[row][col] + " , ");
            }
            System.out.println();
            
        }
    }
   
}

