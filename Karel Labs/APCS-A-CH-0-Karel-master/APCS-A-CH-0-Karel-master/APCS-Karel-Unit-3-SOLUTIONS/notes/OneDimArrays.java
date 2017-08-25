package notes;
import kareltherobot.*;

/**
 * General notes for creating and using 1D arrays
 */
public class OneDimArrays extends Robot
{
    public int[] arrayName;
    /**
     * Constructor for objects of class OneDimArrays
     */
    public OneDimArrays(int st, int av, Direction dir, int beepers)
    {
        super(st, av, dir, beepers);
        arrayName = new int[5];
    }

    public void setValue(int index, int value) {
        
        arrayName[index] = value;

    }
    
    public void print(int[] arr) {
        System.out.print(arr);  //prints the location in memory
        System.out.println();
        
        for(int index = 0; index < arr.length; index++) {
               System.out.print(arr[index] + ", ");
        }
    }
    
    
    
}
