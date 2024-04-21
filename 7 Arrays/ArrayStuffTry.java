public class ArrayStuffTry {
    public static void main(String[] args) {

        String[] friends = new String[4];

        friends[0] = "Kei";
        friends[1] = "Shimizu Hare";
        friends[2] = "Goto Tooru";
        friends[3] = "Audrey";

        // Display names
        printArrayy(friends);

        // Check and display names longer than 5 characters
        System.out.println("\nNames longer than 5 characters: ");
        for (int i = 0; i < friends.length; i++) {
            if (isLongerThan5Chars(friends[i])) {
                System.out.print(friends[i] + ", ");
            }
        }
    }

    public static boolean isLongerThan5Chars(String name) {
        return name.length() > 5;
    }

    public static void printArrayy(String[] anArray) {
        System.out.println("My best friends are: ");
        for (int i = 0; i < anArray.length; i++) {
            System.out.print(anArray[i] + ", ");
        }
    }
}
