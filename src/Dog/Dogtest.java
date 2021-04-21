package Dog;

import java.util.Scanner;

public class Dogtest {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入新增小狗的名字：");
        dog.setName(sc.next());
        System.out.print("请选择小狗的性别：（1、公仔 2、母妹）");
        dog.setSex(sc.nextInt());
        System.out.print("请选择小狗的年龄：（1~20之间）");
        dog.setAge(sc.nextInt());
        System.out.print("请选择小狗的健康值：（1~100之间）");
        dog.setHealth(sc.nextInt());
        System.out.println("小狗的基本信息：");
        System.out.println("宠物的名字：" + dog.getName() + "，性别是：" + dog.getSex() + "，年龄是：" + dog.getAge() + "，健康值是：" + dog.getHealth());
    }
}
