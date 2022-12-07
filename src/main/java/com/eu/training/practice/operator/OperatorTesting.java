package com.eu.training.practice.operator;

public class OperatorTesting {
    /*
     * This method used to testing switch
     *
     */
    public void switchTesting(int day){
        switch (day) {
            case 1:
                System.out.println("Showing Month: January");
                break;
            case 2:
                System.out.println("Showing Month: February");
                break;
            case 3:
                System.out.println("Showing Month: March");
                break;
            case 4:
                System.out.println("Showing Month: April");
                break;
            case 5:
                System.out.println("Showing Month: May");
                break;
            case 6:
                System.out.println("Showing Month: June");
                break;
            case 7:
                System.out.println("Showing Month: July");
                break;
            case 8:
                System.out.println("Showing Month: August");
                break;
            case 9:
                System.out.println("Showing Month: September");
                break;
            case 10:
                System.out.println("Showing Month: October");
                break;
            case 11:
                System.out.println("Showing Month: November");
                break;
            case 12:
                System.out.println("Showing Month: December");
                break;
            default:
                System.out.println("Invalid input - Wrong month number.");
                break;
        }
    }
}
