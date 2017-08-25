package lab_2.pair_programming;


/**
 * Write a description of class SubClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SubClass extends SuperClass
{

    /**
     * Constructor for objects of class SubClass
     */
    public SubClass()
    {
        super();
    }

    
    public void move() {
        //Nothing here yet
        System.out.println("Sub move");
        //super.move();
    }
    
    public void move(int steps) {
        System.out.println("Move " + steps + " steps");
    }
}
