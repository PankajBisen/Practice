package javaPractice.string;

public class CheckIfStringContainsOnlyDigits {
    public static boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isNumeric("123456")); // Output: true
    }
}
