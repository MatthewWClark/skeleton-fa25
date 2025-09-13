import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListExercises {
    /** Returns the total sum in a list of integers */
    public static int sum(List<Integer> L) {
        int sum_int = 0;

        for (int elem : L){
            sum_int = sum_int + elem;
        }

        return sum_int;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> even_nums = new ArrayList<>();
        for (int elem : L){
            if (elem % 2 == 0){
                even_nums.add(elem);
            }

        }
        return even_nums;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> common_items = new ArrayList<>();
        for (int elem : L1){
            if (L2.contains(elem)){
                common_items.add(elem);
            }
        }
        return common_items;
    }

    public static int countOccurrencesOfWord(List<String> words, String w) {
        int occurances = 0;
        for (String word : words){
            if (Objects.equals(word, w)){
                occurances++;
            }
        }

        return occurances;
    }

    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int occurances = 0;
        for (String word : words){
            for (int i = 0; i<word.length(); i++){
                if (word.charAt(i) == c){
                    occurances ++;
                }
            }
        }
        return occurances;
    }
}
