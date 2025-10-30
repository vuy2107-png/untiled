import java.util.Scanner;

public class QuadraticTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();

        QuadraticEquation eq = new QuadraticEquation(a, b, c);

        // In ra phương trình
        System.out.println("\nPhương trình: " + a + "x² + " + b + "x + " + c + " = 0");

        double delta = eq.getDiscriminant();

        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt:");
            System.out.println("x₁ = " + eq.getRoot1());
            System.out.println("x₂ = " + eq.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép:");
            System.out.println("x = " + eq.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}

// ==============================
// LỚP PHƯƠNG TRÌNH BẬC HAI
// ==============================
class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    // Constructor
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getter
    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }

    // Tính delta (b^2 - 4ac)
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    // Tính nghiệm thứ nhất
    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b + Math.sqrt(delta)) / (2 * a);
        } else {
            return Double.NaN; // Không có nghiệm thực
        }
    }

    // Tính nghiệm thứ hai
    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b - Math.sqrt(delta)) / (2 * a);
        } else {
            return Double.NaN;
        }
    }
}
