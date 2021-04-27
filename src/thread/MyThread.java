package thread;

/**
 * @author Administrator
 */
public class MyThread extends Thread{
    @Override
    public synchronized void start() {
        super.start();
        for (int i = 1; i < 26; i++) {
            System.out.println("线程A，打印："+i*2);
        }

    }
}
