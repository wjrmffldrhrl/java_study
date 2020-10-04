public class DaemonThread implements Runnable{
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread(new DaemonThread());
        t.setDaemon(true);
        t.start();

        for(int i = 1 ; i <= 10 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //TODO: handle exception
                
            }
            System.out.println(i);

            if(i == 5) {
                autoSave = true;
            }
        }

        System.out.println("System out");
    }    
    
    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(true) {
            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                //TODO: handle exception

            }

            if(autoSave) {
                autoSave();
            }
        }
    }    
    
    public void autoSave() {
        System.out.println("save!");
    }
}
