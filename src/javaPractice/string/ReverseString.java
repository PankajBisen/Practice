package javaPractice.string;

public class ReverseString {
    public String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = str.length() - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public class ReverseString1 {
        public static String reverse(String str) {
            char[] chars = str.toCharArray();
            StringBuilder reversed = new StringBuilder();
            for (int i = chars.length - 1; i >= 0; i--) {
                reversed.append(chars[i]);
            }
            return reversed.toString();
        }

        public static void main(String[] args) {
            System.out.println(reverse("hello")); // Output: olleh
        }
    }
}
