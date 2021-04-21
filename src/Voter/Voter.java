package Voter;

public class Voter {
    public String name;
    static public int num;
    public void vote (){
        if(num <= 10){
            System.out.println(this.name + "，感谢您的投票。");
            num++;
        }else{
            System.out.println("投票活动已经结束，不能投票");
        }

    }

}
