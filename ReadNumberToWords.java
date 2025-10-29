import java.util.Scanner;

public class ReadNumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0-999): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("out of ability");
        } else {
            System.out.println(numberToWords(number));
        }
    }

    // Hàm đọc số thành chữ
    public static String numberToWords(int number) {
        if (number < 10)
            return oneDigit(number);
        else if (number < 20)
            return teen(number);
        else if (number < 100)
            return twoDigits(number);
        else
            return threeDigits(number);
    }

    // Đọc số có 1 chữ số
    public static String oneDigit(int n) {
        switch (n) {
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }

    // Đọc các số từ 10 đến 19
    public static String teen(int n) {
        switch (n) {
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "";
        }
    }

    // Đọc số có 2 chữ số (>= 20)
    public static String twoDigits(int n) {
        int tens = n / 10;
        int ones = n % 10;
        String word = "";

        switch (tens) {
            case 2: word = "twenty"; break;
            case 3: word = "thirty"; break;
            case 4: word = "forty"; break;
            case 5: word = "fifty"; break;
            case 6: word = "sixty"; break;
            case 7: word = "seventy"; break;
            case 8: word = "eighty"; break;
            case 9: word = "ninety"; break;
        }

        if (ones != 0)
            word += " " + oneDigit(ones);

        return word;
    }

    // Đọc số có 3 chữ số
    public static String threeDigits(int n) {
        int hundreds = n / 100;
        int remainder = n % 100;
        String word = oneDigit(hundreds) + " hundred";

        if (remainder != 0)
            word += " and " + numberToWords(remainder);

        return word;
    }
}
