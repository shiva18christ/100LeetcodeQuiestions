import java.util.Arrays;

public class MoveZerosToLast {//Question 2

    public void adjust(int[] arr) {
        int position = arr.length - 1;
        for (int i = 0; i < position; i++) {
            if (arr[i] == 0) {
                int temp = arr[position];
                arr[position] = arr[i];
                arr[i] = temp;
                --position;
                i--;
            }
        }
    }

    public static void main(String[] args) {
        MoveZerosToLast move = new MoveZerosToLast();
        int[] arr = {2, 4, 3, 0, 1, 5, 0, 12, 0, 33, 0};
        move.adjust(arr);
        System.out.println(Arrays.toString(arr));

    }

}
