import java.util.Scanner;

public class myStringMethods {
    public static String reverseString(String myString) {
        String reversedString = "";
        int stringLength = myString.length();

        for(int i = (stringLength - 1); i >= 0; i--) {
            reversedString += myString.charAt(i);
        }

        return reversedString;
    }

    public static int countCharacters(String myString, char myChar) {
        int charCount = 0, stringLength = myString.length();

        for(int i = 0; i < stringLength; i++) {
            if(myString.charAt(i) == myChar) {
                charCount++;
            }
        }

        return charCount;
    }

    public static boolean isValidEmail(String myEmail) {
        if(myEmail.indexOf("@", 1) == -1) {
            return false;
        }

        if(myEmail.endsWith(".se") == false && myEmail.endsWith(".com") == false) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String myString, reversedString, myEmail, emailValidity;
        char myChar;
        int charCount;

        Scanner sc = new Scanner(System.in);

        System.out.print("Skriv en textsträng: ");
        myString = sc.nextLine();

        reversedString = reverseString(myString);

        System.out.println(myString + " blir " + reversedString + " bakvänt");
        System.out.println();

        System.out.print("Välj en karaktär: ");
        myChar = sc.next().charAt(0);

        charCount = countCharacters(myString, myChar);
        System.out.println("Det finns " + charCount + " \"" + myChar + "\" i textsträngen \"" + myString + "\"");
        System.out.println();

        System.out.print("Skriv in din e-postadress: ");
        myEmail = sc.next();
        
        emailValidity = isValidEmail(myEmail) == true ? "giltig" : "ogiltig";
        System.out.println("Din e-postadress är " + emailValidity);

        sc.close();
    }
}
