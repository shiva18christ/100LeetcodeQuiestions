public class SlidingWindowProblem {
    /*given an array of integer and a integer target.
     Return the minimal length of a sub array
      whose sum is grater than or equal to the target
     */
    public int returnLength(int[] arr, int target) {
        int sum = 0;
        int start = 0;
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            while (sum >= target) {
                minLength = Math.min(minLength, i - start + 1);
                sum = sum - arr[start];
                start++;
            }
        }
        return minLength;
    }

    public static void main(String[] args) {
        SlidingWindowProblem slide = new SlidingWindowProblem();
        int[] arr = {2, 15, 6, 9, 4, 1};
        int target = 21;
        int result = slide.returnLength(arr, target);
        System.out.println(result);

    }
}
