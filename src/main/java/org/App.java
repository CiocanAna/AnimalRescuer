package org;

public class App {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.age = 3;
        animal.name = "rossie";
        animal.color = "brown"


        AnimalActivity animalActivity = new AnimalActivity();
        animalActivity.name = "ping pong";


        AnimalFood animalFood = new AnimalFood();
        animalFood.name = "bobite";

        Rescuer rescuer = new Rescuer();
        rescuer.name = " Andrei";

        Vet vet = new Vet();
        vet.name = " dr.CristianMuresan";


    }
}
