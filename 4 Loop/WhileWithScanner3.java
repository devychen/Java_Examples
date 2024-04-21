import java.util.*;
/**
 * Another class to demonstrate the while loop with a Scanner object,
 * including nested while statements.
 * 
 * Read lines of numbers until the end of input
 * For each line read:
 *     Print the sum of the numbers on the line
 */
public class WhileWithScanner3
{
    
    public static void main(String[] args)
    {        
        Scanner keyboard = new Scanner(System.in);
        Scanner lineScan;
        String line = "";        
        double sum = 0, num = 0;
        
        // tell the user to enter numbers
        System.out.println("Enter lines of numbers.\n" +
                           "The numbers on each line will be summed.");
        
        // Read all lines from the keyboard
        while (keyboard.hasNextLine()) 
        {
            
            // Read the next line of numbers from the keyboard
            line = keyboard.nextLine();
            
            // Create a scanner on the line read in
            lineScan = new Scanner(line);    
            
            // Reinitialize sum for this line
            sum = 0;
            
            /*
             * Pick off numbers from the input line and add them to sum
             * until the end of the input line
             */ 
            while (lineScan.hasNextDouble()) 
            {
                num = lineScan.nextDouble();
                sum += num;
            }
            
            System.out.println("Final sum for the line: " + sum);
        }
        keyboard.close();
    
    }
}