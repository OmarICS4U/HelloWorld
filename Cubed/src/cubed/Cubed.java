/*
 * R.Kaune
 * March 18,2019
 * This program demonstrates passing of arguments to a method and return of a value in
 * the calculation of the cube of a number
 */

package cubed;

/**
 * This is a class to create the cube of a number.
 * @author rkaune
 */
public class Cubed {
    
    /**
    * Take a value and display the cube of the value
    * pre: value > 0
    * post: the cube of the value
    * 
    */
    public static double cubeOf(double x) {
        double xCubed;
        xCubed = x * x * x;
        return(xCubed);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(cubeOf(2));
    }
    
}
