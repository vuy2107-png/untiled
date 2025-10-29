import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double weight, heightInInches, heightInMeters, bmi;

        System.out.print("Your weight in kilogram: ");
        weight = scanner.nextDouble();

        System.out.print("Your height in inches: ");
        heightInInches = scanner.nextDouble();

        // Chuyển inch sang mét
        heightInMeters = heightInInches * 0.0254;

        // Tính BMI
        bmi = weight / Math.pow(heightInMeters, 2);

        System.out.printf("%-20s%s\n", "BMI", "Interpretation");

        if (bmi < 18.5)
            System.out.printf("%-20.2f%s\n", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s\n", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s\n", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s\n", bmi, "Obese");
    }
}