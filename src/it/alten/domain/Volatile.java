package it.alten.domain;

import java.time.LocalDate;

public abstract class Volatile extends Animal {
    Volatile(String name, String favoriteFood, int age, float weight, float height, LocalDate joinDate, float wings) {
        super(name, favoriteFood, age, weight, height, joinDate);
        this.wings = wings;
    }
    public float getWings() {
        return wings;
    }

    @Override
    public String toString() {
        return super.toString() + " Volatile{" +
                "wings=" + wings +
                '}';
    }

    private float wings;
}
