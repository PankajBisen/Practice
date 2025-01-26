package javaPractice.array;

public class FindSecondLargestElementInArray {
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};
        System.out.println(findSecondLargest(arr)); // Output: 45
    }
}
