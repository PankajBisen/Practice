package javaPractice.array;

public class FindSmallestMissingPositiveInteger {
    public static int findSmallestMissing(int[] arr) {
        int smallest = 1;

        while (true) {
            boolean found = false;
            for (int num : arr) {
                if (num == smallest) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return smallest;
            }
            smallest++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println(findSmallestMissing(arr)); // Output: 2
    }
}
