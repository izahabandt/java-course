public class Triangle extends Shape {
    private double baseA;
    private double baseB;
    private double baseC;
    private double height;
    private boolean isUsingHeron;

    public Triangle(double baseA, double height) {
        this.baseA = baseA < 0 ? 0 : baseA;
        this.height = height < 0 ? 0 : height;
        this.isUsingHeron = false;
    }

    public Triangle(double baseA, double baseB, double baseC) {
        this.baseA = baseA < 0 ? 0 : baseA;
        this.baseB = baseB < 0 ? 0 : baseB;
        this.baseC = baseC < 0 ? 0 : baseC;
        this.isUsingHeron = true;
    }

    public double getBaseA() {
        return baseA;
    }

    public double getBaseB() {
        return baseB;
    }

    public double getBaseC() {
        return baseC;
    }

    public double getHeight() {
        return height;
    }

    public void setBaseA(double baseA) {
        this.baseA = baseA;
    }

    public void setBaseB(double baseB) {
        this.baseB = baseB;
    }

    public void setBaseC(double baseC) {
        this.baseC = baseC;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        if (isUsingHeron) {
            double p = (baseA + baseB + baseC) / 2;
            return Math.sqrt(p * (p - baseA) * (p - baseB) * (p - baseC));
        } else {
            return (baseA * height) / 2;
        }
    }

}
