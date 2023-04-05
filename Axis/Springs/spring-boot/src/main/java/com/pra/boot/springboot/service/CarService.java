package com.pra.boot.springboot.service;

import org.springframework.stereotype.Service;

import com.pra.boot.springboot.entity.Car;

@Service
public class CarService {
    
    public void createNewCar(Long id, String make, String model) {

        Car car = new Car();
        car.setId(id);
        car.setMake(make);
        car.setModel(model);
        System.out.println(car.toString());
    }
}

