import java.util.Scanner;

public class challenges_E2_4 {
    public static void main(String[] args) {
        int no;
        String weekday;

        Scanner sc = new Scanner(System.in);

        System.out.print("Choose a number between 1 and 7: ");
        no = sc.nextInt();

        switch (no) {
            case 1 :
                weekday = "Monday";
                break;
            case 2 :
                weekday = "Tuesday";
                break;
            case 3 :
                weekday = "Wednesday";
                break;
            case 4 :
                weekday = "Thursday";
                break;
            case 5 :
                weekday = "Friday";
                break;
            case 6 :
                weekday = "Saturday";
                break;
            case 7 :
                weekday = "Sunday";
                break;
            default :
                weekday = "No weekday represents that number";
                break;
        }

        System.out.println(weekday);

        sc.close();
    }
}
