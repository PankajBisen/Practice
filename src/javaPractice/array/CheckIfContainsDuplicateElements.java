package javaPractice.array;

public class CheckIfContainsDuplicateElements {
    public static boolean hasDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }

            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2};
        System.out.println(hasDuplicate(arr)); // Output: true
    }
}
