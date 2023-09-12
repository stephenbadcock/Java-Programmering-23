// Own classes based on https://docs.oracle.com/javase/tutorial/java/concepts/class.html

class FridgeDemo {
    public static void main(String[] args) {
        Fridge firstFridge = new Fridge();

        firstFridge.printInitialStates();

        firstFridge.lowerTemp(4);
        firstFridge.togglePower();
        firstFridge.togglePower();
        firstFridge.higherTemp(4);
        firstFridge.defrostFridge();
        System.out.println();  

        Fridge secondFridge = new Fridge();

        secondFridge.printInitialStates();
        secondFridge.togglePower();
        secondFridge.lowerTemp(8);
        secondFridge.defrostFridge();
        secondFridge.defrostFridge();
        secondFridge.defrostFridge();
        System.out.println(); 
    }
}

class Fridge {
    int fridgeTemp = 8, defrostings = 0;
    boolean power = true;

    void printInitialStates() {
        System.out.println("Initial values:");
        System.out.println("---------------");
        System.out.println("Fridge temp: " + fridgeTemp);
        System.out.println("Fridge power: " + power);
        System.out.println("Defrostings: " + defrostings);
        System.out.println(); 
    }

    void lowerTemp(int lowerTemp) {
        fridgeTemp -= lowerTemp;

        System.out.println("Fridge temp: " + fridgeTemp);
    }

    void higherTemp(int higherTemp) {
        fridgeTemp += higherTemp;

        System.out.println("Fridge temp: " + fridgeTemp);
    }

    void defrostFridge() {
        defrostings++;

        System.out.println("Defrostings: " + defrostings);
    }    

    void togglePower() {
        if ( power == true ) {
            power = false;
        } else {
            power = true;
        }

        System.out.println("Fridge power: " + power);
    }
}


