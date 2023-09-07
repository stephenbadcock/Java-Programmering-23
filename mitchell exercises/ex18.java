import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        String login, firstName, lastName;
        double gpa;
        int id, grade;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your information.");

        System.out.print("Login: ");
        login = keyboard.nextLine();

        System.out.print("ID: ");
        id = keyboard.nextInt();

        System.out.print("First name: ");
        firstName = keyboard.next();

        keyboard.nextLine();
        
        System.out.print("Last name: ");
        lastName = keyboard.nextLine();

        System.out.print("GPA: ");
        gpa = keyboard.nextDouble();

        System.out.print("Grade: ");
        grade = keyboard.nextInt();

        System.out.println("Your information:");

        System.out.println("\tLogin:" + "\t" + login);
        System.out.println("\tID:" + "\t" + id);
        System.out.println("\tName:" + "\t" + firstName + " " + lastName);
        System.out.println("\tGPA:" + "\t" + gpa);
        System.out.println("\tGrade:" + "\t" + grade);

    }
}
