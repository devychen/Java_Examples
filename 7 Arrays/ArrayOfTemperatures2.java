/**
 Reads temperatures from the user and shows which are above 
 and which are below the average of all the temperatures.
*/
import java.util.Scanner;

public class ArrayOfTemperatures2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
		System.out.println("How many temperatures do you have?");
		int size = keyboard.nextInt( );
		double[] temperature = new double[size];
		
        // Read temperatures and compute their average:
        System.out.println("Enter " + temperature.length + " temperatures:");
		double sum = 0;
        for (int index = 0; index < temperature.length; index++) // 使用index作为循环变量，从数组temperature的第一个元素开始，一直循环到数组的最后一个元素。
        {
			temperature[index] = keyboard.nextDouble( ); // 在每次循环迭代中，代码通过keyboard.nextDouble()从用户输入中读取一个double类型的温度值，并将其存储在数组temperature的相应位置（由index确定）。
            sum = sum + temperature[index];
        }
        double average = sum / temperature.length;
        System.out.println("The average temperature is " + average);
		
		// Display each temperature and its relation to the average:
        System.out.println("The temperatures are");
        for (int index = 0; index < temperature.length; index++)
        {
            if (temperature[index] < average)
                System.out.println(temperature[index] + 
                                   " below average");
            else if (temperature[index] > average)
                System.out.println(temperature[index] + 
                                   " above average");
            else //temperature[index] == average
                System.out.println(temperature[index] + 
                                   " the average");
        }
        System.out.println("Have a nice week.");
    }
}

