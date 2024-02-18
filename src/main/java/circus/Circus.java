package circus;

import circus.animal.*;
import circus.stuff.Cage;
import circus.stuff.Cannon;
import circus.stuff.Equipment;
import circus.stuff.Ladder;

import java.util.ArrayList;
import java.util.Arrays;

public class Circus {
    private static Animal[] animals = {
            new Duck("Drake"),
            new Parrot("Polly"),
            new Tiger("Tai Lung")
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateAssetValue(Asset[] assets) {
        int total = 0;
        for (Asset a : assets) {
            if (a.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + a.getValue());
                continue;
            }
            total += a.getValue();
            System.out.println("Adding item value: " + a.getValue());
        }
        return total;
    }

    private static void printAllAnimals(ArrayList<Animal> animalArrayList) {
        for (Animal a : animalArrayList) {
            System.out.println(a);
        }
    }

    private static void printCircusSize(ArrayList<Animal> animalArrayList) {
        for (Animal a : animalArrayList) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {

        System.out.println("Number of animals: " + animals.length);
        ArrayList<Animal> animalArrayList = new ArrayList<>(Arrays.asList(animals));


        printCircusSize(animalArrayList);

        animalArrayList.add(new Duck("Louie"));
        Elephant strongOne = new Elephant("StrongOne");;
        Parrot andy = new Parrot("Andy");

        animalArrayList.add(strongOne);
        animalArrayList.add(andy);

        Cage<Duck> duckCage = new Cage<>();
        Duck duck = new Duck("Dewey");
        duckCage.lockUp(duck);
        Cage<Parrot> parrotCage = new Cage<>();
        Parrot parrot = new Parrot("Perry");
        parrotCage.lockUp(parrot);




        System.out.println("Strong one is at position: " + animalArrayList.indexOf(strongOne));

        System.out.println("Total value of animals: " + calculateAssetValue(animals));
        System.out.println("Total value of equipments: " + calculateAssetValue(equipments));
    }
}
