package com.learning.core.day6;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Car implements Comparable<Car> {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Car car = (Car) obj;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Car other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return name + " " + price;
    }
}

public class main {
    public static void main(String[] args) {
        TreeMap<Car, String> carMap = new TreeMap<>();

        Car bugatti = new Car("Bugatti", 80050.0);
        Car swift = new Car("Swift", 305000.0);
        Car mohasis = new Car("Mohasis", 600100.0);
        Car q = new Car("Q", 0.0); // Assuming you meant to add a fourth car with an unspecified price

        carMap.put(bugatti, "Luxury");
        carMap.put(swift, "Economy");
        carMap.put(mohasis, "Premium");
        carMap.put(q, "Unknown");

        // Remove a key-value mapping associated with the greatest key (car with the highest price)
        Car highestPriceCar = carMap.lastKey();
        String associatedValue = carMap.remove(highestPriceCar);

        System.out.println(highestPriceCar + ": " + associatedValue);

        // Get a key-value mapping associated with the greatest key (car with the highest price)
        Map.Entry<Car, String> greatestEntry = carMap.lastEntry();
        System.out.println(greatestEntry.getKey() + ": " + greatestEntry.getValue());
    }
}