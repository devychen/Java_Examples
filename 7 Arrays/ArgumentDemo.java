
import java.util.Scanner;

/**
 A demonstration of using indexed variables as arguments.
*/
public class ArgumentDemo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your score on exam 1:");
        int firstScore = keyboard.nextInt( );
        int[] nextScore = new int[3];
		
        for (int i = 0; i < nextScore.length; i++)
            nextScore[i] = firstScore + 5 * i;
			
        for (int i = 0; i < nextScore.length; i++)
        {
            double possibleAverage = getAverage(firstScore, nextScore[i]); // 调用了一个叫做 getAverage 的方法，
            // 并将 firstScore 和 nextScore[i] 作为参数传递给这个方法。然后，将方法返回的结果赋值给 possibleAverage 变量。
            System.out.println("If your score on exam 2 is " +
                                nextScore[i]);
            System.out.println("your average will be " +
                                possibleAverage);
        }
    }

    public static double getAverage(int n1, int n2)
    {
        return (n1 + n2) / 2.0;
    }
}







