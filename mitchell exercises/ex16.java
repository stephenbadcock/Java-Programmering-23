import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What's the capital of France?");
        keyboard.next();

        System.out.println("What's 6 multiplied with 7?");
        keyboard.nextInt();

        System.out.println("Enter a number between 0.0 and 1.0.");
        keyboard.nextDouble();

        System.out.println("Is there anything you'd like to say?");
        keyboard.next();
    }
}
