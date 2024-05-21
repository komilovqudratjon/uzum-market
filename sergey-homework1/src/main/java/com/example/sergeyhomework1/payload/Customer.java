package com.example.sergeyhomework1.payload;

import lombok.Getter;
import lombok.Setter;

/**
 * @className: Customer  $
 * @description: TODO
 * @date: 21 May 2024 $
 * @time: 6:34 PM 40 $
 * @author: Qudratjon Komilov
 */
@Getter
@Setter
public class Customer {
    private String name;
    private Car car;

    public Customer(String name) {
        this.name = name;
    }
}

