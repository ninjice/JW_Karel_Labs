package notes;
import kareltherobot.*; 
import java.awt.Color;
/**
 * Overview of variables in a class
 *  Instance variables-declared at class level
 *  Local variables-declared in a method
 *  Parameters are passed a copy of a value (for ints and booleans)--more to come later
 *  Variables that are public are directly accessible, private variables need a "getter"
 */
public class Variable extends Robot
{
    //instance variables
    public int steps;
    private boolean blocked;

    public Variable(int st, int av, Direction dir, int numBeepers) {
        super(st,av, dir, numBeepers);
        //We often set instance variables in the constructor.  If we dont then they are set to nothing (0 for ints)
        
    }
    
    /**
     * Local variables exist when declared within a method
     */
    public void localVariable() {
        //If declared here, then it is local

        int beepers = 4;
        
        while (beepers > 0) {
             move();
             beepers--;
        }
    }
    
    /**
     * You can access instance variables from any method.  If you change them in the method then
     * the change "sticks"
     */
    public void instanceVariables() {
        while (steps < 5) {
            move();
            steps++;  //will increment the value of steps (instance variable)
        }
        if (blocked) {
            turnLeft();
        }
    }
    
    /**
     * You can also pass data via parameters.  However, you get a copy of that passed to the method 
     */
    public void usingParams(int value) {
        value = 37;  //will this change the parameter as well?
    }
    
    /**
     * This method is used to print out the values of the variable steps (int)
     */
    public void print(int value) {
        System.out.println("The value of steps is:" + value);
        
        
    }
    
      /**
     * This method is used to print out the values of the variable steps (int)
     */
    public void print(boolean value) {
        System.out.println("The value of blocked is:" + blocked);

    }
    
    /**
     * Getter for instance variable blocked.
     */
    public boolean getBlocked() {
        return blocked;
    }
    
    

}

