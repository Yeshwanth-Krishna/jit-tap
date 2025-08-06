package oops.Inheritance;
// Single Inheritance
class A {
    void add(){
        /**
         * This is parent class
         */
        return;
    }
}
class B extends A{
    void sub(){
        return;
    }
}
class Driver{
    public static void main(String[] args) {
        A objA=new A();
        B objB=new B();
        objA.add();
        objB.add();
        objB.sub();
    }
}
