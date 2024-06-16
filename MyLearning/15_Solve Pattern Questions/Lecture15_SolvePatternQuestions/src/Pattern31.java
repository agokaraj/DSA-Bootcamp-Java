public class Pattern31 {
    public static void main(String[] args) {
        runPattern31(4);
    }

    private static void runPattern31(int n) {
        int original_num=n+1;
        for (int row = 1; row <=2*n-1; row++) {
            for (int col = 1; col <=2*n-1; col++) {
             int temp=original_num-Math.min(Math.min(row,col), Math.min(2*n-row,2*n-col));
                System.out.print(temp+" ");   
            }
            System.out.println();
        }
    }
}
