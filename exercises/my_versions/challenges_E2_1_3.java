import java.util.Scanner;

public class challenges_E2_1_3 {
    public static void main(String[] args) {
        double number;
        String result;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose a number: ");
        number = scanner.nextDouble();

        scanner.close();

        if (number > 0) {
            result = "positive";
        } else if (number < 0) {
            result = "negative";
        } else {
            result = "zero";
        }

        System.out.println("Your number is " + result);

        if (number < 1) {
            System.out.print("Your number is small");
        } else if (number > 1000000) {
            System.out.print("Your number is big");
        }
    }
}
