import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        String name;
        int age, agePlusFive, ageMinusFive;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello.\t What is your name? ");
        name = scanner.nextLine();
        System.out.println();

        System.out.print("Hi " + name + ". How old are you? ");
        age = scanner.nextInt();
        System.out.println();

        agePlusFive = age + 5;
        System.out.println("Did you know that in five years you will be " + agePlusFive + " years old?");

        ageMinusFive = age - 5;
        System.out.print("And five years ago you were " + ageMinusFive + "! Imagine that!");

        scanner.close();
    }
}

