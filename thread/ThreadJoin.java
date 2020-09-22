public class ThreadJoin {
    public static void main(String[] args) {
        ThreadEx gc = new ThreadEx();
        gc.setDaemon(true);
        gc.start();

        int requiredMemory = 0;

        for(int i = 0 ; i < 20 ; i++) {
            requiredMemory = (int) (Math.random() * 10) * 20;

            if(gc.freeMemory() < requiredMemory
                || gc.freeMemory() < gc.totalMemory() * 0.4) {
                    gc.interrupt(); // gc Thread의 Thread.sleep()에 interrupt를 건다.

                    try {
                        gc.join(100); // gc Thread가 동작할 시간을 제공해준다.
                    } catch (Exception e) {
                        //TODO: handle exception
                    }
            }

            gc.usedMemory += requiredMemory;
            System.out.println("usedMemory : " + gc.usedMemory);
        }
        
    }


}

class ThreadEx extends Thread {
    final static int MAX_MEMORY = 1000;

    int usedMemory = 0;

    public void run() {
        while (true) {
            try {
                Thread.sleep(10 * 1000);
            } catch(InterruptedException e) { // interrupt 발생 시
                System.out.println("Awaken by interrupt()");
            }

            gc();
        }
    }

    public void gc() {
        usedMemory -= 300;
        if(usedMemory < 0 ) 
            usedMemory = 0;    
    }
    public int totalMemory() {
        return MAX_MEMORY;
    }
    public int freeMemory() {
        return MAX_MEMORY - usedMemory;
    }

}