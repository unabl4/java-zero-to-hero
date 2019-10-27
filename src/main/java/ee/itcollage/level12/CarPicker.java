package ee.itcollage.level12;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarPicker {

    public static void main(String[] args) {
        //todo 3 simulate picking a car

        List<Car> garage = Arrays.asList(
            buildCar("Lamborgini Avendator", 2000000, false, 10.0),
            buildCar("Tesla Roadster", 100000, true, 9.0),
            buildCar("Toyota Prius", 20000, false, 5.0),
            buildCar("Lada", 5000, false, 2.0),
            buildCar("Bicycle", 100, false, 0.5)
        );
        System.out.println("Garage contains: \n" + garage);
        //todo 3.1 what does garage print? Can you make it print something prettier?

        //todo 3.2 Ask user how much money do they have and pick them a car or cars based on cars you have in garage
        // uncomment following lines for reading input example
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money do you have?");
        Integer amount = scanner.nextInt();
        System.out.println("Your input: " + amount);

        Stream<Car> carStream = garage.stream()
                .sorted(Comparator.comparing(Car::getCost).reversed())
                .filter(c -> c.getCost() <= amount);
        List<Car> carsList = carStream.collect(Collectors.toList());
        Optional<Car> chosenCar = carsList.stream().findFirst();

        if(chosenCar.isPresent()) {
            System.out.println("\n");
            System.out.println("Shop recommends you: " + chosenCar.get());
        } else {
            System.out.println("There is nothing to recommend");
            return;
        }

        //todo ADVANCED
        // ask user 2nd question (+rating)
        System.out.println("Min. rating");
        Double minRating = scanner.nextDouble();

        carStream = carsList.stream()
                .filter(c -> c.getUserRating() >= minRating)
                .sorted(Comparator.comparing(Car::getUserRating).reversed());   // sort by rating (desc)
        carsList = carStream.collect(Collectors.toList());
        chosenCar = carsList.stream().findFirst();

        if(chosenCar.isPresent()) {
            System.out.println("\n");
            System.out.println("Shop recommends you: " + chosenCar.get());
        } else {
            System.out.println("There is nothing to recommend");
            return; // nothing found
        }

        //todo ADVANCED
        // ask user 3rd question (+electric)
        System.out.println("Is electric?");
        boolean isElectric = scanner.nextBoolean();

        carStream = carsList.stream().filter(c -> c.isElectric() == isElectric);
        carsList = carStream.collect(Collectors.toList());
        chosenCar = carsList.stream().findFirst();

        if(chosenCar.isPresent()) {
            System.out.println("\n");
            System.out.println("Shop recommends you: " + chosenCar.get());
        } else {
            System.out.println("There is nothing to recommend");
        }
    }

    private static Car buildCar(String name, int cost, boolean electric, double userRating) {
        Car car = new Car();
        car.setModel(name);
        car.setCost(cost);
        car.setElectric(electric);
        car.setUserRating(userRating);
        return car;
    }
}