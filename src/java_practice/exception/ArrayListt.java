package java_practice.exception;
import java.util.ArrayList;

public class ArrayListt
{
    public static void main(String[] args)
    {
        ArrayList al3=new ArrayList<>(7);
        al3.add(0,567);
        al3.add(1,455);
        al3.add("sana");
        al3.add("iqra");

        System.out.println(al3.indexOf(2));  //used to



        ArrayList al =new ArrayList();
        al.add(567);
        al.add(592);
        al.add(567);
        System.out.println(al);

        ArrayList al1 =new ArrayList();
        al1.add("hello");
        al1.add("hii");
        al1.add("world");
        System.out.println(al1);

        al.addAll(al1);
        System.out.println(al);

        System.out.println(al.add(456));   //add new item
        System.out.println(al);

        System.out.println(al.contains("hello"));  //al can contain hello

        System.out.println(al.isEmpty());   //check al is empty or not      //return boolean value

        System.out.println(al.size());

        System.out.println(al.remove("hello"));  //remove element
        System.out.println(al);

        System.out.println(al.removeAll(al));     //remove all the element
        System.out.println(al);

        ArrayList al2=new ArrayList<>();
        al2.add(567);
        al2.add(657);
        al2.add(768);
        al2.add(679);
        al2.add("sana");
        al2.add("iqra");
        al2.add("payal");
        al2.add("saba");
        System.out.println(al2);

        System.out.println(al2.size());     //check the size of element

        System.out.println(al2.isEmpty());      //check the list is empty or not
        System.out.println(al2);

       






    }
}
