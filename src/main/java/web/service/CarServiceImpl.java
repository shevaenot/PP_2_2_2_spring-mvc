package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



@Service
public class CarServiceImpl implements CarService {

    public static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Mercedes-Benz", "black", 1985));
        carList.add(new Car("Hyundai", "yellow", 2019));
        carList.add(new Car("Toyota", "red", 2000));
        carList.add(new Car("Lada", "green", 2018));
        carList.add(new Car("Volkswagen", "black", 2013));
//        carList.add(new Car("KAMAZ", "white", 2000));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}

