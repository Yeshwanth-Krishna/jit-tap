package oops.Inheritance.SuperKeyword;
//when there is a collision b/w the two constructors in  person and student we use super keyword
class Person{
    String fname;
    String lname;
    Person(String fname,String lname){
        this.fname=fname;
        this.lname=lname;
    }
}
class Student extends Person{
    int rollno;
    Student(String fname,String lname,int rollno){
        super(fname,lname);//this will call the constructor of the parent class(person)
        this.rollno=rollno;
    }
}
class DriverCode{
    public static void main(String[] args) {
        Student s1=new Student("Aman","Sharma",1);
        System.out.println(s1.fname+" "+s1.lname+" "+s1.rollno);
    }
}
