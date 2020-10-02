package functional;

@FunctionalInterface
public interface RunSomething {
    
    // only one abstract method
    void doIt();

    // not abstract method can use
    static void printName() {
        System.out.println("hello");
    }
}
