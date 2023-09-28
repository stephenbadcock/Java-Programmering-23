import java.util.Scanner;

public class myMathMethods {
    private int myInt;

    public void setInt(int myInt) {
        this.myInt = myInt;
    }

    public int getInt() {
        return myInt;
    }

    public int calculateFactorial() {
        int sum = 1;

        if(myInt == 0) {
            return sum;
        }
        
        for(int i = myInt; i >= 1; i--) {
            sum *= i;
        }

        return sum;
    }

    public int calculateFibonacci() {
        int fibonacciNo = 1, firstNo = 0, secondNo = 1;

        if(myInt == 1) {
            return fibonacciNo = 0;
        } else if (myInt == 2) {
            return fibonacciNo = 1; 
        }

        for(int i = 3; i <= myInt; i++) {
            fibonacciNo = firstNo + secondNo;
            firstNo = secondNo;
            secondNo = fibonacciNo;
        }

        return fibonacciNo;
    }

    public boolean isPrime() {
        boolean isPrime = true;

        if(myInt <= 1) {
            return isPrime = false;
        }

        for(int i = myInt; i > 1; i--) {
            if(myInt % i == 0 && i != myInt) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        int factorial, fibonacciNo;
        boolean isPrime;
        String primeStatement;

        myMathMethods myClass = new myMathMethods();

        Scanner sc = new Scanner(System.in);
        System.out.print("Skriv in ett heltal: ");
        myClass.setInt(sc.nextInt());
        sc.close();
        System.out.println();

        factorial = myClass.calculateFactorial();
        System.out.println(myClass.getInt() + "! = " + factorial);

        fibonacciNo = myClass.calculateFibonacci();
        System.out.println("Fibonacci #" + myClass.getInt() + " är " + fibonacciNo);

        isPrime = myClass.isPrime();
        primeStatement = (isPrime == false) ? " inte" : "";
        System.out.println("Talet " + myClass.getInt() + " är" + primeStatement + " ett primtal");
    }
}


