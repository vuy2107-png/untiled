import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int[] array;

        // Nhập kích thước mảng, không vượt quá 20
        do {
            System.out.println("Enter a size");
            size = input.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);

        // Khởi tạo mảng
        array = new int[size];

        // Nhập từng phần tử
       for (int i = 0; i < array.length; i++) {
           System.out.print("Enter element " + (i + 1) + ": ");
           array[i] = input.nextInt();
       }

       // In mảng đảo ngược
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = array.length - 1; j >= 0; j--) {
            System.out.printf("%d\t", array[j]);
        }
    }
}
