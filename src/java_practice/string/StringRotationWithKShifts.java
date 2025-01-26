package java_practice.string;

public class StringRotationWithKShifts {
    public class StringRotation {
        public static String rotate(String str, int k) {
            k = k % str.length(); // Handle large k values
            String part1 = str.substring(0, str.length() - k);
            String part2 = str.substring(str.length() - k);
            return part2 + part1;
        }

        public static void main(String[] args) {
            System.out.println(rotate("abcdef", 2)); // Output: efabcd
        }
    }

}
