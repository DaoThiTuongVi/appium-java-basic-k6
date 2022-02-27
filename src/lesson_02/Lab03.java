package lesson_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double idealWeight;
        float minBmiOfNormalWeight = 18.5F;
        float maxBmiOfNormalWeight = 24.9F;
        float maxBmiOfOverWeight = 29.9F;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.print("Please enter your weight in kilograms: ");
        float weight = scanner.nextFloat();
        System.out.print("Please enter your height in metres: ");
        float height = scanner.nextFloat();

        double bmi = weight/Math.pow(height,2);

        if(bmi < minBmiOfNormalWeight){
            System.out.println("Underweight");
            idealWeight = minBmiOfNormalWeight * Math.pow(height,2);
            System.out.println("We advice you to gain " + decimalFormat.format(idealWeight-weight) + " kilograms");
        }else if(bmi <= maxBmiOfNormalWeight) {
            System.out.println("Normal weight");
        }else if(bmi <= maxBmiOfOverWeight){
            System.out.println("Overweight");
            idealWeight = maxBmiOfNormalWeight * Math.pow(height,2);
            System.out.println("We advice you to lose " + decimalFormat.format(weight-idealWeight) + " kilograms");
        }else{
            System.out.println("Obesity");
            idealWeight = maxBmiOfNormalWeight * Math.pow(height,2);
            System.out.println("We advice you to lose " + decimalFormat.format(weight-idealWeight) + " kilograms");
        }

    }

}
