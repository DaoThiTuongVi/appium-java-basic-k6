package lesson_03;

public class Lab04 {
    public static void main(String[] args){
        int[] array1 = {5,8,19};
        int[] array2 = {-4,0,0};

        int[] array = new int[array1.length + array2.length];
        int index = 0;

        for(int num: array1){
            array[index] = num;
            index++;
        }
        for(int num: array2){
            array[index] = num;
            index++;
        }

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
