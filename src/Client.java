import java.util.Scanner;

public class Client {
    float height;
    float length;
    float width;
    float radius;
    String shapeName;
    IShape shape;
    Scanner scanner;


    public Client() {
        this.shape = null;
        this.scanner = new Scanner(System.in);
    }

    public void getShapeInput() {
        System.out.println("Please enter a shape (Rectangle, Square, Circle)");
        System.out.print("Shape :");
        shapeName = scanner.nextLine();
        shapeName = shapeName.toLowerCase();

        if (shapeName.equals("rectangle") || shapeName.equals("circle") || shapeName.equals("square")) {
            getShapeProperties();
        } else {
            System.out.println("Please enter a valid shape");
        }
    }

    public void getShapeProperties() {
        System.out.println("Properties :");
        switch (shapeName) {

            case "rectangle" -> {
                System.out.print("Height=");
                height = scanner.nextInt();
                System.out.print("Width=");
                width = scanner.nextInt();
                shape = new Rectangle(width, height);

            }
            case "square" -> {
                System.out.print("Side Length=");
                length = scanner.nextInt();
                shape = new Square(length, length);

            }
            case "circle" -> {
                System.out.print("Radius=");
                radius = scanner.nextInt();
                shape = new Circle(radius);

            }

        }
        printResults();
    }

    public void printResults() {
        if (shape != null) {
            System.out.println();
            System.out.print("Area: ");
            System.out.printf("%.2f", shape.calculateArea());
            System.out.println();
            System.out.print("Perimeter: ");
            System.out.printf("%.2f", shape.calculatePerimeter());

        }
    }


    public static void main(String[] args) {

        Client client = new Client();
        client.getShapeInput();

    }
}
