package Arrays;

import java.util.Arrays;
//the next permutation of an array of
// integers is the next lexicographically
// greater permutations of it's integers . g
// iven an array of integers nums, find the next permutations of
// nums. The replacement must be in place and use only constant extra memory.
// write in java

public class NextPermutation {
    public void swap(int[] arr, int a, int b) {
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public void permutation(int[] arr) {
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = arr.length - 1;
            while (j >= 0 && arr[j] <= arr[i]) {
                j--;
            }
            swap(arr, i, j);
        }
        reverse(arr, i + 1, arr.length - 1);
    }

    public static void main(String[] args) {
        NextPermutation permutation = new NextPermutation();
        int[] arr = {2, 4, 6, 1, 3};
        permutation.permutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
