package javaPractice.exception;

public class Try_Catch {
    public static void main(String[] args) {
        try {                   //write risky code
            int a=34,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e)      //handle the code
        {
            System.out.println(e);
           // System.out.println(e.getStackTrace());    //different way to handle the code
            //System.out.println(e.getMessage());
            //System.out.println(e.toString());
        }

        System.out.println("hello ");
    }
}
