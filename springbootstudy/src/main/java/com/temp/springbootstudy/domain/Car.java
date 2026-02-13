package com.temp.springbootstudy.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String brand, model, registrationNumber;

    private int modelYear, price;

    public Car() {
    }

    public Car(Long id, String brand, String model, String registrationNumber, int modelYear, int price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.modelYear = modelYear;
        this.price = price;
    }
}
