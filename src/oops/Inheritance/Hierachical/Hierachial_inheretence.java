package oops.Inheritance.Hierachical;

class A1{
    void add(){
        System.out.println("This is parent class");
    }
}
class B1 extends A1{
    void sub() {
        System.out.println("This is child class");
    }
}
class C1 extends A1{
    void mul(){
        System.out.println("This is child class");
    }
}
class DriverCode{
    public static void main(String[] args) {
        A1 objA=new A1();
        B1 objB=new B1();
        C1 objC=new C1();
        objA.add();
        objB.add();
        objB.sub();
        objC.add();
        objC.mul();
    }
}