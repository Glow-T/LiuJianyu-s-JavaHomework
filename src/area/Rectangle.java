package area;

public class Rectangle extends Graph {
    private float a;
    private float b;
    public Rectangle() {

    }

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    @Override
    protected final void calculatedArea() {
        float area;
        area = a * b;
        System.out.println("长方形的面积是："+area);
    }
}
