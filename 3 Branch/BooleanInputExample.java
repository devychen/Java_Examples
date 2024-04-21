package Branch;
import java.util.Scanner;

public class BooleanInputExample {
    public static void main(String[] args) {
        boolean boolVar = false; // create a boolvar with initial value 'false'
        Scanner keyboard = new Scanner(System.in); // read from keyboard input
        System.out.println(boolVar); // print the default value
        System.out.println("Enter a boolean value:"); 
        boolVar = keyboard.nextBoolean(); //  read from keyboard to be the new value
        System.out.println("You entered " + boolVar); // output
        
        keyboard.close();
    }
}
