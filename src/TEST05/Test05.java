package TEST05;

import java.io.File;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student zhangsan = new Student();
        Student lisi = new Student();
        Student wangwu = new Student();

        System.out.println("请输入学生姓名：");
        zhangsan.name = sc.next();
        System.out.println("请输入学生语文成绩：");
        zhangsan.Chinese = sc.nextInt();
        System.out.println("请输入学生数学成绩：");
        zhangsan.Math = sc.nextInt();
        System.out.println("请输入学生英语成绩：");
        zhangsan.English = sc.nextInt();

        System.out.println("请输入学生姓名：");
        lisi.name = sc.next();
        System.out.println("请输入学生语文成绩：");
        lisi.Chinese = sc.nextInt();
        System.out.println("请输入学生数学成绩：");
        lisi.Math = sc.nextInt();
        System.out.println("请输入学生英语成绩：");
        lisi.English = sc.nextInt();

        System.out.println("请输入学生姓名：");
        wangwu.name = sc.next();
        System.out.println("请输入学生语文成绩：");
        wangwu.Chinese = sc.nextInt();
        System.out.println("请输入学生数学成绩：");
        wangwu.Math = sc.nextInt();
        System.out.println("请输入学生英语成绩：");
        wangwu.English = sc.nextInt();
        File file = new File("C:\\stud.txt");

    }
}
