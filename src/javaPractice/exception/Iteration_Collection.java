package javaPractice.exception;

import java.util.*;

public class Iteration_Collection {
    public static void main(String[] args) {

        List l=new ArrayList<>();
        l.add(0,568);  //list store data in index format
        l.add(1,987);
        l.add(2,565);
        l.add(null);                 //list can store one or more null value
        l.add(568);                 //list can store duplicate value
        l.add(null);

        System.out.println(l);

        ListIterator li= l.listIterator();  //iteration is the repetition process in order of sequence
        while (li.hasNext())
        {
            System.out.println(li.next());
        }

        System.out.println("----------------------");

        while (li.hasPrevious())
        {
            System.out.println(li.previous());
        }

       // li.add("hello");
      //  System.out.println(l);

        li.set("world");                //used to replace
        System.out.println(l);

        Vector v=new Vector<>();
        v.add(658);
        v.add(688);
        v.add("hii");

        System.out.println(v);

        Enumeration e=v.elements();     //only used for vector and stack
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }


    }
}
