public class ProductOfArray {//Question 1
    public int productOfArray(int[] array, int choice) {
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            if (i != choice) {
                product = product * array[i];
            }
        }
        return product;
    }

    public static void main(String[] args) {
        ProductOfArray product = new ProductOfArray();
        int[] arr = {2, 3, 5, 6, 7, 8, 9, 11};
        int choice = 4;
        System.out.println(product.productOfArray(arr, choice));
    }
}
