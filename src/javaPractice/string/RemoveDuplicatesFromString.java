package javaPractice.string;

public class RemoveDuplicatesFromString {
    public String removeDuplicates(String str) {
        boolean[] seen = new boolean[256];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!seen[c]) {
                result.append(c);
                seen[c] = true;
            }
        }
        return result.toString();
    }

    public class RemoveDuplicates {
        public static String removeDuplicates(String str) {
            boolean[] charSeen = new boolean[256]; // ASCII size
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (!charSeen[c]) {
                    result.append(c);
                    charSeen[c] = true;
                }
            }
            return result.toString();
        }

        public static void main(String[] args) {
            System.out.println(removeDuplicates("hello")); // Output: helo
        }
    }
}
