import java.util.*;
import java.io.*;
/**
 * Another class to demonstrate the while loop with a Scanner object,
 * including nested while statements.
 * 
 * Read lines of numbers from a file until the end of input
 * For each line read:
 *     Print the sum of the numbers on the line
 */
public class WhileWithScanner4
{
    
    public static void main(String[] args) throws FileNotFoundException
    {   
        // Read the file into the scanner object keyboard
        Scanner keyboard = new Scanner(new File("Numbers.txt"));
        Scanner lineScan;
        String line = "";        
        double sum = 0, num = 0;
        
        // Read all lines from the scanner object keyboard
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
    }
}