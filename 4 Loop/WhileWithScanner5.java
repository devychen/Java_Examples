import java.util.*;
/**
 * Another class to demonstrate the while loop with a Scanner object,
 * including nested while statements.
 * 
 * Read lines of numbers until the user types a line
 * containing only a period (".")
 * For each line read:
 *     Print the sum of the numbers on the line
 */
public class WhileWithScanner5
{
    
    public static void main(String[] args)
    {        
        Scanner keyboard = new Scanner(System.in);
        Scanner lineScan;
        String line = "";
        boolean inputContinues = true;        
        double sum = 0, num = 0;
        
        // tell the user to enter numbers
        System.out.println("Enter lines of numbers.\n" +
                           "The numbers on each line will be summed.\n" +
                           "A line with a period marks the end of input.");
        
        // Read a line from the keyboard
        while (inputContinues && keyboard.hasNextLine())
        {
            
            // Read the next line of numbers (or a period) from the keyboard
            line = keyboard.nextLine();
            System.out.println(line);
            
            if (!line.equals("."))
            {                
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
            else
            {   
                inputContinues = false;
                System.out.println("End of Input");
            }
        
        keyboard.close();
        
        }
    }
}