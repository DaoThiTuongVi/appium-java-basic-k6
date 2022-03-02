package lesson_03;

public class Lab01 {
    public static void main(String[] args) {
        int[] array = {4, 9, -4, 334, 90, 4, 0};

        int evenNumberCount = 0;

        for(int number: array){
            if(number % 2 == 0){
                evenNumberCount++;
            }
        }

        System.out.println("Total even numbers: " + evenNumberCount);
        System.out.println("Total odd numbers: " + (array.length - evenNumberCount));
    }

}
