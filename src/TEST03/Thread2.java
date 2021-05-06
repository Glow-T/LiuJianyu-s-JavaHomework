package TEST03;

public class Thread2 implements Runnable {
    @Override
    public void run() {
        while(Word.i < 26) {
            Word.print();
        }
    }

}
