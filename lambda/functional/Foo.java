package functional;

public class Foo {
    public static void main(String[] args) {
        
        
        // // before the java 1.8 used anonymous class
        // RunSomething runSomething = new RunSomething() {
		// 	@Override
		// 	public void doIt() {
        // 		// TODO Auto-generated method stub
        //      // System.out.println("hello");        
		// 	}
        // }

        // lambda function
        // this is special object
        // 함수가 함수를 리턴하거나 매개변수로 받을 수 있다.
        RunSomething runSomething = () -> System.out.println("hello");
        runSomething.doIt();

        /**
         * 항상 같은 값이 나와야 함수형 프로그래밍이라고 할 수 있다.
         * 만약 함수 내부에서 외부의 값을 참조해서 사용하는 경우 이것을 보장할 수 없다.
         * 또는 외부의 값을 변경하려고 할 때 이것을 보장할 수 없다.
         */
        RunReturnSomething runReturnSomething = (number) ->  number + 2;

        System.out.println(runReturnSomething.doIt(10));
        System.out.println(runReturnSomething.doIt(10));
        System.out.println(runReturnSomething.doIt(10));
        System.out.println(runReturnSomething.doIt(10));
    }
}
