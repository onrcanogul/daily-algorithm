package challanges;

import java.util.stream.IntStream;

public class Multiplies3or5 {

    //If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
    //
    //Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
    //
    //Note: If a number is a multiple of both 3 and 5, only count it once.
    public static void main(String[] args) {
        int result = solution(10);
        System.out.println(result);
    }
    //basic solution
    public static int solution(int number) {
        int result = 0;
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }
    //stream solution
    public static int solution(Integer number) {
        return IntStream.range(0, number)
                .filter(i -> i % 3 == 0 || i % 5 == 0)
                .sum();
    }


}
