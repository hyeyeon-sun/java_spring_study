package practice;

public class DogTest {
    public static void main (String args[]){
        Dog[] dogs = new Dog[5];
        dogs[0] = new Dog("1", "1");
        dogs[1] = new Dog("2", "2");
        dogs[2] = new Dog("3", "3");
        dogs[3] = new Dog("4", "4");
        dogs[4] = new Dog("5", "5");

        for (int i = 0; i<5; i++){
            System.out.println(dogs[i].showDogInfo());
        }

        for (Dog dog: dogs){
            System.out.println(dog.showDogInfo());
        }
    }
}
