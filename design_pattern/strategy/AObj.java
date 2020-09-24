public class AObj {

    Ainterface ainterface;

    public AObj() {
        this.ainterface = new AinterfaceImpl();
    }


    // ex Delegate
    public void funcAA() {

        ainterface.funcA();
        ainterface.funcA();


        // System.out.println("AAA");
        // System.out.println("AAA");

        // deligate
    }
}
