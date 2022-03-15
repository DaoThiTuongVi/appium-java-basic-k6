package lesson_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab03 {
    public static void main(String[] args) {
        String myStr = "100 minutes";

        char[] myStrArray = myStr.toCharArray();
        List<Character> numberArrayList = new ArrayList<>();

        for(char c : myStrArray){
            if(Character.isDigit(c)){
                numberArrayList.add(c);
            }
        }

        String number = "";
        for(char c: numberArrayList){
            number = number + c;
        }

        System.out.println("The number is: " + number);
    }
}
