package javaPractice.exception;

public class Student {
    private String name;
    private int roll_no;
    private Address address;

    public Student(String name,int roll_no,Address address)
    {
        this.name=name;
        this.roll_no=roll_no;
        this.address=address;
    }
    void display()
    {
        System.out.println("the student name is "+name);
        System.out.println("the student roll number is "+roll_no);
        System.out.println("the student address is "+address.getState()+" "+address.getCity()+" "+address.getPlot());
    }


    public static void main(String[] args) {

        Address address1=new Address("maharashtra,","nagpur,",575);
        Student s =new Student("Amisha",455,address1);
        s.display();
    }
}
