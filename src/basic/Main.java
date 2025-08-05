package basic;

public class Main {
    static void print(){
        System.out.println("Hello world!");
    }
    public static void main(String[] args)
    {
        // if static is not used basic.Main m = new basic.Main();
        print();
        // if static is used basic.Main.print();
    }
}