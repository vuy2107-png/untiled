import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số tiền muốn gửi: ");
        double money = input.nextDouble();

        System.out.print("Nhập số tháng muốn gửi: ");
        int month = input.nextInt();

        System.out.print("Nhập lãi suất hàng năm (%): ");
        double interestRate = input.nextDouble();

        double totalInterest = 0;

        for (int i = 0; i < month; i++) {
            double monthlyInterest = money * (interestRate / 100) / 12;
            totalInterest += monthlyInterest;
            money += monthlyInterest; // nhập lãi vào gốc
        }

        System.out.println("Tổng tiền lãi là: " + totalInterest);
        System.out.println("Tổng tiền sau khi gửi: " + money);
    }
}
