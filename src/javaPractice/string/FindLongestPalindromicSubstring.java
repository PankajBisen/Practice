package javaPractice.string;

public class FindLongestPalindromicSubstring {
    public static String longestPalindrome(String str) {
        int start = 0, maxLength = 1;

        for (int i = 1; i < str.length(); i++) {
            int low = i - 1, high = i;
            while (low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    start = low;
                    maxLength = high - low + 1;
                }
                low--;
                high++;
            }

            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    start = low;
                    maxLength = high - low + 1;
                }
                low--;
                high++;
            }
        }
        return str.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        longestPalindrome("rqradarqe");
    }
}
