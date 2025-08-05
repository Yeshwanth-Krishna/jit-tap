package basic;

import java.util.Scanner;

public class mod3_program1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pa=sc.nextFloat();
        float ca=sc.nextFloat();
        float changeIn=((ca-pa)/pa)*100;
        if(changeIn>10){
            System.out.println("Buy");
        } else if(changeIn>=5 && changeIn<=10) {
            System.out.println("Hold");
        } else if(changeIn<-5) {
            System.out.println("Sell");
        } else{
            System.out.println("Hold");
        }
    }
}
