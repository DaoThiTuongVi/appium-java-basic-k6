package lesson_09;

import java.util.ArrayList;
import java.util.List;

public class AnimalRacingController {
    public static void main(String[] args) {
        List<Animal> allAnimalList = new ArrayList<>();

        Animal.Builder builder = new Animal.Builder();
        Animal eagle = builder.withName("Eagle").withSpeed(100).withWings(true).build();
        Animal falcon =  builder.withName("Falcon").withSpeed(150).withWings(true).build();
        Animal tiger = builder.withName("Tiger").withSpeed(50).withWings(true).build();
        Animal snake =  builder.withName("Snake").withSpeed(20).withWings(true).build();

        allAnimalList.add(eagle);
        allAnimalList.add(falcon);
        allAnimalList.add(tiger);
        allAnimalList.add(snake);



        Animal winner = getWinner(allAnimalList);
        if(winner == null){
            System.out.println("All animals are flyable, so there is no winner for running contest");
        }
        else{
            System.out.printf("Winner is %s with speed %d", winner.getName(), winner.getSpeed());
        }
    }

    public static Animal getWinner(List<Animal> animalList){
        Animal winner = null;

        if(animalList == null || animalList.size() == 0){
            throw  new IllegalArgumentException("Animal list must not be empty or null");
        }

        List<Animal> nonflyableAnimalList = new ArrayList<>();

        for (Animal animal: animalList){
            if(!animal.getFlyable()){
                nonflyableAnimalList.add(animal);
            }
        }

        if(nonflyableAnimalList.size() == 1){
            return nonflyableAnimalList.get(0);
        }

        for(Animal animal: nonflyableAnimalList){
            if(winner == null){
                winner = animal;
            }
            else if(animal.getSpeed() > winner.getSpeed()){
                winner = animal;
            }
        }

        return winner;
    }
}
