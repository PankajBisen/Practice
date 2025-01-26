package java_practice.string;

public class ConvertStringToTitleCase {
    public class TitleCase {
        public static String toTitleCase(String str) {
            StringBuilder result = new StringBuilder();
            boolean capitalizeNext = true;

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == ' ') {
                    capitalizeNext = true;
                    result.append(c);
                } else if (capitalizeNext) {
                    result.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    result.append(Character.toLowerCase(c));
                }
            }
            return result.toString();
        }

        public static void main(String[] args) {
            System.out.println(toTitleCase("hello world java")); // Output: Hello World Java
        }
    }

}
