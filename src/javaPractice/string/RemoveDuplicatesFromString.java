package javaPractice.string;

public class RemoveDuplicatesFromString {
    public static String removeDuplicates(String str) {
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
    public static void main(String[] args) {
        System.out.println(removeDuplicates("hello")); // Output: helo
    }
}
