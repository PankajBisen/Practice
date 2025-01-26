package java_practice.exception;

public class Association_sub {
    public void yellow()
    {
        System.out.println("this is yellow color");
    }

    public static void main(String[] args) {
        Association a=new Association();
        a.white();
        Association_sub as =new Association_sub();
        as.yellow();
    }
}
