import java.util.*; //导入java.util包中所有类
/**
 * A class to demonstrate the while loop with a Scanner object.
 * 
 * Read doubles until the user enters a non-numeric input.
 * Print the final sum after all the numbers have been read.
 */
public class WhileWithScanner 
{
    public static void main(String[] args)
    {    
        Scanner keyboard = new Scanner(System.in); // create input object
        double sum = 0; // initialise
        double num = 0;

        // tell the user to enter numbers
        System.out.println("Enter numbers to add (type q to quit): ");
        
        /*
         * Pick off numbers from the input and add them to sum
         * until the user enters a non-numeric value
         */ 
        while (keyboard.hasNextDouble()) // while user enters double
        {
            num = keyboard.nextDouble(); // update num with that double
            sum += num; // add to sum, sum = sum + num
        }

        System.out.println("\nFinal sum: " + sum);

        keyboard.close();
    }
}