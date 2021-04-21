package Voter;

public class Votertest {
    public static void main(String[] args) {
        Voter voter1 = new Voter();
        voter1.name = "张三";
        voter1.vote();
        Voter voter2 = new Voter();
        voter2.name = "李四";
        voter2.vote();
        Voter voter3 = new Voter();
        voter3.name = "王五";
        voter3.vote();
        while(Voter.num <= 10){
            Voter voter = new Voter();
            voter.name = "内部选民"+ Voter.num;
            voter.vote();
        }
        Voter voter11 = new Voter();
        voter11.name = "内部选民11";
        voter11.vote();

    }
}
