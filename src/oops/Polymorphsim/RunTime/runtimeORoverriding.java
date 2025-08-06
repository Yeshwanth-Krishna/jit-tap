package oops.Polymorphsim.RunTime;
class Mom {
    void Cook(){
        System.out.println("Indian Food");
    }
}
class Daughter extends Mom{
    void Cook(){
        System.out.println("Chinese");
    }
}
class DriverCode{
    public static void main(String[] args) {
        Mom m = new Mom();
        Daughter d = new Daughter();
        m.Cook();
        d.Cook();
    }
}

