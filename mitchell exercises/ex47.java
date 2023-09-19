import java.util.Scanner;

public class ex47 {
    public static void main(String[] args) {
        String lastName;

        Scanner sc = new Scanner(System.in);
        System.out.print("What's your last name? ");
        lastName = sc.next();
        System.out.println();

        sc.close();

        if (lastName.compareToIgnoreCase("Carswell") <= 0)  {
            System.out.println("You don't have to wait long, " + "\"" + lastName + "\".");
        } else if (lastName.compareToIgnoreCase("Jones") <= 0)  {
            System.out.println("That's not bad, " + "\"" + lastName + "\".");
        } else if (lastName.compareToIgnoreCase("Smith") <= 0)  {
            System.out.println("Looks like a bit of a wait, " + "\"" + lastName + "\".");
        } else if (lastName.compareToIgnoreCase("Young") <= 0)  {
            System.out.println("It's gonna be a while, " + "\"" + lastName + "\".");
        } else if (lastName.compareToIgnoreCase("Young") > 0)  {
            System.out.println("Not going anywhere for a while, " + "\"" + lastName + "\"?");
        } 
    }
}
