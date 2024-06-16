public class Pattern4 {
    public static void main(String[] args) {
        printPattern4(5);
    }
    static void printPattern4(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
