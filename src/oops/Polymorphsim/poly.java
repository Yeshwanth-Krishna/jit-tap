package oops.Polymorphsim;
//not an actual polymorphism
class India{
    void Capital() {
        System.out.println("New Delhi");
    }
}
class USA{
    void Capital(){
        System.out.println("WTDC");
    }
}
class DriverCode{
    public static void main(String[] args) {
        India i=new India();
        USA u=new USA();
        i.Capital();
        u.Capital();
    }
}

