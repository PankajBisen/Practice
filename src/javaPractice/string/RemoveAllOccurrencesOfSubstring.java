package javaPractice.string;

public class RemoveAllOccurrencesOfSubstring {
    public class RemoveSubstring {
        public static String removeSubstring(String str, String sub) {
            StringBuilder result = new StringBuilder();
            int i = 0;

            while (i <= str.length() - sub.length()) {
                String current = str.substring(i, i + sub.length());
                if (current.equals(sub)) {
                    i += sub.length();
                } else {
                    result.append(str.charAt(i));
                    i++;
                }
            }

            // Append remaining characters
            while (i < str.length()) {
                result.append(str.charAt(i));
                i++;
            }
            return result.toString();
        }

        public static void main(String[] args) {
            System.out.println(removeSubstring("hello world", "world")); // Output: hello
        }
    }

}
