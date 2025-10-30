public class TestCircle {
    public static void main(String[] args) {
        // Tạo đối tượng Circle mặc định
        Circle c1 = new Circle();
        System.out.println("Bán kính mặc định: " + c1.getRadius());
        System.out.println("Diện tích mặc định: " + c1.getArea());

        // Tạo đối tượng Circle có bán kính được chỉ định
        Circle c2 = new Circle(2.5);
        System.out.println("\nBán kính c2: " + c2.getRadius());
        System.out.println("Diện tích c2: " + c2.getArea());
    }
}

// ========================
// LỚP CIRCLE
// ========================
class Circle {
    // Thuộc tính private
    private double radius = 1.0;
    private String color = "red";

    // Constructor không tham số
    public Circle() {
    }

    // Constructor có tham số
    public Circle(double r) {
        radius = r;
    }

    // Getter cho radius
    public double getRadius() {
        return radius;
    }

    // Tính diện tích hình tròn
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
