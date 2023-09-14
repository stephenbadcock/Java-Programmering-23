import java.util.Scanner;

public class e225 {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose a number: ");
        number = scanner.nextInt();
        scanner.close();

        for(int count = 1; count <= 10; count++) {
            System.out.println(number + " x " + count + "=" + number * count);
        }

    }
}
