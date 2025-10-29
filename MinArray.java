import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int[] array;

        // Nhập độ dài mảng
        do {
            System.out.print("Nhập độ dài mảng: ");
            size = input.nextInt();
            if (size > 20)
                System.out.println("Độ dài mảng không thể vượt quá 20!");
        } while (size > 20);

        // Khởi tạo mảng
        array = new int[size];

        // Nhập các phần tử
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        // In mảng đã nhập
        System.out.print("\nDanh sách đã nhập: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        // Giả định phần tử đầu tiên là nhỏ nhất
        int min = array[0];
        int index = 0;

        // Duyệt mảng từ phần tử thứ 2
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        // In kết quả
        System.out.println("\nGiá trị nhỏ nhất trong mảng là " + min + " tại vị trí " + (index + 1));
    }
}
