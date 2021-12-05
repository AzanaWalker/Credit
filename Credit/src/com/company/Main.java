package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter card number: ");
        long cardnumber;
        cardnumber = keyboard.nextLong();
        System.out.println("Card number: " + cardnumber);
        int sum = 0;

        String typeofcard = String.valueOf(cardnumber);

        if (typeofcard.startsWith("3")) {
            System.out.print("AMEX");
        }
        else if (typeofcard.startsWith("4")) {
            System.out.print("VISA");

        }
        else if (typeofcard.startsWith("5")) {
            System.out.print("MASTERCARD");
        }
        else {
            System.out.print("INVALID");
        }
        
        for (int i = cardnumber.length() - 2)
        while (cardnumber > 0)

            cardnumber = cardnumber / 10;

        if (cardnumber % 2 != 0) {
            cardnumber *= 2;
        }

        if (cardnumber > 9) {
            cardnumber = (cardnumber % 10) + 1;
        }
        else
            cardnumber *= 1;

        sum += cardnumber;

        if (sum % 10 == 0) {
            System.out.print("- card is valid");
        }
        else
            System.out.print("- card is invalid");
    }
}