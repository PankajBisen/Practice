package java_practice;

public class Association {
    public void red()
    {
        System.out.println("this is red color");
    }

    public void black()
    {
        System.out.println("this is black color");
    }

    public void green()
    {
        System.out.println("this is green color");
    }

    public void white()
    {
        System.out.println("this is white color");
    }

    public static void main(String[] args) {
        Association a =new Association();
        a.red();
        a.black();
        a.green();
        a.white();
    }
}
