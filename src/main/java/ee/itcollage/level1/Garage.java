package ee.itcollage.level1;

import java.util.ArrayList;

class Garage {

    private Ferrari ferrari;
    private ArrayList<Ferrari> cars = new ArrayList<>();

    void setFerrari(Ferrari ferrari) {
        System.out.println("Setting Ferrari");
        this.ferrari = ferrari;
    }

    // add a car to the collection
    void addCar(Ferrari ferrari) {
        System.out.println("Adding a car to collection");
        this.cars.add(ferrari);
    }

    void printCars() {
        System.out.println("Printing out cars");

        for(Ferrari f : cars) {
            System.out.println(f);
        }
    }
}
