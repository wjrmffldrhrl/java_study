import java.util.regex.Pattern;

public class EqualsTest {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("[a-c]");
        Pattern p2 = Pattern.compile("a|b|c");
        Pattern p3 = Pattern.compile("[a-c]");


        
        
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.pattern());
        System.out.println(p1.pattern().equals(p2.pattern()));
        System.out.println(p1.pattern().equals(p3.pattern()));
        
    }
}