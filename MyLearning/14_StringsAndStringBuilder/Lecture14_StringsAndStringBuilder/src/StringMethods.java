import java.util.Arrays;
public class StringMethods {
    public static void main(String[] args) {
        String name="hello world";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('o'));
        System.out.println("   hello   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
