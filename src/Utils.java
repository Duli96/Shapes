public class Utils {

    private Utils(){

    }

    public static void printResults(IShape shape){
            System.out.println();
            System.out.print("Area: ");
            System.out.printf("%.2f", shape.calculateArea());
            System.out.println();
            System.out.print("Perimeter: ");
            System.out.printf("%.2f", shape.calculatePerimeter());
    }
}
