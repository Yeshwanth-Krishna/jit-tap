import java.util.Scanner;

public class mod2_program2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sp= sc.nextInt();
        int cp=sc.nextInt();
        System.out.println("Profit="+(n*(sp-cp)-100));
    }
}
