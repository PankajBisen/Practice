package java_practice.string;

public class CheckIfTwoStringsAreAnagrams {
    public boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] charCount = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            charCount[s1.charAt(i) - 'a']++;
            charCount[s2.charAt(i) - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }



    public class AnagramCheck {
        public static boolean areAnagrams(String s1, String s2) {
            if (s1.length() != s2.length()) return false;

            int[] charCount = new int[256]; // ASCII size

            for (int i = 0; i < s1.length(); i++) {
                charCount[s1.charAt(i)]++;
                charCount[s2.charAt(i)]--;
            }

            for (int count : charCount) {
                if (count != 0) return false;
            }
            return true;
        }

        public static void main(String[] args) {
            System.out.println(areAnagrams("listen", "silent")); // Output: true
            System.out.println(areAnagrams("hello", "world"));   // Output: false
        }
    }
}
