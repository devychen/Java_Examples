package Branch;

import java.util.Scanner;

public class RewriteGrader
{
    public static void main(String[] args)
    {
        int score;
        char grade;
		
        System.out.println("Enter your score: ");
        Scanner keyboard = new Scanner(System.in);
        score = keyboard.nextInt( );
		
        if (score < 60)
            grade = 'F';
        else if (score < 70)
            grade = 'D';
        else if (score < 80)
            grade = 'C';
        else if (score < 90)
            grade = 'B';
        else
            grade = 'A';
			
        System.out.println("Score = " + score);
        System.out.println("Grade = " + grade);

        keyboard.close();
    }
}
