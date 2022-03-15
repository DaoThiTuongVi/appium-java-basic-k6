package lesson_06;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        String myPassword = "password123";

        Scanner scanner = new Scanner(System.in);

        int totalAttempts = 0;
        boolean isPasswordCorrect = false;

        while(totalAttempts < 3) {
            System.out.print("Enter your password: ");
            String enteredPassword = scanner.nextLine();

            if (enteredPassword.equals(myPassword)) {
                isPasswordCorrect = true;
                break;
            }

            totalAttempts++;
        }

        if(isPasswordCorrect){
            System.out.println("Correct password!");
        }else{
            System.out.println("You have entered wrong password 3 times!");
        }
    }
}
