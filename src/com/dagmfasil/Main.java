package com.dagmfasil;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random r = new Random();

        int rand1; //random number 1
        int rand2; // random number 2

        int sum; //sum of the two randomly generated numbers (rand1 & rand2)
        int score = 0; // sum of current score and sum(rand1 + rand2)

        String response; //User response from scanner class


        while (score < 100) {

            System.out.println("Do you want to play?");

            response = scanner.nextLine();

            if (response.equalsIgnoreCase("yes")) {

                rand1 = r.nextInt(6) + 1;
                rand2 = r.nextInt(6) + 1;

                //sum = rand1 + rand2;
                //score = score + sum;

                System.out.println("Current score: " + score);
                System.out.println("Rolls: " + rand1 + " & " + rand2);

                if ((rand1 != 1) && (rand2 != 1)) {
                    sum = rand1 + rand2;
                    score = score + sum;

                } else if ((rand1 == 1) || (rand2 == 1)) {
                    score = score + 0;
                    System.out.println("Your rolls: " + rand1 + " & " + rand2);
                    System.out.println("No score change because 1 is thrown on either die" + " and score is: " + score);

                } else if ((rand1 == 1) && (rand2 == 1)) {
                    System.out.println("You hit big with two 1's");
                    score = score + 25;
                    System.out.println(score);
                }

            } else if (response.equalsIgnoreCase("no")) {
                System.out.println("Bye! Your response was no.");
                System.exit(0);
            }


        }
    }
}
