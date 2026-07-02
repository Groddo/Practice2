import java.util.*;
import java.util.stream.Collectors;

public class part4 {
    public static void main(String[] args) throws Exception {
        List<Car> cars = Arrays.asList(
                new Car("1", "Camry", "Toyota", 2022, 30000, 25000),
                new Car("2", "X5", "BMW", 2023, 20000, 55000),
                new Car("3", "A6", "Audi", 2021, 70000, 40000),
                new Car("4", "Model S", "Tesla", 2022, 15000, 60000),
                new Car("5", "Corolla", "Toyota", 2020, 90000, 18000),
                new Car("6", "Q7", "Audi", 2023, 10000, 65000)
        );

        List<Car> lowMileageCars = cars.stream()
                .filter(car -> car.getMileage() < 50000)
                .collect(Collectors.toList());

        System.out.println("Машины с пробегом < 50 000:");
        lowMileageCars.forEach(System.out::println);

        List<Car> sortedByPriceDesc = cars.stream()
                .sorted(Comparator.comparing(Car::getPrice).reversed())
                .collect(Collectors.toList());

        System.out.println("\nОтсортированы по цене:");
        sortedByPriceDesc.forEach(System.out::println);

        System.out.println("\nCамые дорогие машины:");
        cars.stream()
                .sorted(Comparator.comparing(Car::getPrice).reversed())
                .limit(3)
                .forEach(System.out::println);

        double averageMileage = cars.stream()
                .mapToInt(Car::getMileage)
                .average()
                .orElse(0);

        System.out.println("\nСредний пробег: " + averageMileage);

        Map<String, List<Car>> carsByManufacturer = cars.stream()
                .collect(Collectors.groupingBy(Car::getManufacturer));

        System.out.println("\nГруппировка по производителю:");
        carsByManufacturer.forEach((manufacturer, carList) -> {
            System.out.println(manufacturer + ":");
            carList.forEach(System.out::println);
        });
    }
}
