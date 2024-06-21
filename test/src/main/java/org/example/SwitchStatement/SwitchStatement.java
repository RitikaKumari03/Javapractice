package org.example.SwitchStatement;
import java.time.DayOfWeek;
import static java.time.DayOfWeek.*;

public class SwitchStatement {
    public int num;
    public enum weekDay {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
    String dayOfWeek;

    public void switchMethod() {

        switch (num) {
            case 1:
                System.out.println("This is number 1");
                break;
            case 2:
                System.out.println("This is number 2");
                break;
            case 3:
                System.out.println("This is number 3");
                break;
            case 4:
                System.out.println("This is number 4");
                break;
            case 5:
                System.out.println("This is number 5");
                break;
            default:
                System.out.println("Number is not present");
                break;
        }
        System.out.println("This is number" + num);
    }
    public void dayWeek() {
        String day;
        switch (num) {
            case 1:
                day = "Mon";
                break;
            case 2:
                day = "Tues";
                break;
            case 3:
                day = "Wed";
                break;
            default:
                day = "Day is not present";
                break;
        }
        System.out.println(day);
    }
    public void enumWeekDay() {
        weekDay[] sh = weekDay.values();
        for (weekDay day : sh) {
            switch (day) {
                case MONDAY:
                    dayOfWeek = String.valueOf(day);
                    System.out.println(dayOfWeek);
                    break;
                case TUESDAY:
                    dayOfWeek = String.valueOf(day);
                    System.out.println(dayOfWeek);
                    break;
                case WEDNESDAY:
                    dayOfWeek = String.valueOf(day);
                    System.out.println(dayOfWeek);
                    break;
                default:
                    System.out.println("The Day is not present");
                    break;
            }
        }
    }
}






