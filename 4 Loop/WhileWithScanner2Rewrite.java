import java.util.*;

public class WhileWithScanner2Rewrite {
    public static void main(String[] args)
    { 
    Scanner keyboard = new Scanner(System.in); // create object to read from input
    String line = keyboard.nextLine(); // read the line from input
    Scanner lineScan = new Scanner(line); // create object on the line
    double sum = 0, num = 0; // initialise

    System.out.println("Enter numbers to add on one line: "); // tell user to enter numbers
    
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
