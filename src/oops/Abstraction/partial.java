package oops.Abstraction;

abstract class Animal {
    abstract void eat();  // any hidden method will not have a body This body will be written in the child class
    void run(){


    }
}
class Cat extends Animal{
    void eat(){
        //Overriding
    }
}
