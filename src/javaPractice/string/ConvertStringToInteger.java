package javaPractice.string;

public class ConvertStringToInteger {
    public int stringToInteger(String str) {
        int result = 0, i = 0, sign = 1;

        if (str.charAt(0) == '-') {
            sign = -1;
            i++;
        }

        for (; i < str.length(); i++) {
            result = result * 10 + (str.charAt(i) - '0');
        }
        return result * sign;
    }

}
