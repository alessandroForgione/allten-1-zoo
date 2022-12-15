package it.alten.domain;

import java.time.LocalDate;

public abstract class Animal{

     Animal(String name, String favoriteFood, int age, float weight, float height, LocalDate joinDate) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.joinDate = joinDate;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", favoriteFood='" + favoriteFood + '\'' +
                ", age='" + age + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", joinDate=" + joinDate +
                '}';
    }

    private String name, favoriteFood;
    private float weight, height;
    private int age;
    private LocalDate joinDate;
}
