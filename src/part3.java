import java.util.*;

public class part3 {
    public static void main(String[] args) {

        Set<Car> cars = new HashSet<>();

        cars.add(new Car("VIN123", "Camry", "Toyota", 2022, 15000, 25000));
        cars.add(new Car("VIN456", "X5", "BMW", 2023, 8000, 55000));
        cars.add(new Car("VIN789", "Model S", "Tesla", 2021, 20000, 60000));
        cars.add(new Car("VIN123", "Camry", "Toyota", 2022, 15000, 25000));

        List<Car> sortedCars = new ArrayList<>(cars);
        Collections.sort(sortedCars);

        for (Car car : sortedCars) {
            System.out.println(car);
        }
    }
}
