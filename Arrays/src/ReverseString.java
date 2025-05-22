package Arrays.src;

import java.util.Arrays;

public class ReverseString {//Reverse a String considering
    // it is an array of characters

    public void reverse(char[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

    }

    public void swap(char[] arr, int start, int end) {
        char temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }

    public static void main(String[] args) {
        ReverseString string = new ReverseString();
        char[] arr = {'A', 'P', 'P', 'L', 'E'};
        string.reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
