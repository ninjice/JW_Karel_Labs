package notes;


/**
 * Quick overview of creating, looping through and accessing values in a 2D array
 */
public class TwoDArrays
{
    public static void main(String[] args) {
        int value = 1;
        int[][] myTable = new int[3][4];
        
        //The array now looks like:  [ [ 0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0] ]
        
        //To place values, loop through each row, then loop through all columns.  We should be as flexible as possible and so we have the following values for rows and columns
        
        int numberOfRows = myTable.length;
        int numberOfColumns = myTable[0].length;
        
        //To place values, use the following loop
        
        for (int row = 0 ; row < numberOfRows ; row++) {
        	for(int col = 0; col < numberOfColumns; col++) {
        		myTable[row][col] = value;
        		value++;
        	}
        }
        
        //To print the array, as a table, we would need something like:
        
        for (int row = 0 ; row < numberOfRows ; row++) {
        	for(int col = 0; col < numberOfColumns; col++) {
        		System.out.print(myTable[row][col] + " " );
        	}
        	System.out.println();
        }
        
        myTable[2][1] = 13;
        
        System.out.println();
        
        for (int row = 0 ; row < numberOfRows ; row++) {
        	for(int col = 0; col < numberOfColumns; col++) {
        		System.out.print(myTable[row][col] + " " );
        	}
        	System.out.println();
        }
    }
}
