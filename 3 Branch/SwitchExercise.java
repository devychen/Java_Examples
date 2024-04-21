package Branch;
import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args){
        String word;
        System.out.println("Please enter a word");
        Scanner keyboard = new Scanner(System.in);
        word = keyboard.nextLine();
        char firstChar = word.charAt(0);
        boolean isVowel;

        switch(firstChar){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                isVowel = true;
                break;
            default:
                isVowel = false;
        }

        keyboard.close();

        if (isVowel){
            System.out.println("The word \"" + word + "\" " + "starts with a vowel.");
        } else {
            System.out.println("The word \"" + word + "\" " + "starts with a consonant.");
        }
    }
}
