package javaPractice.exception;

public class Try_Catch_Finally
{
    void show()
    {
        int a=56,b=0,c;
        c=a/b;
        System.out.println("the result is "+c);

    }
    void display()
    {
        int x=57,y=8,z;
        z=x/y;
        System.out.println("the result is "+z);
    }
    public static void main(String[] args)
    {
        Try_Catch_Finally tcf =new Try_Catch_Finally();
        try
        {
            tcf.show();
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("hiii");

        tcf.display();

    }
}
