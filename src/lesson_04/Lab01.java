package lesson_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        int option;
        Scanner scanner;
        List<Integer> arrayList = new ArrayList<>();
        boolean isContinuing = true;


        do {
            System.out.println("=====MENU======");
            System.out.println("1. Add number into ArrayList");
            System.out.println("2. Print numbers");
            System.out.println("3. Get maximum number");
            System.out.println("4. Get minimum number");
            System.out.println("5. Enter a number to find its index");
            System.out.println("6. Exit");
            System.out.println("===============");

            scanner = new Scanner(System.in);
            System.out.print("Select an option: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter a number to add to arraylist: ");
                    int numberToAdd = scanner.nextInt();
                    arrayList.add(numberToAdd);
                    break;
                case 2:
                    for (int item : arrayList) {
                        System.out.println(item);
                    }
                    break;
                case 3:
                    int maxNumber = arrayList.get(0);
                    for (int i = 1; i < arrayList.size(); i++) {
                        if (maxNumber < arrayList.get(i)) {
                            int temp = maxNumber;
                            maxNumber = arrayList.get(i);
                            arrayList.set(i, maxNumber);
                        }
                    }
                    System.out.println("Maximum number: " + maxNumber);
                    break;
                case 4:
                    int minNumber = arrayList.get(0);
                    for (int i = 1; i < arrayList.size(); i++) {
                        if(minNumber > arrayList.get(i)){
                            int temp = minNumber;
                            minNumber = arrayList.get(i);
                            arrayList.set(i, minNumber);
                        }
                    }
                    System.out.println("Minimum number: " + minNumber);
                    break;
                case 5:
                    System.out.print("Enter the number you wanna find its index:");
                    int numberIndex = -1;
                    int numberToFind = scanner.nextInt();

                    for(int i=0; i<arrayList.size(); i++){
                        if(numberToFind == arrayList.get(i)){
                            numberIndex = i;
                            break;
                        }
                    }

                    if(numberIndex != -1){
                        System.out.println("Found your number. Its index is: " + numberIndex);
                    }else{
                        System.out.println("The number is not found");
                    }
                    break;
                default:
                    System.out.println("Non-existing option! Bye!");
                    isContinuing  = false;
            }

        } while (isContinuing);

    }
}





