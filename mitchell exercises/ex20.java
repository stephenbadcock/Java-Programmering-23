import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        double firstNumber, secondNumber, thirdNumber, result;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your first number? ");
        firstNumber = scanner.nextDouble();

        System.out.print("What is your second number? ");
        secondNumber = scanner.nextDouble();

        System.out.print("What is your third number? ");
        thirdNumber = scanner.nextDouble();
        System.out.println();

        result = (firstNumber + secondNumber + thirdNumber) / 2;
        System.out.print("( " + firstNumber + " + " + secondNumber + " + " + thirdNumber + ") / 2 is... " + result);
        
        scanner.close();
    }
}
