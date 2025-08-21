package challanges.day3;

import java.util.HashMap;

public class TwoSumProblem {
    //Write a function that takes an array of numbers (integers for the tests) and a target number. It should find two different items in the array that, when added together, give the target value. The indexes of these items should then be returned in a tuple / list (depending on your language) like so: (index1, index2).
    //
    //For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.
    //
    //The input will always be valid (numbers will be an array of length 2 or greater, and all of the items will be numbers; target will always be the sum of two different items from that array).
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int need = target - numbers[i];
            if (seen.containsKey(need)) {
                return new int [] { seen.get(need), i };
            }
            seen.putIfAbsent(numbers[i], i);
        }
        return new int[] { -1, -1 };
    }
}
