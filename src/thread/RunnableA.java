package thread;

public class RunnableA implements Runnable{
    @Override
    public void run() {
        for (int i = 26; i < 51; i++) {
            System.out.println("线程B，打印："+i*2);
        }
    }
}
