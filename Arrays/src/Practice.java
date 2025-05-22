package Arrays.src;

import java.util.Arrays;

class Practice {
    public void reverse(char[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Practice practice = new Practice();
        char[] arr = {'S','H','I','V','A','N','G','I'};
        practice.reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
}
