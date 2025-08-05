package basic;

import java.util.Scanner;

public class mod4_program1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int s=n*n;
        String s1=Integer.toString(s);
        for(int i=1;i<s1.length();i++){
            String left=s1.substring(0,i);
            String right=s1.substring(i);
            int left1=Integer.parseInt(left);
            int right1=Integer.parseInt(right);
            if(right1!=0 &&left1+right1==n){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
