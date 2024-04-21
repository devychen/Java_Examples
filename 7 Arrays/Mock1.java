public class Mock1 {
    /**
     * This methods searches for <code>String needle</code> in array
     * <code>haystack</code> and return the index of the found string
     * or -1 when the string is not part of the array
     * @param needle Item to search
     * @param haystack Array where the item should be looked uo.
     * @return The index in the array or -1 when the item is not contained.
    */
    public static int searchStringInaArray(String needle, String[] haystack){
        
        for(int i = 0; i < haystack.length; i++){
            if (haystack[i].equalsIgnoreCase(needle)){
                return i;
            }
        }
        return -1;

    }
    
}
