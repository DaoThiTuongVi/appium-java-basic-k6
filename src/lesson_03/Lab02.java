package lesson_03;

public class Lab02 {
    public static void main(String[] args) {
        int[] array = {48,6,7,3,-9,0,2,2};

        int minNumber = array[0];
        int maxNumber = array[0];

        for (int i = 1; i < array.length; i++) {
            if(array[i] > maxNumber){
                maxNumber = array[i];
            }else if(array[i] < minNumber){
                minNumber = array[i];
            }
        }

        System.out.println("Max number: " + maxNumber);
        System.out.println("Min number: " + minNumber);
    }
}
