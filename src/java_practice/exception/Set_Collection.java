package java_practice.exception;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Collection {
    public static void main(String[] args) {

        Set s=new HashSet<>();
        s.add(567);
        s.add(789);    //set store data in hashset format
        s.add(356);
        s.add(567);           //set cannot store duplicate value
        s.add(null);         //set can store only one null value
        s.add(null);

        System.out.println(s);

        Iterator iterator= s.iterator();  //iteration is the repetition process in order of sequence
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
