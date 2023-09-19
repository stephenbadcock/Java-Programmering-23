import java.util.Scanner;

public class challenges_E2_5 {
    public static void main(String[] args) {
        String myChar, alphabet = "abcdefghijklmnopqrstuvwxyzåäö", vowels = "aouåeiyäö";
        int stringLength = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Please choose a letter from the alphabet: ");
        myChar = sc.next().toLowerCase();
        
        sc.close();

        stringLength = myChar.length();

        if (alphabet.contains(myChar) && stringLength == 1) {
            if (vowels.contains(myChar)) {
                System.out.print(myChar + " is a vowel.");
            } else {
                System.out.print(myChar + " is a consonant.");
            }
        } else {
            System.out.print("You have not chosen a single letter!");
        }

        
    }
}
