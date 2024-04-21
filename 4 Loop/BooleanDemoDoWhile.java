import java.util.*;

public class BooleanDemoDoWhile {
    public static void main(String[] args) {
        
        System.out.println("Enter nonnegative numbers.");
        System.out.println("Place a negative number at the end");
        System.out.println("to serve as an end marker.");

        int sum = 0;
        Scanner keyboard = new Scanner(System.in);
        int next;

        do {
            next = keyboard.nextInt();
            if (next >= 0) {
                sum += next;
            }
        } while (next >= 0);

        System.out.println("The sum of the numbers is " + sum);

        keyboard.close();
    }
}
