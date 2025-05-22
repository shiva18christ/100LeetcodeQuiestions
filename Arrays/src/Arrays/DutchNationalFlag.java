package Arrays.src.Arrays;

import java.util.Arrays;

class DutchNationalFlag {
    /*Arrange all the reds first
     then all the white and then all the greens out of an array
     */
    public void arrange(char[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 'R':
                    swap(arr, mid, low);
                    low++;
                    mid++;
                    break;
                case 'W':
                    mid++;
                    break;
                case 'G':
                    swap(arr, mid, high);
                    high--;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid colour" + arr[mid]);
            }
        }
    }

    public void swap(char[] arr, int a, int b) {
        char temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    public static void main(String[] args) {
        DutchNationalFlag flag = new DutchNationalFlag();
        char[] colour = {'W', 'G', 'W', 'R', 'W', 'G', 'R', 'G', 'R'};
        flag.arrange(colour);
        System.out.println(Arrays.toString(colour));
    }
}