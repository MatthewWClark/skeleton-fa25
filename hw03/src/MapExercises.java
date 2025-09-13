import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        Map<Character, Integer> chars_to_nums = new HashMap<>();
        for (char letter = 'a'; letter <= 'z'; letter++)
        {
            int number = letter - 'a' + 1;
            chars_to_nums.put(letter, number);
        }
        return chars_to_nums;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        Map<Integer, Integer> ints_to_squares = new HashMap<>();
        for (int a : nums){
            ints_to_squares.put(a, a * a);
        }
        return ints_to_squares;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> list_occurrences = new HashMap<>();
        for (String word : words){
            if (list_occurrences.containsKey(word)){
                int value = list_occurrences.get(word);
                list_occurrences.put(word, value + 1);
            }
            else{
                list_occurrences.put(word, 1);
            }
        }
        return list_occurrences;
    }
}
