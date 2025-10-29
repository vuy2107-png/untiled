import java.util.Scanner;

public class UniversityStudents {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size;
        int[] array;

        do {
            System.out.print("Nhập độ dài mảng");
            size = input.nextInt();
            if (size > 30)
                System.out.println("Độ dài mảng không hợp lệ");
        } while (size > 30);

        array = new int[size];

        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập điểm cho học sinh " + (i + 1) + ": ");
            array[i] = input.nextInt();
            i++;
        }

        int count = 0;
        System.out.print("Danh sách sinh viên: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\n Số lượng học sinh đỗ kỳ thi là: " + count);
    }
}