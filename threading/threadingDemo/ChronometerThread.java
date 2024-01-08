public class ChronometerThread implements Runnable {
    private Thread thread;
    private String threadName;

    public ChronometerThread(String threadName) {
        System.out.println("The thread is being constructed: " + threadName);
        this.threadName = threadName;
    }

    public void run() {
        System.out.println("The thread is being run: " + threadName);

        try {
            for (int i = 1; i < 10; i++) {
                System.out.println(threadName + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("The thread was ended: " + threadName);
        }
    }

    public void start() {
        System.out.println("Thread object is being constructed.");
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
