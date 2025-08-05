package basic;

import java.util.Scanner;

public class mod3_program4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=((n-1)%8)+1;
        switch(x){
            case 1:
                System.out.println(n+3+"LB");
                break;
            case 2:
                System.out.println(n+3+"MB");
                break;
            case 3:
                System.out.println(n+3+"HB");
                break;
            case 4:
                System.out.println(n-3+"LB");
                break;
            case 5:
                System.out.println(n-3+"MB");
                break;
            case 6:
                System.out.println(n-3+"HB");
                break;
            case 7:
                System.out.println(n+1+"SU");
            case 8:
                System.out.println(n-1+"SL");


        }
    }
}
