package TEST03;

public class Thread1 extends Thread {
    @Override
    public void run() {
        while(Word.i < 26) {
            Word.print();
        }
    }
}
