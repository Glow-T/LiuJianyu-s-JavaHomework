package thread;

/**
 * @author Administrator
 */
public class Test {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
        RunnableA threadB = new RunnableA();
        threadB.run();
    }
}
