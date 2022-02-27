package lesson_02;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your weight in kilograms: ");
        float weight = scanner.nextFloat();
        System.out.print("Please enter your height in metres: ");
        float height = scanner.nextFloat();

        double bmi = weight/Math.pow(height, 2);
        System.out.println("BMI: " + bmi);

        if(bmi < 18.5){
            System.out.println("Underweight");
        }else if(bmi <=24.9) {
            System.out.println("Normal weight");
        }else if(bmi <=29.9){
            System.out.println("Overweight");
        }else{
            System.out.println("Obesity");
        }
    }
}
