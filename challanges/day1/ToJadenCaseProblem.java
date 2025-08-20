package challanges.day1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ToJadenCaseProblem {

    //Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013).
    // Jaden is also known for some of his philosophy that he delivers via Twitter.
    // When writing on Twitter, he is known for almost always capitalizing every word.
    // For simplicity, you'll have to capitalize each word, check out how contractions are expected to be in the example below.
    //
    //Your task is to convert strings to how they would be written by Jaden Smith.
    // The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
    public static void main(String[] args) {
        System.out.println(toJadenCase("Must return null when the arg is null"));
    }

    //basic solution
    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) return null;

        String[] words = phrase.split(" ");
        StringBuilder createdWords = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            createdWords.append(upperFirstLetter(words[i]));
            if (i != words.length - 1) createdWords.append(" ");
        }
        return createdWords.toString();
    }

    public static String upperFirstLetter(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    //stream solution
    public static String toJadenCaseStream(String phrase) {
        if (null == phrase || phrase.isEmpty()) return null;

        return Arrays.stream(phrase.split(" "))
                .map(ToJadenCaseProblem::upperFirstLetter)
                .collect(Collectors.joining(" "));
    }
}
