import java.util.Scanner;

public class AddressReader {
    public static void main(String[] args) {
    int age = 0;
    String lastName = "", address = "";
    Scanner keyboard = new Scanner(System.in);
    lastName = keyboard.nextLine();
    age = keyboard.nextInt();
    keyboard.nextLine();
    address = keyboard.nextLine();
    
    System.out.println(lastName + " " + age + "\n" + address);
    keyboard.close();
    }
}