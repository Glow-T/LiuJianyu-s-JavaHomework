package atm;

public class PersonA extends Thread{
    @Override
    public synchronized void start() {
        Bank bank = new Bank();
        String mode = "Counter";
        while(true){
            bank.takeMoney(mode);
        }

    }
}
