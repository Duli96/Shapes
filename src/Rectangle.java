public class Rectangle implements IShape {

    private final float width;
    private final float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public float calculateArea() {
        return this.height * this.width;
    }

    @Override
    public float calculatePerimeter() {
        return 2 * (height + width);
    }
}
