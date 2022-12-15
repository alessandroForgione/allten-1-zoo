package it.alten.domain;

import java.time.LocalDate;

public class Lion extends Mammifero{
    public Lion(String name, String favoriteFood, int age, float weight, float height, LocalDate joinDate, float tail) {
        super(name, favoriteFood, age, weight, height, joinDate, tail);
    }

    @Override
    public String toString() {
        return "Lion {" + super.toString() + "}";
    }
}
