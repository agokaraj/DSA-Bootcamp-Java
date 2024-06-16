public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            builder.append(ch);
            //in this scenario, we not building 
            //a new object for every iteration
        }
        System.out.println(builder);
        String finalString=builder.toString();
        System.out.println(finalString);
    }
}
