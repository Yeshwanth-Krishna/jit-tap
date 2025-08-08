package oops;

class Person {
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Student extends Person{
    String university;
    Student (String name,int age,String university){
        super(name,age);
        this.university=university;
    }
}
class Graduate extends Student{
    int GraduateYear;
    Graduate(String name,int age,String university,int GraduateYear){
        super(name,age,university);
        this.GraduateYear=GraduateYear;
    }
}
