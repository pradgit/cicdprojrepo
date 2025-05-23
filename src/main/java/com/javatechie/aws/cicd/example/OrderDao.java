package com.javatechie.aws.cicd.example;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {


    public List<Order> getOrders() {
        return Stream.of(
                new Order(101, "Mobile", 1, 30000),
                new Order(58, "Book", 4, 2000),
                new Order(205, "Laptop", 1, 150000),
                new Order(809, "headset", 1, 1799),
                new Order(809, "Mouse", 3, 499),
                new Order(809, "Digitalbooks", 24, 1499),
                new Order(849, "AppleWatch", 44, 299),
                new Order(869, "SimpleWatch", 26, 399),
                new Order(809, "camera", 4, 299),
                new Order(111, "Car", 1, 200000))
                .collect(Collectors.toList());
    }
}
