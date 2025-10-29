import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập số lượng phần tử N");
        int n = input.nextInt();
        int[] array = new int[n + 1];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " :");
            array[i] = input.nextInt();
        }

        System.out.print("\nMảng ban đầu");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }

        System.out.print("\n\nNhập phần tử X cần chèn: ");
        int X = input.nextInt();
        System.out.print("Nhập vị trí cần chèn (0 đến " + n + "): ");
        int index_insert = input.nextInt();

        // Kiểm tra vị trí hợp lệ
        if (index_insert < 0 || index_insert > n) {
            System.out.println("Vị trí chèn không hợp lệ");
        } else {
            // Dịch phần tử sang phải
            for (int i = n; i > index_insert; i--) {
                array[i] = array[i - 1];
            }
            // Gán phần tử X vào vị trí cần chèn
            array[index_insert] = X;
            n++;

            System.out.print("Mảng sau khi chèn: ");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + "\t");
            }
        }
    }
}
