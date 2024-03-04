package org.example;


public class Mane {

   void getAnimalVoice (Animal animal) {animal.voice(); }

   public static void main (String[] args) {
      Mane animalWorld = new Mane();
      animalWorld.getAnimalVoice(new Cat());
      animalWorld.getAnimalVoice(new Dog());
   }
}