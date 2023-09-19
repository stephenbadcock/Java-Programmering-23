import java.util.Scanner;

public class challenges_E2_7 {
    public static void main(String[] args) {
        int no;

        Scanner sc = new Scanner(System.in);

        System.out.print("Choose a number between 1 and 9: ");
        no = sc.nextInt();
        System.out.println();

        sc.close();

        System.out.println("Here's your pyramid:\n");

        for (int i = 1; i <= no; i++) {
            System.out.print("\t\t");

            int j = 1;

            while (j <= i) {
                System.out.print("\b");

                j++;
            }
            
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");

                if (k == i) {
                    System.out.println();
                }
            }
        }
    }
}
