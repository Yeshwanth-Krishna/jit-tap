package oops.Encapsulation;

public class Student {
    private String name;
    private int usn;
    Student(String n,int u){
        name=n;
        usn=u;
    }
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }

    public int getUsn() {
        return usn;
    }

    public void setUsn(int usn) {
        this.usn = usn;
    }

    public Student(int usn) {
        this.usn = usn;
    }
}
class DiverCode{
    public static void main(String[] args) {
        Student s1=new Student("hi",3);
     //   s1.setName("go");
        System.out.println(s1.getName());
        System.out.println(s1.getUsn());
    }
}
