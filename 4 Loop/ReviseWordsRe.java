/**
 * Rewrite ReviseWords,
 * Keep user input and keep reverse until a period is entered.
*/
import java.util.*;

public class ReviseWordsRe {
    public static void main(String[] args) {

        boolean inputContinues = true;
        Scanner keyboard = new Scanner(System.in);

        while(inputContinues)
        {
            System.out.println("Enter lines of text to be reversed" + 
                                " (enter period to end program)");
            String line = keyboard.nextLine();
            if (line.equals("."))
                inputContinues = false;
            else
                for(int i = line.length()-1; i >= 0; i--)
                {
                System.out.print(line.charAt(i));
                }
                System.out.println("\n ");
        }
        keyboard.close();
        
    }
}
