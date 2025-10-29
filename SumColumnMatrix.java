//import java.util.Scanner;
//
//public class SumColumnMatrix {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        // Bước 1: Khởi tạo nhanh mảng 2 chiều (ma trận)
//        double[][] matrix = {
//                {1.5, 2.5, 3.5},
//                {4.0, 5.0, 6.0},
//                {7.2, 8.3, 9.4}
//        };
//
//        // In ra ma trận
//        System.out.println("Ma trận có sẵn là:");
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        // Hỏi người dùng muốn tính tổng của cột nào
//        System.out.print("\nNhập chỉ số cột muốn tính tổng (0 - " + (matrix[0].length - 1) + "): ");
//        int col = input.nextInt();
//
//        // Kiểm tra cột hợp lệ
//        if (col < 0 || col >= matrix[0].length) {
//            System.out.println(" Cột không hợp lệ!");
//            return;
//        }
//
//        // Tính tổng của cột
//        double sum = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            sum += matrix[i][col];
//        }
//
//        // In kết quả
//        System.out.println(" Tổng các phần tử ở cột " + col + " là: " + sum);
//    }
//}
import java.util.Scanner;

public class SumColumnMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Nhập kích thước ma trận
        System.out.print("Nhập số hàng: ");
        int rows = input.nextInt();
        System.out.print("Nhập số cột: ");
        int cols = input.nextInt();

        // Khởi tạo ma trận
        double[][] matrix = new double[rows][cols];

        // Nhập các phần tử của ma trận
    }
}