package basic;

import java.util.Scanner;

public class mod2_program4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int ans=(d/10)+(d%10);
        System.out.println(ans);
    }
}
