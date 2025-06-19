package javaPractice.string;

public class FindAllSubstringsOfString {
    public static void printAllSubstrings(String str) {
        String tmp = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i ; j < str.length(); j++){
                tmp = tmp + str.charAt(j);
                System.out.println(tmp);
            }
        }
//        for (int i =0; i < str.length(); i++){
//            tmp =  str.charAt(i) + tmp;
//        }
//        System.out.println(tmp);
    }
    public static void main(String[] args) {
        printAllSubstrings("abc");
        // Output: a, ab, abc, b, bc, c
    }
}
