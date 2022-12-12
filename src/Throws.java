import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws
{
    void file() throws FileNotFoundException
    {
        FileInputStream f=new FileInputStream("D/abc.txt");
    }
}

class Read
{
    public static void main(String[] args) {

        Throws t = new Throws();

        try {
            t.file();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
    }
}


