import java.util.Scanner;
public class PrimeFirst {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố: ");
        int numbers = input.nextInt();

        int count = 0;

        int N = 2;

        while (count < numbers) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }
}
