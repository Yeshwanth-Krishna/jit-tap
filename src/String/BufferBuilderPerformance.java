package String;

public class BufferBuilderPerformance {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        StringBuilder sbl = new StringBuilder("Placement");
        for (int i=0; i<100000 ; i++){
            sbl.append("Training");
        }
        System.out.println("Time taken by SBL: "+(System.currentTimeMillis()-startTime)+"ms");
        long startTime1 = System.nanoTime();
        StringBuffer sbf = new StringBuffer("Placement");
        for (int i=0; i<100000 ; i++){
            sbl.append("Training");
        }
        System.out.println("Time taken by SBF: "+(System.currentTimeMillis()-startTime1)+"ms");
    }
}
