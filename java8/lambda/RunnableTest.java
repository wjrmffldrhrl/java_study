class RunnableTest {
    public static void main(String[] args) {
        new Thread(() -> {
            for(int i = 0 ; i < 30 ; i++) System.out.println("hello");
        }).start();
        new Thread(() -> {
            for(int i = 0 ; i < 30 ; i++) System.out.println("hi");
        }).start();
    }
}