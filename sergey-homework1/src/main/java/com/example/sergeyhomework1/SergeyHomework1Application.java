package com.example.sergeyhomework1;

import com.example.sergeyhomework1.payload.Car;
import com.example.sergeyhomework1.payload.Customer;
import com.example.sergeyhomework1.payload.FactoryAF;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @className: SergeyHomework1Application  $
 * @description: TODO
 * @date: 21 May 2024 $
 * @time: 6:34 PM 52 $
 * @author: Qudratjon Komilov
 */
@SpringBootApplication
public class SergeyHomework1Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SergeyHomework1Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        FactoryAF factory = new FactoryAF();

        // Add cars
        factory.addCar(new Car("Large"));
        factory.addCar(new Car("Medium"));
        factory.addCar(new Car("Small"));

        // Add customers
        factory.addCustomer(new Customer("Alice"));
        factory.addCustomer(new Customer("Bob"));
        factory.addCustomer(new Customer("Charlie"));

        // Display initial state
        displayState(factory);

        // Execute SaleCar method
        factory.saleCar();

        // Display final state
        displayState(factory);
    }

    private void displayState(FactoryAF factory) {
        System.out.println("Cars in the factory:");

        for (Car car : factory.getCars()) {
            System.out.println("Car Serial Number: " + car.getSerialNumber() + ", Pedal Size: " + car.getEngine().getPedalSize());
        }

        System.out.println("Customers:");
        for (Customer customer : factory.getCustomers()) {
            String carInfo = customer.getCar() != null ?
                    "Car Serial Number: " + customer.getCar().getSerialNumber() :
                    "No car assigned";
            System.out.println("Customer Name: " + customer.getName() + ", " + carInfo);
        }
    }


}
