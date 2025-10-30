public class SumDiagonalMatrix {
    public static void main(String[] args) {
        // Bước 1: Khởi tạo nhanh ma trận vuông 3x3
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;

        // Tính tổng các phần tử trên đường chéo chính (hàng = cột)
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        System.out.println("Tổng các phần tử trên đường chéo chính là: " + sum);
    }
}
