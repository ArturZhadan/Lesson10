package com.home;

public class Main {

    public static void main(String[] args) {
        int minimumNumber = 1;
        int maximumNumber = 7;
        int randomNumber = minimumNumber + (int)(Math.random() * maximumNumber);
        System.out.println(randomNumber);
        switch (randomNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
