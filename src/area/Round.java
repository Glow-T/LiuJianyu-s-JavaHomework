package area;

public class Round extends Graph {
    final float pi = 3.14f;
    float r;
    public Round() {

    }
    public Round(float r) {
        this.r = r;
    }

    public float getPi() {
        return pi;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    @Override
    protected void calculatedArea() {
        float area;
        area = pi * r *r;
        System.out.println("圆形的面积是："+area);
    }
}
