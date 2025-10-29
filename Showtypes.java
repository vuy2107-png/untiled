import java.util.Scanner;
public class Showtypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Hình chữ nhật
        System.out.println("Nhập chiều dài: ");
        int width = input.nextInt();
        System.out.println("Nhập chiều rộng: ");
        int heigth = input.nextInt();

        for (int i = 0; i < heigth; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Hình tam giác vuông, có cạnh góc vuông ở botton-left
        System.out.println("Nhập cạnh góc vuông: ");
        int squaredge = input.nextInt();

        for (int i = 1; i <= squaredge; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Hình tam giác vuông, có cạnh góc vuông ở top-left
        System.out.println("Nhập cạnh góc vuông thứ 2: ");
        int edge = input.nextInt();

        for (int i = edge; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
