package javaPractice.array;

public class FindLongestConsecutiveSequenceInArray {

    public static int findLongest(int[] arr) {
        int maxLength = 0;

        for (int num : arr) {
            boolean isStart = true;

            // Check if it is the start of a sequence
            for (int n : arr) {
                if (n == num - 1) {
                    isStart = false;
                    break;
                }
            }

            // Count the length of the sequence
            if (isStart) {
                int length = 0;
                int current = num;
                while (true) {
                    boolean found = false;
                    for (int n : arr) {
                        if (n == current) {
                            found = true;
                            length++;
                            current++;
                            break;
                        }
                    }
                    if (!found) break;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(findLongest(arr)); // Output: 4
    }
}
