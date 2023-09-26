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

    }
}