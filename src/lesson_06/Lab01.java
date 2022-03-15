package lesson_06;

public class Lab01 {
    public static void main(String[] args) {
        String durationStr = "2hrs and 5 minutes";

        String[] array = durationStr.split("and");

        int hourNumber = Integer.parseInt(array[0].replaceAll("[^0-9]", ""));
        int minuteNumber = Integer.parseInt(array[1].replaceAll("[^0-9]", ""));

        int totalMinutes = (hourNumber * 60) + minuteNumber;
        System.out.println("Total minutes: " + totalMinutes);
    }
}
