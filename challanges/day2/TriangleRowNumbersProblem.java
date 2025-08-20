package challanges.day2;


public class TriangleRowNumbersProblem {

    //              1
    //           3     5
    //        7     9    11
    //    13    15    17    19
    // 21    23    25    27    29
    // Calculate the sum of the numbers in the nth row of this triangle (starting at index 1)

    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(1));
        System.out.println(rowSumOddNumbers(42));
    }

    public static int rowSumOddNumbers(int n) {
        return n*n*n;
    }
}
