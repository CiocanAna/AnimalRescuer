package org;

public class App {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.age = 3;
        animal.name = "rozi";


        AnimalActivity animalActivity = new AnimalActivity();
        animalActivity.name = "ping pong";


        AnimalFood animalFood = new AnimalFood();
        animalFood.name = " roz";

        Rescuer rescuer = new Rescuer();
        rescuer.name = " ionci";

        Vet vet = new Vet();
        vet.name = " baci";


    }
}
