/**
 * Print all elements given as arguments to main method.
 */
public class ArrayStuff5
{
    public static void main(String[] args)
    {
        printArray(args); // note: no square brackets in this method call
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