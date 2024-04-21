import java.util.Scanner;

public class WhileDemo
{
    public static void main(String[] args)
    {
        int count, number; // define 2 int var
        System.out.println("Enter a number"); // print hint msg to request user input
        Scanner keyboard = new Scanner(System.in); // create a scanner class's object named "keyboard"
        number = keyboard.nextInt( ); // read an int from Jianpan and cast that int value to number
        count = 1; // initial var 'count'
        while (count <= number)
        { // enter 'while' loop, condition ...
            System.out.print(count + ", "); // within loop, print the value of 'count', 
            count++; // and then increase, execute until 'count>number' (ie. conditional fails)
        }
        System.out.println( ); // after loop ends, print
        System.out.println("Buckle my shoe.");

        keyboard.close(); // close keyboard object, release resources related to Jianpan input
    }
}