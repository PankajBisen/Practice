package javaPractice.string;

public class FindMinimumWindowSubstring {
    public class MinimumWindowSubstring {
        public static String minWindow(String s, String t) {
            int[] targetFreq = new int[256];
            int[] windowFreq = new int[256];

            for (int i = 0; i < t.length(); i++) {
                targetFreq[t.charAt(i)]++;
            }

            int left = 0, right = 0, minLength = Integer.MAX_VALUE, startIndex = -1, matchCount = 0;

            while (right < s.length()) {
                char rc = s.charAt(right);
                windowFreq[rc]++;
                if (targetFreq[rc] > 0 && windowFreq[rc] <= targetFreq[rc]) {
                    matchCount++;
                }

                while (matchCount == t.length()) {
                    if (right - left + 1 < minLength) {
                        minLength = right - left + 1;
                        startIndex = left;
                    }

                    char lc = s.charAt(left);
                    windowFreq[lc]--;
                    if (targetFreq[lc] > 0 && windowFreq[lc] < targetFreq[lc]) {
                        matchCount--;
                    }
                    left++;
                }
                right++;
            }

            return startIndex == -1 ? "" : s.substring(startIndex, startIndex + minLength);
        }

        public static void main(String[] args) {
            System.out.println(minWindow("ADOBECODEBANC", "ABC")); // Output: BANC
        }
    }

}
