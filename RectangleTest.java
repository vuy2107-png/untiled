import java.util.Scanner;

public class RectangleTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();

        // Tạo đối tượng MyRectangle
        MyRectangle rectangle = new MyRectangle(width, height);

        // Gọi các phương thức
        System.out.println("\nYour Rectangle: " + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }
}

// ========================
// LỚP HÌNH CHỮ NHẬT (MyRectangle)
// ========================
class MyRectangle {
    double width;
    double height;

    public MyRectangle() {
    }

    public MyRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "MyRectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
