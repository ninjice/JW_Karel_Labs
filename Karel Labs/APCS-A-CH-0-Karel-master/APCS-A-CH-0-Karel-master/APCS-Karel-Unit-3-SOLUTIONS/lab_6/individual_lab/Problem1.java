package lab_6.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public int numBeepers = 0;
    public int index = 0;
    public int[] beeperArray = new int[8];
    
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void sortBeepers() {
       collectAllColumns();
       System.out.print("Original Array: ");
       printArray(beeperArray);
       
       sortArray();
       System.out.print("Sorted Array: ");
       printArray(beeperArray);
       
       placeSortedArray();
    }
    
    
    public void placeSortedArray() {
        returnToStart();
        for(int column = 0; column < beeperArray.length; column++) {
            placeBeepers(beeperArray[column]);
            move();
        }
    }
    
    public void placeBeepers(int num) {
        faceNorth();
        for(int i = 0; i < num; i++) {
            putBeeper();
            move();
        }
        returnToFloor();
    }
    
    public void returnToStart() {
        faceWest();
        while(frontIsClear()) {
            move();
        }
        turnAround();
    }
    
    /**
     * Repeatedly finds the smallest value in the array, and swaps that value with
     * current location
     */
    public void sortArray() {
        int smallest;
        int smallestIndex;
        /*
         * The startIndex is where it starts looking in the array.  0 initially, but
         * after the smallest value is placed at the 0 position, it will change to 1,
         * then 2, ...until the whole array has been looped through
         */
        int startIndex = 0;  
        
        for (int location = 0; location < beeperArray.length; location++) {
            smallest = beeperArray[location];  //set smallest to first thing in list
            //location is the starting location in the array
            
            //Compare the current smallest with ALL other values in the array.
            //return the locaiton of the smallest value
            smallestIndex = findSmallest(location, smallest);
            
            //Change the value at location with the smallest value found
            swapValues(startIndex, smallestIndex);
            printArray(beeperArray);  //check to print
            startIndex++;  //go to the next item in the array and find the smallest again
        }
    }
    
    public int findSmallest(int index, int small) {
        //Loop through array to find the smallest value
            
            for (int i = index; i < beeperArray.length; i++) {
                if (beeperArray[i] < small) {
                    small = beeperArray[i];
                    index = i;  //update smallest index
                }
            }
            
            return index;
    }
    
    public void swapValues(int first, int second) {
        int temp = beeperArray[first];
        
        beeperArray[first] = beeperArray[second];
        beeperArray[second] = temp;
        
    }
    
    public void collectAllColumns() {
         for(int i = 0; i < beeperArray.length; i++) {
            beeperArray[i] = collectColumn();
            move();
        }
    }
    
    public int collectColumn() {
        faceNorth();
        numBeepers = 0;
        while(nextToABeeper()) {
            pickBeeper();
            numBeepers++; 
            move();
        }
        returnToFloor();
        return numBeepers;
    }
    
    public void returnToFloor() {
        faceSouth();
        while(frontIsClear()) {
            move();
        }
        //face robot east
        turnLeft();
    }
    
    public void printArray(int[] arr) {
        System.out.println();
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " , ");
        }
        System.out.println();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void faceNorth() {
        while(!facingNorth()) {
            turnLeft();
        }
    }
    
     public void faceSouth() {
        while(!facingSouth()) {
            turnLeft();
        }
    }
    
    public void faceWest() {
        while(!facingWest()) {
            turnLeft();
        }
    }
    
    public void turnAround() {
        turnLeft();
        turnLeft();
    }
   
}

