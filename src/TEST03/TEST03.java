package TEST03;

public class TEST03 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread t2 = new Thread(new Thread2());
        t1.start();
        t2.start();
    }
}
