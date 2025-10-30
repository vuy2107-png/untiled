import java.util.Scanner;

public class CountCharacterInString {
    public static void main(String[] args) {
        // Bước 1: Khai báo một chuỗi và gán giá trị
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();

        // Bước 2: Nhập ký tự cần đếm
        System.out.print("Nhập ký tự cần đếm: ");
        char character = scanner.next().charAt(0);

        // Bước 3: Khai báo biến count để lưu số ký tự đếm được
        int count = 0;

        // Bước 4: Duyệt từng ký tự trong chuỗi
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }

        // Hiển thị kết quả
        System.out.println("Ký tự '" + character + "' xuất hiện " + count + " lần trong chuỗi.");
    }
}
