package javaPractice.array;

public class MergeTwoSortedArraysWithoutExtraSpace {
    public static void merge(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[0]) {
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;

                // Re-sort arr2
                for (int j = 0; j < arr2.length - 1; j++) {
                    if (arr2[j] > arr2[j + 1]) {
                        int t = arr2[j];
                        arr2[j] = arr2[j + 1];
                        arr2[j + 1] = t;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        merge(arr1, arr2);

        for (int num : arr1) System.out.print(num + " ");
        for (int num : arr2) System.out.print(num + " ");
    }
}
