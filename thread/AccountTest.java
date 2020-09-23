public class AccountTest {
    public static void main(String[] args) {
        Runnable r = new RunnableEx21();
        new Thread(r).start();
        new Thread(r).start();
    }
}

class Account {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

//    public void withdraw(int money) {
//        if(balance >= money) {
//            try { Thread.sleep(1000);} catch (InterruptedException ex) {}
//            balance -= money;
//        }
//
//    }
    public synchronized void withdraw(int money) {
        if(balance >= money) {
            try { Thread.sleep(1000);} catch (InterruptedException ex) {}
            balance -= money;
        }

    }
}

class RunnableEx21 implements Runnable {

    Account acc = new Account();

    @Override
    public void run() {
        while(acc.getBalance() > 0) {
            int money = (int) (Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            System.out.println("balance : " + acc.getBalance());

        }
    }
}
