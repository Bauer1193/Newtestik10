import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add (new Suzuki (2018, "Красный", "Swift", "Механика", "Передний", "Бензин"));
        cars.add (new Suzuki (2020, "Черный", "Vitara", "Автомат", "Полный", "Дизель"));
        cars.add (new Toyota (2019, "Белый", "Camry", "Автомат", "Передний", "Гибрид"));
        cars.add (new Toyota (2021, "Серый", "RAV4", "Автомат", "Полный", "Бензин"));
        cars.add (new BMW (2017, "Синий", "X5", "Автомат", "Полный", "Бензин"));
        cars.add (new BMW (2022, "Черный", "M3", "Механика", "Задний", "Бензин"));
        cars.add (new Mazda (2018, "Белый", "A4", "Автомат", "Передний", "Дизель"));
        cars.add (new Mazda (2020, "Красный", "Q7", "Автомат", "Полный", "Бензин"));
        cars.add (new KIA (2016, "Зеленый", "Focus", "Механика", "Передний", "Бензин"));
        cars.add (new KIA (2019, "Серебристый", "Explorer", "Автомат", "Полный", "Гибрид"));

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
