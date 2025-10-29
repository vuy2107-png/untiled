import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 🔹 Bước 1: Khai báo và khởi tạo mảng
        System.out.print("Nhập số lượng phần tử N: ");
        int n = input.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        // In mảng ban đầu
        System.out.print("\nMảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }

        // 🔹 Bước 2: Nhập phần tử cần xóa X
        System.out.print("\n\nNhập phần tử cần xoá X: ");
        int X = input.nextInt();

        // 🔹 Bước 3: Tìm vị trí của X trong mảng
        int index_del = -1; // mặc định -1 nghĩa là không tìm thấy
        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                index_del = i;
                break; // tìm thấy thì thoát khỏi vòng lặp
            }
        }

        // 🔹 Bước 4: Xóa phần tử nếu tìm thấy
        if (index_del == -1) {
            System.out.println("Phần tử " + X + " không tồn tại trong mảng.");
        } else {
            // Duyệt từ vị trí cần xóa đến phần tử cuối
            for (int i = index_del; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }

            // 🔹 Giảm kích thước logic của mảng (vì mảng cố định độ dài)
            n--; // thực tế chỉ còn n-1 phần tử hợp lệ

            // 🔹 Bước 5: In ra mảng sau khi xóa
            System.out.print("Mảng sau khi xoá phần tử " + X + ": ");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + "\t");
            }
        }
    }
}
