package it.alten.domain;

import java.time.LocalDate;

public class Eagle extends Volatile{
    public Eagle(String name, String favoriteFood, int age, float weight, float height, LocalDate joinDate, float wings) {
        super(name, favoriteFood, age, weight, height, joinDate, wings);
    }

    @Override
    public String toString() {
        return "Eagle {" + super.toString() + "}";
    }
}
