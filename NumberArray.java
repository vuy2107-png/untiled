import java.util.Scanner;

public class NumberArray {
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

        // Nhập phần tử mảng
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        // In danh sách mảng
        System.out.print("\nDanh sách đã nhập: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        // Tìm giá trị lớn nhất và vị trí
        int max = array[0];
        int index = 0; // bắt đầu từ 0

        for (int j = 1; j < array.length; j++) { // có thể bắt đầu từ 1 để đỡ so sánh phần tử đầu
            if (array[j] > max) {
                max = array[j];
                index = j;
            }
        }

        // In kết quả
        System.out.println("\nGiá trị lớn nhất trong mảng là " + max + ", tại vị trí thứ " + (index + 1));
    }
}
