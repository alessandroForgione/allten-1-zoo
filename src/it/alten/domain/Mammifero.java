package it.alten.domain;

import java.time.LocalDate;

public abstract class Mammifero extends Animal {
    Mammifero(String name, String favoriteFood, int age, float weight, float height, LocalDate joinDate,  float tail) {
        super(name, favoriteFood, age, weight, height, joinDate);
        this.tail = tail;
    }
    public float getTail() {
        return tail;
    }

    @Override
    public String toString() {
        return super.toString() + " Mammifero{" +
                "tail=" + tail +
                '}';
    }
    private float tail;

}
