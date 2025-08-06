package oops.Inheritance;

class  A1{
void add(){
    /**
     * This is parent class
     */
    return;
}
}
class B1 extends A1{
    void sub(){
        return;
    }
}
class C extends B1{
    void mul(){
        return;
    }
}
class DriverCode{
    public static void main(String[] args) {
        A objA=new A();
        B objB=new B();
        C objC=new C();
        objA.add();
        objB.add();
        objB.sub();
        objC.add();
        objC.sub();
        objC.mul();
    }
}