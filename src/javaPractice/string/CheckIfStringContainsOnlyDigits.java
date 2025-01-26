package javaPractice.string;

public class CheckIfStringContainsOnlyDigits {
    public boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }


    public class StringRotation {
        public static boolean isRotation(String s1, String s2) {
            if (s1.length() != s2.length()) return false;

            String combined = s1 + s1;
            return combined.contains(s2);
        }

        public static void main(String[] args) {
            System.out.println(isRotation("ABCD", "DABC")); // Output: true
        }
    }
}
