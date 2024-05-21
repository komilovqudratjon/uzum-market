package com.example.sergeyhomework1.payload;

import lombok.Getter;

/**
 * @className: Car  $
 * @description: TODO
 * @date: 21 May 2024 $
 * @time: 6:34 PM 28 $
 * @author: Qudratjon Komilov
 */
@Getter
public class Car {
    private static int count = 0;
    private int serialNumber;
    private Engine engine;

    public Car(String pedalSize) {
        this.engine = new Engine(pedalSize);
        this.serialNumber = ++count;
    }

}

