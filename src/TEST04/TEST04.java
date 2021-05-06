package TEST04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TEST04 {
    public static void main(String[] args) {
        ArrayList<Book> book = new ArrayList<>();
        Book liubei = new Book("三国演义","刘备");
        Book caocao = new Book("三国演义","曹操");
        Book guojing = new Book("射雕英雄传","郭靖");
        Book huangrong = new Book("射雕英雄传","黄蓉");
        Book zhangwuji = new Book("倚天屠龙记","张无忌");
        Book zhaomin = new Book("倚天屠龙记","赵敏");
        book.add(liubei);
        book.add(caocao);
        book.add(guojing);
        book.add(huangrong);
        book.add(zhangwuji);
        book.add(zhaomin);

        for (Book book1 : book) {
            System.out.println(book1.name + " " +book1.people);
        }
        Scanner sc =  new Scanner(System.in);
        System.out.println("请输入名著的名字：");
        String s = sc.nextLine();
        if(s.equals(liubei.name)){
            System.out.println(book.indexOf(liubei));
        }else if(s.equals(guojing.name)){
            System.out.println(book.indexOf(guojing));
        }else if(s.equals(zhangwuji.name)){
            System.out.println(book.indexOf(zhangwuji));
        }else{
            System.out.println("名著不存在");
        }
        System.out.println("请输入人物名字：");
        s = sc.nextLine();
        if(s.equals(liubei.people)){
            System.out.println(liubei.name);
        }else if(s.equals(caocao.people)){
            System.out.println(caocao.name);
        }else if(s.equals(guojing.people)){
            System.out.println(guojing.name);
        }else if(s.equals(huangrong.people)){
            System.out.println(huangrong.name);
        }else if (s.equals(zhangwuji.people)){
            System.out.println(zhangwuji.name);
        }else if(s.equals(zhaomin.people)){
            System.out.println(zhaomin.name);
        }else{
            System.out.println("人物不存在");
        }






    }
}
