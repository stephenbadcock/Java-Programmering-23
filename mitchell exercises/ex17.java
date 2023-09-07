import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        String name;
        int age;
        double weight, income;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("What's your name?");
        name = keyboard.next();

        System.out.print("Hi " + name + ", how old are you?");
        age = keyboard.nextInt();

        System.out.println("So, you're " + age + " old,,,");
        System.out.print("How much do you weigh " + name + "?");
        weight = keyboard.nextDouble();

        System.out.println(weight + "! Wow!");
        System.out.print("And how much is your income " + name + "?");
        income = keyboard.nextDouble();

        System.out.print("Hopefully that is " + income + " per year...");

    }
}
