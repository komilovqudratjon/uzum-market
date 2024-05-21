package com.example.sergeyhomework1.payload;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: FactoryAF  $
 * @description: TODO
 * @date: 21 May 2024 $
 * @time: 6:34 PM 52 $
 * @author: Qudratjon Komilov
 */


public class FactoryAF {
    private List<Car> cars = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void saleCar() {
        for (Customer customer : customers) {
            if (!cars.isEmpty()) {
                Car car = cars.remove(0);
                customer.setCar(car);
            }
        }
        cars.clear();
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}

