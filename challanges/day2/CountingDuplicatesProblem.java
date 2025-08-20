package challanges.day2;

import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingDuplicatesProblem {

    // Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string.
    // The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
    //"abcde" -> 0 # no characters repeats more than once
    //"aabbcde" -> 2 # 'a' and 'b'
    //"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
    //"indivisibility" -> 1 # 'i' occurs six times
    //"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
    //"aA11" -> 2 # 'a' and '1'
    //"ABBA" -> 2 # 'A' and 'B' each occur twice

    public static void main(String[] args) {
        System.out.println(duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }

    public static int duplicateCount(String text) {
        HashMap<Character, Integer> visitedParts = new HashMap<>();
        char[] characters = text.toLowerCase().toCharArray();
        for (char c: characters) {
            visitedParts.put(c, visitedParts.containsKey(c) ? visitedParts.get(c) + 1 : 0);
        }
        return (int)visitedParts.values().stream()
                .filter(val -> val > 0)
                .count();
    }

    public static int duplicateCount(String text, int nothing) {
        return (int) text.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values().stream()
                .filter(count -> count > 1)
                .count();
    }
}
