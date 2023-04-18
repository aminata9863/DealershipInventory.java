import java.util.ArrayList;

public class DealershipInventory {
    private ArrayList<Car> cars;

    public DealershipInventory() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void displayInventory() {
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }
}
