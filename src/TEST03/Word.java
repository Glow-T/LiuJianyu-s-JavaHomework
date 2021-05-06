package TEST03;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Word {
    static char a = 'A';
    static int i = 1;
    public static synchronized void print(){

        try {
                System.out.println(Thread.currentThread().getName()+a);
                a++;
                i++;
                Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
