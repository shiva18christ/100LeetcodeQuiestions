import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdditionOne {
    public List<int[]> add(int[] arr, int target) {
        List<int[]> pairs = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target && i != j) {
                    pairs.add(new int[]{i, j});
                }
            }
        }
         return pairs;
    }

}
