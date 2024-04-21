/**
 * A program that declares an array of Strings called "friends"
 * with length 4 and fills it with names of your friends.
 * Print all elements of your array.
 * 
 * instead of using 4, using length.
 */
public class ArrayStuff2
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
        for (int index = 0; index < friends.length; index++)
        {
            System.out.print(friends[index] + ", ");
        }
        System.out.println();
    }
}
