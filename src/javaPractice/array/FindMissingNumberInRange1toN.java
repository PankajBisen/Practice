package javaPractice.array;

public class FindMissingNumberInRange1toN {
    public static int findMissing(int[] arr, int n) {
        int sum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }
        return sum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6;
        System.out.println(findMissing(arr, n)); // Output: 3
    }
}
