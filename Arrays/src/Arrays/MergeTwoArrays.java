package Arrays.src.Arrays;

import java.util.Arrays;

public class MergeTwoArrays {
    /* Given Two integer array num1 and num1 sorted in increasing order
    and two integers m and n representing numbers of elements in
    num 1 and num2 respectively.Merge both arrays in a single
    array sorted in increasing order.
     */

    public int[] merge(int[] num1, int[] num2, int n, int m) {
        int[] mergedArray = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (num1[i] <= num2[j]) {
                mergedArray[k] = num1[i];
                i++;
            } else {
                mergedArray[k] = num2[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            mergedArray[k] = num1[i];
            i++;
            k++;
        }
        while (j < m) {
            mergedArray[k] = num2[j];
            j++;
            k++;
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        MergeTwoArrays merger = new MergeTwoArrays();
        int[] num1 = {20, 40, 60, 80, 100};
        int[] num2 = {10, 30, 50, 70, 90};
        int n = 5;
        int m = 5;
        int[] result = merger.merge(num1, num2, n, m);
        System.out.println(Arrays.toString(result));
    }
}
