package lesson_08.lab_02;

public class Lab02 {
    /*
    Racing animal simple version*
Horse: Max 75 km/h
Tiger: Max 100 Km/h
Dog: Max 60 KM/h*
Create an Animal class with a method speed() which return a random speeds
Create 3 objects for those 3 animal type
Run and see which animal is winner for racing
Bonus: Default name with Class variable
Format: Winner is <Animal name>, with speed: <speed>
Hints:* * Class name can get from: object.getClass().getSimpleName();
int randomSpeed = new SecureRandom().nextInt(50);
     */
    public static void main(String[] args) {
        Dog dog = new Dog();
        Horse horse = new Horse();
        Tiger tiger = new Tiger();

        dog.setMaxSpeed(60);
        horse.setMaxSpeed(75);
        tiger.setMaxSpeed(100);

        int currentDogSpeed = dog.speed();
        int currentHorseSpeed = horse.speed();
        int currentTigerSpeed = tiger.speed();

        dog.setCurrentSpeed(currentDogSpeed);
        horse.setCurrentSpeed(currentHorseSpeed);
        tiger.setCurrentSpeed(currentTigerSpeed);

        Animal[] animals = {dog, horse, tiger};

        Animal winner = animals[0];

        for (int i=1; i<animals.length; i++){
            if(winner.getCurrentSpeed() < animals[i].getCurrentSpeed()){
                winner = animals[i];
            }
        }

        System.out.println("Winner is "+ winner.getClass().getSimpleName() +", with speed: " + winner.getCurrentSpeed());
    }


}
