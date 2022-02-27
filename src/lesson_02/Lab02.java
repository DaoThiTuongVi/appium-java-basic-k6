package lesson_02;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        int remainder = number%2;

        if(remainder == 0){
            System.out.println("It's an even number");
        }else {
            System.out.println("It's an odd number");
        }
        
    }
}
