package lab_2.pair_programming;


/**
 * Write a description of class SuperDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SuperDriver
{
    public static void main(String[] args) {
        SuperClass sally = new SuperClass();
        sally.move();
        
        SubClass suzy = new SubClass();
        suzy.move();
        suzy.move(4);
    }
}
