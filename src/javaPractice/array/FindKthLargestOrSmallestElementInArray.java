package javaPractice.array;

public class FindKthLargestOrSmallestElementInArray {
    public static int findKthLargest(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[k - 1];
    }

    public static int findKthSmallest(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[k - 1];
    }


    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(findKthLargest(arr, k)); // Output: 5

        int[] arr1 = {7, 10, 4, 3, 20, 15};
        int k1 = 3;
        System.out.println(findKthSmallest(arr, k)); // Output: 7
    }
}
