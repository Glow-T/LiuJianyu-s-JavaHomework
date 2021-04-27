package cpu;

import java.util.Scanner;

public class CPUImpl implements CPU,EMS,HardDisk{
    Scanner sc = new Scanner(System.in);
    public String CPUBrand;
    public Float Frequency;
    public String EMSType;
    public int Size;
    public int Capacity;

    @Override
    public String getCPUBrand() {
        return CPUBrand = "Intel";
    }

    @Override
    public Float getFrequency() {
        return Frequency = 3.8f;
    }

    @Override
    public String getEMSType() {
        return EMSType = "DDR4";
    }

    @Override
    public int getSize() {
        return Size = 4;
    }

    @Override
    public int getCapacity() {
        return Capacity = 3000;
    }
}
