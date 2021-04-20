package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void addInt(int a, int b) {
        System.out.println(a + b);
    }

    public static void addFloat(float d, float e, float f) {
        System.out.println(d + e + f);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数a,b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        addInt(a, b);
        System.out.println("请输入浮点数d,e,f:");
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        float f = sc.nextFloat();
        addFloat(d, e, f);
    }
}
