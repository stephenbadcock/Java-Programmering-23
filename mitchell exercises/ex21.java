import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        double m, kg, bmi;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Your height in m: ");
        m = scanner.nextDouble();

        System.out.print("Your weight in kg: ");
        kg = scanner.nextDouble();

        bmi = kg / (m * m);
        
        System.out.println("Your BMI is: " + bmi) ;

        scanner.close();
    }
}
