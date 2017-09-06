package notes;
import kareltherobot.*;

/**
 * Use of variables in a class.  
 */
public class VariableRunner implements Directions
{
    public static void main(String[] args) {
        Variable vern = new Variable(1,1, East, 0);
        
       
        
        //What the instance variables are set to after construction.
        vern.print(vern.steps);
        //vern.print(vern.blocked);  //private variable.  No direct access
        vern.print(vern.getBlocked());  //need a getter
        
        vern.instanceVariables();
        vern.print(vern.steps);
        
        //Passing a copy of the variables
        vern.usingParams(vern.steps);
        vern.print(vern.steps);  //steps remains what is was, not changed to 37.
        
    }
}
