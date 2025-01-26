package javaPractice.array;

public class FindFirstRepeatingElement {
    public static int findFirstRepeating(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1; // Return -1 if no repeating element is found
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        System.out.println(findFirstRepeating(arr)); // Output: 5
    }
}
