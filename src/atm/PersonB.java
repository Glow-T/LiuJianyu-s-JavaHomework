package atm;

public class PersonB extends Thread{
    @Override
    public synchronized void start() {
        Bank bank = new Bank();
        String mode = "ATM";
        while(true){
            bank.takeMoney(mode);
        }

    }
}