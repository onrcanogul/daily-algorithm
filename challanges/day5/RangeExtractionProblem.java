package challanges.day5;

public class RangeExtractionProblem {

    //Solution.rangeExtraction(new int[] {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20})
    //# returns "-10--8,-6,-3-1,3-5,7-11,14,15,17-20"
    public static void main(String[] args) {
        System.out.println(rangeExtraction(new int[] {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}));
    }

    public static String rangeExtraction(int[] arr) {
        String result = "";
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if(i != arr.length -1) {
                if (arr[i + 1] - arr[i] != 1) {
                    result += ",";
                    counter = 0;
                } else {
                    counter++;
                    if (counter >= 3) {
                        result += "-" + arr[i];
                    }
                }
            }
        }
        return result;
    }
}
