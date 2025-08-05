package oops;

public class Car {
    String brandName;
    int manuDate;
    Car(String bName,int mDate){
       brandName=bName;//this.brandName=BrandName;
       manuDate=mDate;//this.manuDate=manuDate;
    }
    public void printDetails(){
        System.out.println("Car Details:"+brandName+" "+manuDate);
    }
    public static void main(String[] args) {
        Car c1=new Car("BMW",2019);
        c1.printDetails();
    }
}
