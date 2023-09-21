public class e33 {
    public static void main(String[] args) {
        Car myCar = new Car("Nissan", "Micra", 1997, "Red");
        myCar.printDetails();

        Car myCar2 = new Car(1927);
        myCar2.printDetails();

        Car myCar3 = new Car(2004, "yellow");
        myCar3.printDetails();
    }
}

class Car {
    private String make, model, colour;
    private int year;

    public Car (String make, String model, int year, String colour) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.colour = colour;
    }

    public Car (int year) {
        this("X", "X", year, "X");
    }

    public Car (int year, String colour) {
        this("X", "X", year, colour);
    }

    void printDetails () {
        System.out.println(make + model + year + colour);
    }
}
