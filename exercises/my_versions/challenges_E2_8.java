import java.util.Scanner;

public class challenges_E2_8 {
    public static void main(String[] args) {
        int myNo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        myNo = sc.nextInt();
        System.out.println();

        sc.close();

        if ((myNo % 2 != 0)) {
            for (int i = 1; i <= myNo; i += 2) {
                System.out.print("\t\t\t");

                int j = 1;

                while (j <= i) {
                    System.out.print("\b");

                    j += 2;
                }

                for (int k = 1; k <= i; k++) {
                    System.out.print("*");

                    if (k == i) {
                        System.out.println();
                    }
                }
            }

            for (int l = (myNo - 2); l >= 1; l -= 2) {
                System.out.print("\t\t\t");

                int m = 1;

                while (m <= l) {
                    System.out.print("\b");

                    m += 2;
                }

                for (int n = 1; n <= l; n++) {
                    System.out.print("*");

                    if (n == l) {
                        System.out.println();
                    }
                }
            }
        } else {
            System.out.println("You didn't write an odd number.");
        }
    }
}
