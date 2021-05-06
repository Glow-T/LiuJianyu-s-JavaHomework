package TEST05;

import java.io.*;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) throws IOException {
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
        zhangsan.average = (zhangsan.Chinese+zhangsan.Math+zhangsan.English)/3;

        System.out.println("请输入学生姓名：");
        lisi.name = sc.next();
        System.out.println("请输入学生语文成绩：");
        lisi.Chinese = sc.nextInt();
        System.out.println("请输入学生数学成绩：");
        lisi.Math = sc.nextInt();
        System.out.println("请输入学生英语成绩：");
        lisi.English = sc.nextInt();
        lisi.average = (lisi.Chinese+lisi.Math+lisi.English)/3;


        System.out.println("请输入学生姓名：");
        wangwu.name = sc.next();
        System.out.println("请输入学生语文成绩：");
        wangwu.Chinese = sc.nextInt();
        System.out.println("请输入学生数学成绩：");
        wangwu.Math = sc.nextInt();
        System.out.println("请输入学生英语成绩：");
        wangwu.English = sc.nextInt();
        wangwu.average = (wangwu.Chinese+wangwu.Math+wangwu.English)/3;

        File file = new File("C:\\stud.txt");
        FileOutputStream fos1=new FileOutputStream(file);
        OutputStreamWriter dos1=new OutputStreamWriter(fos1);
        dos1.write("姓名："+zhangsan.name+"语文："+zhangsan.Chinese+"数学："+zhangsan.Math+"英语："+zhangsan.English+"平均分："+zhangsan.average);
        dos1.write("姓名："+lisi.name+"语文："+lisi.Chinese+"数学："+lisi.Math+"英语："+lisi.English+"平均分："+lisi.average);
        dos1.write("姓名："+wangwu.name+"语文："+wangwu.Chinese+"数学："+wangwu.Math+"英语："+wangwu.English+"平均分："+wangwu.average);
        dos1.close();

    }
}
