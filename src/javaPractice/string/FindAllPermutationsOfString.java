package javaPractice.string;

public class FindAllPermutationsOfString {
    public class Permutations {
        public static void findPermutations(String str, String perm) {
            if (str.isEmpty()) {
                System.out.println(perm);
                return;
            }

            for (int i = 0; i < str.length(); i++) {
                char current = str.charAt(i);
                String remaining = str.substring(0, i) + str.substring(i + 1);
                findPermutations(remaining, perm + current);
            }
        }

        public static void main(String[] args) {
            findPermutations("abc", "");
            // Output: abc, acb, bac, bca, cab, cba
        }
    }

}
