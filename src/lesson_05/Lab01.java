package lesson_05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        int option;
        Map<Integer, String> studentHashMap = new HashMap<>();

        do{
            System.out.println("1. Input student info");
            System.out.println("2. Find Student by ID");
            System.out.println("3. Exit!");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Pls select an option from the menu: ");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("Option 1...");

                    System.out.print("Student Name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Student ID: ");
                    int studentId = scanner.nextInt();

                    studentHashMap.put(studentId, studentName);
                    break;
                case 2:
                    System.out.println("Option 2...");
                    System.out.print("Enter id of the student you're looking for: ");
                    int studentIdToSearch = scanner.nextInt();
                    boolean isStudentExisting = false;
                    for(int key: studentHashMap.keySet()){
                        if(key == studentIdToSearch){
                            isStudentExisting = true;
                            System.out.println("Student found! His/her name is " + studentHashMap.get(key));
                            break;
                        }
                    }
                    if(!isStudentExisting){
                        System.out.println("Student not found!");
                    }
                    break;
                case 3:
                    System.out.println("Bye!");
                default:
                    System.out.println("Non-existing option! Try again.");

            }
        }while(option!=3);
    }
}
