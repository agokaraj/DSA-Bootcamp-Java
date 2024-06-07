public class App {
    public static void main(String[] args) throws Exception {
        char[] chr={'c','f','j'};
        char target='j';
        char result=searchSmallestLetterGreaterThanTarget(chr,target);
        System.out.println(result);
    }

    private static char searchSmallestLetterGreaterThanTarget(char[] chr, char target) {
        int start=0; int end=chr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(chr[mid]>target){
                end=mid-1;
            }
            else if(chr[mid]<=target){
                start=mid+1;
            }
        }
        return chr[start%(chr.length)];
    }
}
