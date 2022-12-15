package it.alten.conroller;

import it.alten.domain.*;

import java.util.ArrayList;
import java.util.List;

public class ZooController {

    public ZooController(){}
    public ZooController(List<Animal> zoo){
        this.zoo = zoo;
    }
    public void addAnimal(Animal animal){
        zoo.add(animal);
    }

    public void showAnimals(){
        for(Animal animal: zoo){
            System.out.println(animal.toString());
        }
    }

    public ZooController filterAnimalsByMammifero(){
        List<Animal> filterZoo = new ArrayList<>();
        for(Animal a: zoo){
            if(a instanceof Mammifero){
                filterZoo.add(a);
            }
        }
        return new ZooController(filterZoo);
    }

    public ZooController filterAnimalsVolatile(){
        List<Animal> filterZoo = new ArrayList<>();
        for(Animal a: zoo){
            if(a instanceof Volatile){
                filterZoo.add(a);
            }
        }
        return new ZooController(filterZoo);
    }

    public ZooController filterAnimalsToTiger(){
        List<Animal> filterZoo = new ArrayList<>();
        for(Animal a: zoo){
            if(a instanceof Tiger){
                filterZoo.add(a);
            }
        }
        return new ZooController(filterZoo);
    }

    public ZooController filterAnimalsToLion(){
        List<Animal> filterZoo = new ArrayList<>();
        for(Animal a: zoo){
            if(a instanceof Lion){
                filterZoo.add(a);
            }
        }
        return new ZooController(filterZoo);
    }

    public ZooController filterAnimalsToEagle(){
        List<Animal> filterZoo = new ArrayList<>();
        for(Animal a: zoo){
            if(a instanceof Eagle){
                filterZoo.add(a);
            }
        }
        return new ZooController(filterZoo);
    }

    public ZooController filterAnimalsByMajorWeight(){
        List<Animal> filterZoo = new ArrayList<>();
        Animal maxAnimal = zoo.get(0);

        for(Animal animal: zoo) {
            if (animal.getWeight() >= maxAnimal.getWeight()) {
                maxAnimal = animal;
                filterZoo.clear();
                filterZoo.add(animal);
            }
        }
        return new ZooController(filterZoo);
    }

    public ZooController filterAnimalsByMinorWeight(){
        List<Animal> filterZoo = new ArrayList<>();
        Animal minAnimal = zoo.get(0);

        for(Animal animal: zoo) {
            if (animal.getWeight() <= minAnimal.getWeight()) {
                minAnimal = animal;
                filterZoo.clear();
                filterZoo.add(animal);
            }
        }
        return new ZooController(filterZoo);
    }

    public ZooController filterAnimalsByMajorHeight(){
        List<Animal> filterZoo = new ArrayList<>();
        Animal maxAnimal = zoo.get(0);

        for(Animal animal: zoo) {
            if (animal.getHeight() >= maxAnimal.getHeight()) {
                maxAnimal = animal;
                filterZoo.clear();
                filterZoo.add(animal);
            }
        }
        return new ZooController(filterZoo);
    }

    public ZooController filterAnimalsByMinorHeight(){
        List<Animal> filterZoo = new ArrayList<>();
        Animal minAnimal = zoo.get(0);

        for(Animal animal: zoo) {
            if (animal.getHeight() <= minAnimal.getHeight()) {
                minAnimal = animal;
                filterZoo.clear();
                filterZoo.add(animal);
            }
        }
        return new ZooController(filterZoo);
    }

    public ZooController filterAnimalsByMajorTail(){
        List<Animal> filterZoo = new ArrayList<>();
        int max = 0;

        for(Animal animal: zoo){
            if(animal instanceof Mammifero){
                if(((Mammifero) animal).getTail() >= max){
                    max = (int) ((Mammifero) animal).getTail();
                    filterZoo.clear();
                    filterZoo.add(animal);
                }
            }
        }
        return new ZooController(filterZoo);
    }

    public ZooController filterAnimalsByMajorWings(){
        List<Animal> filterZoo = new ArrayList<>();
        int max = 0;

        for(Animal animal: zoo){
            if(animal instanceof Volatile){
                if(((Volatile) animal).getWings() >= max){
                    max = (int) ((Volatile) animal).getWings();
                    filterZoo.clear();
                    filterZoo.add(animal);
                }
            }
        }
        return new ZooController(filterZoo);
    }

    private List<Animal> zoo = new ArrayList<>();
}
