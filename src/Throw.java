import java.util.Scanner;

public class Throw
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a age :");

        int age= s.nextInt();

        try {

            if (age < 18) {
                throw new ArithmeticException("your are not eligible for vote");//programmer manually create object
            } else {
                System.out.println("you are eligible");
            }
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}

