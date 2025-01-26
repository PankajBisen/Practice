package javaPractice.array;

public class FindMajorityElementAppearsMoreThanNby2Times {
    public static int findMajority(int[] arr) {
        int count = 0, candidate = -1;

        // Step 1: Find Candidate
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify Candidate
        count = 0;
        for (int num : arr) {
            if (num == candidate) count++;
        }
        return (count > arr.length / 2) ? candidate : -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 2, 2};
        System.out.println(findMajority(arr)); // Output: 2
    }
}
