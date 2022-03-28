package lesson_08.lab_02;

import java.security.SecureRandom;

public class Animal {
    private int maxSpeed;
    private int currentSpeed;

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int speed() {
        int randomSpeed = new SecureRandom().nextInt(maxSpeed);
        return randomSpeed;
    }

}
