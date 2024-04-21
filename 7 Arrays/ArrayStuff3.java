/**
 * A program that declares an array of Strings called "friends"
 * with length 4 and fills it with names of your friends.
 * Print all those elements of your array that are more
 * than 5 character long.
 */
public class ArrayStuff3
{
    public static void main(String[] args)
    {
        // Initialize array "friends"
        String[] friends = new String[4];
        friends[0] = "Scott";
        friends[1] = "Michael";
        friends[2] = "Cathleen";
        friends[3] = "Chris";
        
        // Display each friend's name that is longer than 5 chars
        System.out.print("The friend's names are: ");
        for (int index = 0; index < friends.length; index++)
        {
            if (isLongerThanFiveChars(friends[index]))
            {
                System.out.print(friends[index] + ", ");
            }
        }
        System.out.println();
    }
    
    public static boolean isLongerThanFiveChars(String name) // 因为你要判断的是一个string的length是否>5。
    {
        return (name.length() > 5);
    }

}
