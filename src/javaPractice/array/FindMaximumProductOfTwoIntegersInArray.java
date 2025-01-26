package javaPractice.array;

public class FindMaximumProductOfTwoIntegersInArray {
    public static int maxProduct(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        return max1 * max2;
    }

    public static void main(String[] args) {
        int[] arr = {1, 10, 3, 5};
        System.out.println(maxProduct(arr)); // Output: 50
    }
}
