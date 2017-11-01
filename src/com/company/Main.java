/**
 * Daniel Plotzke
 * Testing: Ran two times, both times it worked like a charm.
 */

package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> ageArrayList = new ArrayList<>();

        // iterates loop 10 times (to get 10 ages)
        // Prompts user to enter age (1-10), then stores that value into the array list.
        for (int iterations = 0; iterations < 10; iterations++)
        {
            // The try and catch is for ending the program if the user enters a fractional input. (ex. not an int)
            try
            {
                int ageNumber = iterations + 1; // Starts at 1, ends after 10.
                System.out.println("Enter age " + ageNumber + " of 10: ");
                ageArrayList.add(in.nextInt());
            }
            catch (java.util.InputMismatchException exception)
            {
                System.out.println("Error: Fractional age.");
                return;
            }
        }
        // Adds up all of the values in the array list.
        double totalAgeArrayList = 0;
        for (double element : ageArrayList)
        {
            totalAgeArrayList = totalAgeArrayList + element;
        }
        // Averages out the age values in the ageArrayList.
        int numberAges = 10;
        double averageAge = totalAgeArrayList / numberAges;
        System.out.println(averageAge);
    }
}
