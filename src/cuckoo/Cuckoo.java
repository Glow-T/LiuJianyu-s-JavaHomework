package cuckoo;

public class Cuckoo extends Bird{

    @Override
    public void Fly() {
        System.out.println("布谷鸟起飞！");
    }

    @Override
    public void Cry() {
        System.out.println("布谷鸟大叫。");
    }

    @Override
    public void Sing() {
        System.out.println("布谷鸟唱歌：布谷布谷~");
    }
}
