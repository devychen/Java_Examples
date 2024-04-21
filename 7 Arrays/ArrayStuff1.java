/**
 * A program that declares an array of Strings called "friends"
 * with length 4 and fills it with names of your friends.
 * Print all 4 elements of your array.
 */
public class ArrayStuff1
{
    public static void main(String[] args)
    {
        // Initialize array "friends"
        String[] friends = new String[4];
        friends[0] = "Scott";
        friends[1] = "Michael";
        friends[2] = "Cathleen";
        friends[3] = "Chris";
        
        // Display each friend's name
        System.out.print("The friend's names are: ");
        for (int index = 0; index < 4; index++)
        {
            System.out.print(friends[index] + ", ");
        }
        System.out.println();
    }
}
