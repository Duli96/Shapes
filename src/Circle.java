public class Circle implements IShape {

    private static final float PI = (float) Math.PI;
    private final float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public float calculatePerimeter() {
        return 2 * PI * radius;
    }
}
