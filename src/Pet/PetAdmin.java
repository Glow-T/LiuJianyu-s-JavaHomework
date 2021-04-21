package Pet;

import java.util.Scanner;

public class PetAdmin {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "公主";
        cat.sex = "雌性";
        cat.food = "鱼";
        Dog dog = new Dog();
        dog.name = "王子";
        dog.sex = "雄性";
        dog.food = "骨头";
        Scanner sc = new Scanner(System.in);
        System.out.print("请选择宠物 1、狗 2、猫");
        int sex = sc.nextInt();
        if (sex == 1) {
            System.out.println(dog.name + "，来吃" + dog.food);
        } else {
            if (sex == 2) {
                System.out.println(cat.name + "，来吃" + cat.food);
            }
        }


    }
}
