package atm;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    private int money = 8765;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    private void Counter(){
        if(money >= 100){
            money = money -100;
            System.out.println(Thread.currentThread().getName()+"通过柜台提取了100元钱,余额为："+ money);
        }else{
            System.out.println("当前余额："+money+"，余额不足，无法取钱");
        }
    }
    private void ATM(){
        if(money >= 200){
            money = money -200;
            System.out.println(Thread.currentThread().getName()+"通过ATM提取了200元钱,余额为："+ money);
        }else{
            System.out.println("当前余额："+money+"，余额不足，无法取钱");
        }
    }
    public synchronized void takeMoney(String mode){
        if(money > 100){
            if (mode.equals("Counter")) {
                this.Counter();
            }
            if (mode.equals("ATM")) {
                this.ATM();
            }
        }
    }
}
