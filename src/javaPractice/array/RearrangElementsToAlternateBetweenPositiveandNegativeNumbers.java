package javaPractice.array;

public class RearrangElementsToAlternateBetweenPositiveandNegativeNumbers {

    public static void rearrange(int[] arr) {
        int[] temp = new int[arr.length];
        int posIndex = 0, negIndex = 1;

        for (int num : arr) {
            if (num >= 0) {
                if (posIndex < arr.length) temp[posIndex] = num;
                posIndex += 2;
            } else {
                if (negIndex < arr.length) temp[negIndex] = num;
                negIndex += 2;
            }
        }

        // Copy back
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, -4, -1, 5, -6};
        rearrange(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
