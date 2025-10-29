import java.util.Scanner;
public class GreatestCommonWish {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập số a: ");
        int a = input.nextInt();

        System.out.println("Nhập số b: ");
        int b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("Không có ước chung lớn nhất");
        } else {
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            System.out.println("Ước chung lớn nhất là: " + a);
        }
    }
}
