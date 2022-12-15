package it.alten.tester;

import it.alten.conroller.ZooController;
import it.alten.domain.*;

import java.time.LocalDate;

public class TesterZoo {
    public static void main(String[] args) {

        Animal l = new Lion("Bobby", "carne umana", 12,76, 176, LocalDate.now(), 20);
        Animal l1 = new Lion("Jo", "carne umana", 9, 56, 130, LocalDate.now(), 15);
        Animal t = new Tiger("Gallo", "se stesso", 7, 60, 140, LocalDate.now(), 14);
        Animal t1 = new Tiger("Alone", "se stesso", 7, 58, 132, LocalDate.now(), 22);
        Animal e = new Eagle("Falco", "banana", 4, 50, 40, LocalDate.now(), 30);
        Animal e1 = new Eagle("Rojer", "mirtilli", 7, 53, 41, LocalDate.now(), 33);

        ZooController z = new ZooController();
        z.addAnimal(l);
        z.addAnimal(l1);
        z.addAnimal(t);
        z.addAnimal(t1);
        z.addAnimal(e);
        z.addAnimal(e1);

        System.out.println("\nTIGRE PIU' ALTO E BASSO");
        z.filterAnimalsToTiger().filterAnimalsByMajorHeight().showAnimals();
        z.filterAnimalsToTiger().filterAnimalsByMinorHeight().showAnimals();

        System.out.println("\nLEONE PIU' ALTO E BASSO");
        z.filterAnimalsToLion().filterAnimalsByMajorHeight().showAnimals();
        z.filterAnimalsToLion().filterAnimalsByMinorHeight().showAnimals();

        System.out.println("\nACQUILA PIU' ALTO E BASSO");
        z.filterAnimalsToEagle().filterAnimalsByMajorHeight().showAnimals();
        z.filterAnimalsToEagle().filterAnimalsByMinorHeight().showAnimals();

        System.out.println("\nTIGRE PIU' PESANTE E LEGGERA");
        z.filterAnimalsToTiger().filterAnimalsByMajorWeight().showAnimals();
        z.filterAnimalsToTiger().filterAnimalsByMinorWeight().showAnimals();

        System.out.println("\nLEONE PIU' PESANTE E LEGGERO");
        z.filterAnimalsToLion().filterAnimalsByMajorWeight().showAnimals();
        z.filterAnimalsToLion().filterAnimalsByMinorWeight().showAnimals();

        System.out.println("\nACQUILA PIU' PESANTE E LEGGERA");
        z.filterAnimalsToEagle().filterAnimalsByMajorWeight().showAnimals();
        z.filterAnimalsToEagle().filterAnimalsByMinorWeight().showAnimals();

        System.out.println("\nMAMMIFERO CON LA CODA PIU' LUNGA");
        z.filterAnimalsByMajorTail().showAnimals();

        System.out.println("\nVOLATILE CON MAGGIOR APERTURA ALARE: ");
        z.filterAnimalsByMajorWings().showAnimals();
    }


}