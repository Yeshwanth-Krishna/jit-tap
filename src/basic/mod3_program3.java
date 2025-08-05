package basic;

import java.util.Scanner;
import java.lang.Math;

public class mod3_program3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double v1=sc.nextDouble();
        double v2=sc.nextDouble();
        double t2=2.0*n/v2;
        double t1=(Math.sqrt(2)*n)/v1;
        if(t1<t2)
        System.out.println("stairs");
        else{
            System.out.println("elevator");
        }
    }
}
