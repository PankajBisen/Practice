package javaPractice.string;

public class CheckIfStringContainsBalancedParentheses {
    public class BalancedParentheses {
        public static boolean isBalanced(String str) {
            int balance = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '(') {
                    balance++;
                } else if (c == ')') {
                    balance--;
                }
                if (balance < 0) {
                    return false; // More closing brackets than opening
                }
            }
            return balance == 0; // Ensure all are matched
        }

        public static void main(String[] args) {
            System.out.println(isBalanced("(())")); // Output: true
            System.out.println(isBalanced("(()"));  // Output: false
        }
    }

}
