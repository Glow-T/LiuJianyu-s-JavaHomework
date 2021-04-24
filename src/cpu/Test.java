package cpu;

public class Test {
    public static void main(String[] args) {
        CPUImpl test = new CPUImpl();
        test.getCapacity();
        test.getCPUBrand();
        test.getEMSType();
        test.getFrequency();
        test.getSize();
        System.out.println("CPU的品牌是："+test.CPUBrand+"，主频是："+test.Frequency+"GHz。");
        System.out.println("硬盘的容量是："+test.Capacity+"GB。");
        System.out.println("内存的容量是："+test.Size+"GB。");

    }
}
