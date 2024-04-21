/**
 * A program that declares an array of Strings called "friends"
 * with length 4 and fills it with names of your friends.
 * Print all elements of your array.
 */
public class ArrayStuff4
{
    public static void main(String[] args)
    {
        // Initialize array "friends"
        String[] friends = new String[4];
        friends[0] = "Scott";
        friends[1] = "Michael";
        friends[2] = "Cathleen";
        friends[3] = "Chris";
        
        printArray(friends); // note: no square brackets in this method call
    }
    
    public static void printArray(String[] anArray) // note: array parameter in method heading does not specify the length
    {
        // Display each element in the array
        System.out.print("The friend's names are: ");
        for (int index = 0; index < anArray.length; index++)
        {
            System.out.print(anArray[index] + ", ");
        }
        System.out.println();
    }
}
