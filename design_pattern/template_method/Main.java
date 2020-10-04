public class Main {
    public static void main(String[] args) {
        AbstGameConnectionHelper helper = new DefaultGameConnectionHelper();

        helper.requestConnection("id password info");
    }
}
