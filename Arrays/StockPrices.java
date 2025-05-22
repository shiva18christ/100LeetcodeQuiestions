package Arrays;

public class StockPrices {//Question 3

    public int stock(int[] arr) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        if (max > min) {
            return arr[max] - arr[min];
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        StockPrices prices = new StockPrices();
        int[] arr = {18, 22, 12, 8, 10, 7};
        System.out.println(prices.stock(arr));
    }
}
