package javaPractice.array;

public class FindDuplicateElementsInArray {
    public static void findDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate: " + arr[i]);
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 2, 1, 4};
        findDuplicates(arr); // Output: Duplicate: 4, Duplicate: 2
    }
}
