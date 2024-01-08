public class Main {
    public static void main(String[] args) {
        ChronometerThread chronometerThread1 = new ChronometerThread("thread1");
        ChronometerThread chronometerThread2 = new ChronometerThread("thread2");
        ChronometerThread chronometerThread3 = new ChronometerThread("thread3");
        
        chronometerThread1.start();
        chronometerThread2.start();
        chronometerThread3.start();
    }
}
