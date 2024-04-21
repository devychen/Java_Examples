import java.util.*;

/**
 * Determines the average of a list of (nonnegative) exam scores.
 * Repeats for more exams until the user says to stop.
 */
public class ExamAverager {
    public static void main(String[] args) {
        System.out.println("This program computes the average of");
        System.out.println("a list of (nonnegative) exam scores.");
        double sumScores;
        int numberOfStudents;
        double nextScores;
        String answer;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("Enter all the scores to be averaged.");
            System.out.println("Enter a negative number after");
            System.out.println("you have entered all the scores.");
            sumScores = 0; // initialise
            numberOfStudents = 0;
            nextScores = keyboard.nextDouble(); // read input

            while (nextScores >= 0) {
                sumScores += nextScores;
                numberOfStudents++;
                nextScores = keyboard.nextDouble();
            }
            if (numberOfStudents > 0)
                System.out.println("The average is "
                        + (sumScores / numberOfStudents));
            else
                System.out.println("No scores to average.");
            System.out.println("Want to average another exam?");
            System.out.println("Enter yes or no.");
            answer = keyboard.next();
        } while (answer.equalsIgnoreCase("yes"));

        keyboard.close();

    }
}