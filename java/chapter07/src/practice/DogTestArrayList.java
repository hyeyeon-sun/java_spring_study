package practice;

import java.util.ArrayList;

public class DogTestArrayList {
    public static void main (String args[]){
        ArrayList<Dog> dogs = new ArrayList<Dog>();

        dogs.add(new Dog("1", "1"));
        dogs.add(new Dog("2", "2"));
        dogs.add(new Dog("3", "3"));
        dogs.add(new Dog("4", "4"));
        dogs.add(new Dog("5", "5"));

        for (Dog dog:dogs){
            System.out.println(dog.showDogInfo());
        }
    }
}
