package basic;

import java.util.Scanner;

public class mod4_program3 {
    public static void main(String[] args) {
        int ans=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0) {
            int temp = n % 10;
            if(n<2){
                return;
            }
            else if (temp % 2 == 0) {
                ans = ans + temp;
            }
            n = n / 10;
        }
        System.out.println(ans);

    }
}
