package ee.itcollage.level1;

public class Millionaire {

    public static void main(String[] args) {
        //todo create a Garage.
        // create a Garage and put Ferrari in it.
        // print out Ferrari and make it print out sth nice (other than ee.itcollage.level1.Ferrari@1c20c684)
        // add a list of cars to Garage
        // add another Ferrari to Garage
        // make Garage print out a list of cars in it

        Garage garage = new Garage();
        Ferrari ferrari = new Ferrari();
        garage.setFerrari(ferrari);

        System.out.println(ferrari);

        garage.addCar(ferrari);
        garage.addCar(ferrari);

        garage.printCars();
    }
}
