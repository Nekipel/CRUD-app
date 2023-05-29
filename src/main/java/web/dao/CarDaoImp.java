package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("3", "mazda"));
        cars.add(new Car("accord", "honda"));
        cars.add(new Car("granta", "lada"));
        cars.add(new Car("rio", "kia"));
        cars.add(new Car("x5", "bmw"));
    }

    @Override
    public List<Car> getCarsSize(int size) {
        if (size == 0) {
            return cars;
        } else {
            return cars.stream().limit(size).toList();
        }
    }
}
