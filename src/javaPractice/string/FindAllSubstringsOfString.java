package javaPractice.string;

public class FindAllSubstringsOfString {
    public void printAllSubstrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }


    public class Substrings {
        public static void printSubstrings(String str) {
            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j <= str.length(); j++) {
                    System.out.println(str.substring(i, j));
                }
            }
        }

        public static void main(String[] args) {
            printSubstrings("abc");
            // Output: a, ab, abc, b, bc, c
        }
    }
}
