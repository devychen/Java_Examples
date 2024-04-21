
import java.util.Scanner;

/**
 Illustrates the use of a boolean variable to end loop iteration.
*/
public class BooleanDemo
{
    public static void main(String[] args)
    {
        System.out.println("Enter nonnegative numbers.");
        System.out.println("Place a negative number at the end");
        System.out.println("to serve as an end marker.");

        int sum = 0;
        boolean areMore = true; // 创建一个布尔变量 areMore 并初始化为 true，用于控制循环是否继续执行。
        Scanner keyboard = new Scanner(System.in);
        
        while (areMore) // 进入一个 while 循环，条件是 areMore 为 true，即循环会一直执行直到 areMore 变为 false。
        {
            int next = keyboard.nextInt( ); // 从用户输入中获取下一个整数，存入next
            // 检查用户输入的整数是否为负数。如果是负数，将 areMore 设置为 false，从而结束循环。否则，继续执行下一步。
            if (next < 0)
                areMore = false;
            // 如果用户输入的是非负数，将其累加到变量 sum 中。
            // 循环回到第二步，重复执行，直到用户输入一个负数，将 areMore 设置为 false，循环结束。
            else
                sum = sum + next;
       }
	   System.out.println("The sum of the numbers is " + sum);

       keyboard.close();
    }
}

/*
 * 这段代码通过从用户输入中读取非负整数，将它们累加起来，直到用户输入一个负数为止。
 * 程序使用一个循环，当输入的数字为负数时，将一个布尔变量 areMore 设置为 false，从而结束循环。
 * 最后，打印累加的结果（非负整数的和）。
*/