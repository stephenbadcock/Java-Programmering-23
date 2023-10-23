import java.util.Arrays;

public class ArrayOfWords {
    public static void main(String[] args) {
        String[] myStringArray = {"Juventus", "Milan", "Palermo", "Bari"};

        Arrays.sort(myStringArray);

        System.out.println("Längden på varje ord");
        System.out.println("--------------------");

        int longestWord = 0;
        int longestWordIndex = 0;

        for (int index = 0; index < myStringArray.length; index++) {
            if (myStringArray[index].length() > longestWord) {
                longestWord = myStringArray[index].length();
                longestWordIndex = index;
            }

            System.out.println(myStringArray[index] + ": " + myStringArray[index].length());
        }

        System.out.println();
        System.out.println("Längsta ordet i arrayen: " + myStringArray[longestWordIndex]);
    }
}
