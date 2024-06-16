public class Pattern5 {
    public static void main(String[] args) {
        printPattern5(5);
    }
    static void printPattern5(int n){
        //System.out.println(mid);
        for (int i = 1; i <=2*n-1; i++) {
            int totalColumns=i>n?2*n-i:i;
            int totalSpaces=n-totalColumns;
            for (int j = 1; j <=totalSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=totalColumns; j++) {
                System.out.print("* ");
            }
            System.out.println();
            }
        }
}
