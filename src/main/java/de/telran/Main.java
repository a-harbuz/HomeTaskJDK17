package de.telran;

public class Main {
    public static void main(String[] args) {

        int myDate = 345;
        int myPlace1 = myDate/100;
        int myPlace2 = (myDate/10)%10;
        int myPlace3 = myDate%10;

        System.out.println("Place1 = "+myPlace1);
        System.out.println("Place2 = "+myPlace2);
        System.out.println("Place3 = "+myPlace3);

        System.out.println("isWeekDayV2 = "+isWeekDayV2("MON"));

        int count = 2;
        String status = switch (count){
            case 0 -> "A";
            case 1, 2 -> "B";
            default -> "3";

        };
        System.out.println("Status = "+status);
    }


    public static Boolean isWeekDayV2 (String day)
    {
/*        Boolean result = switch(day) {
            case "MON", "TUE", "WED", "THUR", "FRI" ->
            {
                System.out.println("It is WeekDay");
                yield true;
            }
            case "SAT", "SUN" ->
            {
                System.out.println("It is Weekend");
                yield false;
            }
            default -> return false;*/
        return false;
    }

}