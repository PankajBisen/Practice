package java_practice.string;

public class CountOccurrencesOfCharacter {
    public int countCharacter(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }


    public class CountCharacter {
        public static int countChar(String str, char c) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c) {
                    count++;
                }
            }
            return count;
        }

        public static void main(String[] args) {
            System.out.println(countChar("hello world", 'o')); // Output: 2
        }
    }
}
