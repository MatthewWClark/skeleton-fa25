public class ArrayExercises {
    /** Returns the second to last item in the given array.
     *  Assumes the array has at least 2 elements. */
    public static String secondToLastItem(String[] items) {
        int length = 0;
        for (String i : items) {
            length++;
        }
        //Minus one for length to index conversion and -1 for second to last
        return items[length-1-1];

    }    

    /** Returns the difference between the minimum and maximum item in the given array */
    public static int minMaxDifference(int[] items) {
        int min = items[0];
        int max = items[0];
        for (int i : items){
            if(i<min){
                min = i;
            }
            if(i>max){
                max = i;
            }
        }
        return max-min;
    }
}
