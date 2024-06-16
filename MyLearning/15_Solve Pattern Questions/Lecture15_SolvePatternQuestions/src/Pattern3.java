public class Pattern3 {
    public static void main(String[] args) {
        printPattern1(5);
    }
    static void printPattern1(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = n+1-i; j>=1 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
