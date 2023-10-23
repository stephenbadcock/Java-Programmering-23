import java.util.Random;
import java.util.Scanner;

public class ArrayOfIntegers {
    int[] intArray;

    public ArrayOfIntegers(int arrayLength) {
        Random random = new Random();

        intArray = new int[arrayLength];
        
        for (int i = 0; i < intArray.length; i++) {
            int rand = random.nextInt(10) + 1;
            intArray[i] = rand;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Storlek på array: ");
        int arrayLength = scanner.nextInt();
        scanner.nextLine();

        ArrayOfIntegers myArray = new ArrayOfIntegers(arrayLength);

        for (int value : myArray.intArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("Vilket index har talet i arrayen som ska bytas ut: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Det nya värdet: ");
        int newValue = scanner.nextInt();
        scanner.nextLine();

        myArray.switchIntegers(index, newValue);

        for (int value : myArray.intArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("Vilket index har talet i arrayen som ska multipliceras med sig själv: ");
        int index2 = scanner.nextInt();
        scanner.nextLine();

        myArray.multiplyIntegerWithSelf(index2);

        for (int value : myArray.intArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        scanner.close();
    }

    public void switchIntegers(int index, int newValue) {
        intArray[index] = newValue;
    }

    public void multiplyIntegerWithSelf(int index) {
        intArray[index] = intArray[index] * intArray[index];
    }
}
