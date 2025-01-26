package java_practice.string;

public class StringCompression {
    public String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        compressed.append(str.charAt(str.length() - 1)).append(count);

        return compressed.length() < str.length() ? compressed.toString() : str;
    }


    public class StringCompression1 {
        public static String compress(String str) {
            StringBuilder compressed = new StringBuilder();
            int count = 1;

            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(i - 1)) {
                    count++;
                } else {
                    compressed.append(str.charAt(i - 1)).append(count);
                    count = 1;
                }
            }
            compressed.append(str.charAt(str.length() - 1)).append(count);

            return compressed.toString();
        }

        public static void main(String[] args) {
            System.out.println(compress("aaabbc")); // Output: a3b2c1
        }
    }
}
