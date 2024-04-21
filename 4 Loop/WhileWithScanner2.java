import java.util.*;
/**
 * Another class to demonstrate the while loop with a Scanner object.
 * 
 * Read ONE LINE of numbers and add them.
 * Print the number entered and the intermediate sum
 * after each number is read.
 * Print the final sum after all the numbers have been read.
 */
public class WhileWithScanner2
{
    
    public static void main(String[] args)
    {        
        Scanner keyboard = new Scanner(System.in);
        Scanner lineScan;
        String line;
        double sum = 0, num = 0;
        
        // tell the user to enter numbers
        System.out.println("Enter numbers to add on one line: ");
        
        // Read the line of numbers from the keyboard
        line = keyboard.nextLine();
        
        // Create a scanner on the line just read
        lineScan = new Scanner(line);    
        
        /*
         * Pick off numbers from the input line and add them to sum
         * until the end of the input line
         */ 
        while (lineScan.hasNextDouble())
        {
            num = lineScan.nextDouble();
            sum += num;
            System.out.println("number: " + num +
                               " sum so far: " + sum);
        }
        
        System.out.println("\nFinal sum for the line: " + sum);

        keyboard.close();
        lineScan.close();
    }
}