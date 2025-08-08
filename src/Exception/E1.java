package Exception;

public class E1 {
    public static void main(String[] args) {
        int i,j,k=0;
        try {
            i = 10;
            j = 0;
            k = i / j;
            System.out.println(k);
        }
        catch (ArithmeticException e){
            System.out.println(e);
            e.printStackTrace();
        }
        finally{

        }
    }
}
