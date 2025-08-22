package challanges.day4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class GreedProblem {
    //Greed is a dice game played with five six-sided dice.
    //Your mission, should you choose to accept it, is to score a throw according to these rules.
    //You will always be given an array with five six-sided dice values.
    // Three 1's => 1000 points
    // Three 6's =>  600 points
    // Three 5's =>  500 points
    // Three 4's =>  400 points
    // Three 3's =>  300 points
    // Three 2's =>  200 points
    // One   1   =>  100 points
    // One   5   =>   50 point

    public static void main(String[] args) {
        System.out.println(greedy(new int[]{2, 4, 4, 5, 4}));
    }

    public static int greedy(int[] dice){
        AtomicInteger score = new AtomicInteger();
        Map<Integer, Long> groupedDices = Arrays.stream(dice).boxed().collect(Collectors.groupingBy(
                n -> n,
                Collectors.counting()
        ));
        groupedDices.forEach((number, count) -> {
            Map<Integer, Integer> map = determineTheCoefficients(number);
            long countOfThreeOnes = count / 3;
            long otherOnes = count % 3;
            score.addAndGet((int) ((map.get(3) * countOfThreeOnes) + map.get(1) * otherOnes));
        });
        return score.get();
    }

    private static Map<Integer, Integer> determineTheCoefficients(int number) {
        int single = 0;
        int three = 0;
        if(number == 1) {
            single = number * 100;
            three = number * 1000;
        } else {
            if (number == 5) {
                single = number * 10;
            }
            three = number * 100;
        }
        return Map.of(1, single, 3, three);
    }
}
