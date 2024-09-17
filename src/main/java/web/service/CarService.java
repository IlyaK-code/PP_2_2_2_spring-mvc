package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarService {

    List<Car> cars = Arrays.asList(
            new Car("Toyota", "Carib", 1993),
            new Car("LADA", "GRANTA", 2023),
            new Car("Avto", "Super", 2025),
            new Car("China", "NeMachina", 2023),
            new Car("RenoLogan", "S3Turbo", 1958)
    );

    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
