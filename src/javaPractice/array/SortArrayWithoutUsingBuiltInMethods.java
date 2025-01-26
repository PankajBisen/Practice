package javaPractice.array;

public class SortArrayWithoutUsingBuiltInMethods {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 3};
        bubbleSort(arr);
        for (int num : arr) {
            System.out.print(num + " "); // Output: 1 2 3 4 5
        }
    }
}
