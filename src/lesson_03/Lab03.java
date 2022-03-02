package lesson_03;

public class Lab03 {
    public static void main(String[] args) {
        int[] array = {5,2,-6,0,3,1,4,1,3};

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i ; j++) {
                if(array[i] < array[j]){
                    int temp  = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int num: array
             ) {
            System.out.println(num);
        }
    }
}
