public class Pattern6 {
    public static void main(String[] args) {
        printPatter6_kunal(5);
    }
    static void printPatter6_kunal(int n){
        for (int row = 1; row <=n; row++) {
            for (int space = 0; space < n-row; space++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void printPattern6(int n){
        for (int i = 1; i <=n; i++) {
            int noOfSpaces=n-i;
            /*Print Spaces */
            for (int j = 1; j <=noOfSpaces; j++) {
                System.out.print(" ");
            }
            int temp=i;
            boolean change=false;
            for (int j =1 ; j<=2*i-1; j++) {
                System.out.print(temp);
                if(temp==1){
                    change=true;
                }
                if(!change){
                    temp--;
                }else{
                    temp++;
                }
            }
            System.out.println();
        }
    }
}
