package java_practice.string;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {
    public int longestUniqueSubstring(String str) {
        int[] lastIndex = new int[256];
        Arrays.fill(lastIndex, -1);

        int maxLength = 0, start = 0;

        for (int i = 0; i < str.length(); i++) {
            start = Math.max(start, lastIndex[str.charAt(i)] + 1);
            maxLength = Math.max(maxLength, i - start + 1);
            lastIndex[str.charAt(i)] = i;
        }
        return maxLength;
    }

    public class LongestUniqueSubstring {
        public static int longestUniqueSubstring(String str) {
            int maxLength = 0;
            int[] lastSeen = new int[256]; // ASCII size
            for (int i = 0; i < 256; i++) lastSeen[i] = -1;

            int start = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (lastSeen[c] >= start) {
                    start = lastSeen[c] + 1;
                }
                lastSeen[c] = i;
                maxLength = Math.max(maxLength, i - start + 1);
            }
            return maxLength;
        }

        public static void main(String[] args) {
            System.out.println(longestUniqueSubstring("abcabcbb")); // Output: 3
        }
    }
}
