package javaPractice.array;

public class CheckIfArrayIsSubsetOfAnotherArray {
    public static boolean isSubset(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4};
        System.out.println(isSubset(arr1, arr2)); // Output: true
    }
}
