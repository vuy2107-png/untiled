//public class MaxArray {
//    public static void main(String[] args) {
//        int[][] matrix = {
//                {12, 1, -5, -34, 21},
//                {32, 4, -9, 23, -89}
//        };
//        int max = matrix[0][0];
//        int row = 0;
//        int col = 0;
//
//        //Duyệt qua toàn bộ ma trận
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++ ){
//                if (matrix[i][j] > max) {
//                    max = matrix[i][j];
//                    row = i;
//                    col = j;
//                }
//            }
//        }
//
//        System.out.println("Giá trị lớn nhất trong ma trận là: " + max);
//        System.out.println("Tọa độ: hàng " + row + ", cột " + col);
//    }
//}
import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Nhập kích thước ma trận
        System.out.print("Nhập số hàng: ");
        int rows = input.nextInt();
        System.out.print("Nhập số cột: ");
        int cols = input.nextInt();

        // Khởi tạo ma trận
        double[][] matrix = new double[rows][cols];

        // Nhập giá trị cho từng phần tử
        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextDouble();
            }
        }

        // Giả định phần tử đầu tiên là lớn nhất
        double max = matrix[0][0];
        int row = 0;
        int col = 0;

        // Duyệt tìm phần tử lớn nhất
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        // In kết quả
        System.out.println("\nGiá trị lớn nhất trong ma trận là: " + max);
        System.out.println("Tọa độ: hàng " + row + ", cột " + col);
    }
}
