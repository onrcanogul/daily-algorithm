package challanges.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryArrayToNumberProblem {
    //Given an array of ones and zeroes, convert the equivalent binary value to an integer.
    //
    //Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1
    //Testing: [0, 0, 0, 1] ==> 1
    //Testing: [0, 0, 1, 0] ==> 2
    //Testing: [0, 1, 0, 1] ==> 5
    //Testing: [1, 0, 0, 1] ==> 9
    //Testing: [0, 0, 1, 0] ==> 2
    //Testing: [0, 1, 1, 0] ==> 6
    //Testing: [1, 1, 1, 1] ==> 15
    //Testing: [1, 0, 1, 1] ==> 11
    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 1, 1, 0))));
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        List<Integer> digits = new ArrayList<>();
        for (int i = binary.size() - 1, j = 0; i >= 0; i--, j++)
            digits.add(binary.get(i) * (int)Math.pow(2, j));
        return digits.stream().mapToInt(Integer::intValue).sum();
    }


}
