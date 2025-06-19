package javaPractice.string;

public class CheckIfStringsareRotations {
    public static boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String concatenated = s1 + s1;
        return concatenated.contains(s2);
    }

    public static void main(String[] args) {
        System.out.println(areRotations("ABCD1", "1ABCD")); // Output: true
    }

}
