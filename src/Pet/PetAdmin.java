package Pet;

import java.util.Scanner;

public class PetAdmin {
    public static void main(String[] args) {
        Pet2 cat = new Pet2();
        cat.name = "公主";
        cat.sex = "雌性";
        cat.food = "鱼";
        Pet2 dog = new Pet2();
        dog.name = "王子";
        dog.sex = "雄性";
        dog.food = "骨头";
        Scanner sc = new Scanner(System.in);
        System.out.print("请选择宠物 1、狗 2、猫");
        int sex = sc.nextInt();
        if (sex == 1) {
            dog.chose();
        } else {
            if (sex == 2) {
                cat.chose();
            }
        }


    }
}
