package lesson_09;

import java.security.SecureRandom;

public class Animal {
    private int speed;
    private boolean flyable;
    private String name;

    private Animal(Builder builder){
        this.speed = builder.speed;
        this.flyable = builder.flyable;
        this.name = builder.name;
    }

    public int getSpeed(){
        return this.speed;
    }

    public boolean getFlyable(){
        return this.flyable;
    }

    public String getName(){
        return this.name;
    }

    public static class Builder {
        private int speed;
        private boolean flyable;
        private String name;


        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSpeed(int maxSpeed) {
            this.speed = new SecureRandom().nextInt(maxSpeed);
            return this;
        }

        public Builder withWings(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public Animal build(){
            return new Animal(this);

        }
    }
}
