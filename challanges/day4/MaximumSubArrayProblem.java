package challanges.day4;


public class MaximumSubArrayProblem {
    // The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:
    // Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
    // should be 6: {4, -1, 2, 1}
    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, -4, 6}));
    }

    // Kadene's Algorithm
    // Starts new subarray.
    // Add into prev subarray.
    public static int sequence(int[] arr) {
        int maxSoFar = 0;
        int maxEndingHere = 0;
        for (int num: arr) {
            maxEndingHere = Math.max(num, maxEndingHere + num);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
