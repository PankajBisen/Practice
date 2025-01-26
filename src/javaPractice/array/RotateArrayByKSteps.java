package javaPractice.array;

public class RotateArrayByKSteps {
    public static void rotate(int[] arr, int k) {
        k = k % arr.length; // Handle larger k
        int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[(i + k) % arr.length] = arr[i];
        }

        // Copy back to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr, 2);
        for (int num : arr) {
            System.out.print(num + " "); // Output: 4 5 1 2 3
        }
    }
}
