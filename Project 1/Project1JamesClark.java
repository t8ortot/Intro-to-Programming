package project1.jamesclark;

import java.util.Scanner;

/**
 * Program that checks if user is above, below, or at their maximum
 * heart rate.
 *
 * @author James Clark
 * @version 9/15/16
 */
public class Project1JamesClark {

    /**
     * Compute the user's maximum heart rate
     * @param Age User's age
     * @param HR User's Heart Rate
     * @param Max Formula for maximum heart rate
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int Age = input.nextInt(); //User's input for age.

        System.out.print("Please enter your current heart rate: ");
        int HR = input.nextInt(); //User's input for heart rate.

        int Max = 220 - Age; //Calculating the user's maximum heart rate.
        System.out.println("Your maximum heart rate is: " + Max);

        if (HR == Max) { //Check if heart rate is equal to the maximum.
            System.out.println("Your heart rate is at the maximum!");
        
        } else if (HR > Max) { //Check if heart rate is above the maximum.
            System.out.println("Your heart rate is above the maximum!");
        
        } else if (HR < Max) { //Check if heart rate is below the maximum.
            System.out.println("Your heart rate is below the maximum.");

        }

    }

}