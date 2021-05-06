package TEST02;

import java.util.Scanner;

public class TEST02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] s1 = s.split("");
            for(int i = 0; i < s1.length; i++){
                System.out.print(s1[i]+" ");
            }
        }
    }
}
