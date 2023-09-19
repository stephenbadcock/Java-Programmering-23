import java.util.Scanner;

public class challenges_E2_2 {
    public static void main(String[] args) {
        int no1, no2, no3, largest = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Choose a number: ");
        no1 = sc.nextInt();

        System.out.print("Choose another number: ");
        no2 = sc.nextInt();

        System.out.print("Choose a third number: ");
        no3 = sc.nextInt();
        System.out.println();

        sc.close();

        if (no1 >= no2 && no1 >= no3) {
            largest = no1;
        } else if (no2 >= no1 && no2 >= no3) {
            largest = no2;
        } else if (no3 >= no1 && no3 >= no2) {
            largest = no3;
        }

        System.out.println("The largest number is " + largest);
    }
}
