package java_practice.string;

public class FindFirstNonRepeatingCharacter {
    public char firstNonRepeatingChar(String str) {
        int[] charCount = new int[256];

        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return '\0'; // Return null character if no unique character is found
    }


    public class FirstNonRepeatingChar {
        public static char firstNonRepeating(String str) {
            int[] charCount = new int[256]; // ASCII size

            for (int i = 0; i < str.length(); i++) {
                charCount[str.charAt(i)]++;
            }

            for (int i = 0; i < str.length(); i++) {
                if (charCount[str.charAt(i)] == 1) {
                    return str.charAt(i);
                }
            }
            return '\0'; // No non-repeating character
        }

        public static void main(String[] args) {
            System.out.println(firstNonRepeating("swiss")); // Output: w
        }
    }
}
