package javaPractice.string;

public class FindMostFrequentCharacter {
    public char mostFrequentChar(String str) {
        int[] charCount = new int[256];
        int maxCount = 0;
        char result = '\0';

        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
            if (charCount[str.charAt(i)] > maxCount) {
                maxCount = charCount[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }



}
