package javaPractice.array;

public class CheckIfArrayCanBePartitionedIntoTwoSubsetsWithEqualSum {
    public static boolean canPartition(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;

        // If the sum is odd, can't partition
        if (sum % 2 != 0) return false;

        int target = sum / 2;
        return subsetSum(arr, target, 0);
    }

    private static boolean subsetSum(int[] arr, int target, int index) {
        if (target == 0) return true;
        if (index == arr.length || target < 0) return false;

        // Include or exclude current element
        return subsetSum(arr, target - arr[index], index + 1) || subsetSum(arr, target, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 11, 5};
        System.out.println(canPartition(arr)); // Output: true
    }
}
