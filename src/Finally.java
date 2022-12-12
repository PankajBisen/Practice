import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Finally {
    public static void main(String[] args) throws IOException
    {

        FileInputStream f = null;

        try
        {
           f=new FileInputStream("D/abc.txt");
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
            System.out.println("hi");
        }
        finally                              //clean up code e.g.close file or close connection
        {
            if (f!=null)
            {
                f.close();
            }
            System.out.println("file close successfully");
        }
    }
}
