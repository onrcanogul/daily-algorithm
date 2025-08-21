package challanges.day3;

import java.util.Arrays;

public class SortOddsProblem {
    //You will be given an array of numbers.
    // You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.
    //[7, 1]  =>  [1, 7]
    //[5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
    //[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
    public static void main(String[] args) {

    }

    public static int[] sortArray(int[] array) {
        int[] sortedOdds = Arrays.stream(array).filter(a -> a % 2 == 1).sorted().toArray();
        int oddIndex = 0;
        for (int i = 0; i < array.length; i++) if (array[i] % 2 != 0) array[i] = sortedOdds[oddIndex++];
        return array;
    }
}
