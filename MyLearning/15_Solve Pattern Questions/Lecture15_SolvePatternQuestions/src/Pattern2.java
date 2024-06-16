public class Pattern2 {
    public static void main(String[] args) {
        printPattern1(5);
    }
    static void printPattern1(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
