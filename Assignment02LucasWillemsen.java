/*
* Author: Lucas Willemsen
* Course: CST8116 - Introduction to Computer Programming
* Assignment 2
* Date: Fall 2025
*/
package assignment2;
import java.util.Scanner;
public class Assignment02LucasWillemsen {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String studentName = scnr.nextLine(); // reads the full name (including spaces)

        int index = 0;
        int asciiSum = 0;

        // ERROR 1: studentName.length is invalid; .length() is the correct method for String length.
        // FIXED: Changed studentName.length to studentName.length().
        // ERROR 2: Infinite loop: index never increments, potentially out-of-bounds.
        // FIXED: Added index++ to increment index each iteration and changed condition to '<' to prevent out-of-bounds.
        // While loop to add up ASCII values
        while (index < studentName.length()) {
            char ch = studentName.charAt(index); // get character at index
            asciiSum += (int) ch; // add its ASCII value
            index++; // increment index
        }

        System.out.println("Student Name: " + studentName);
        System.out.println("Sum of ASCII values: " + asciiSum);
        // Print your name (Lucas Willemsen)
        System.out.println("\nEnd of program. Stay cool! Program by Lucas Willemsen");
        // ERROR 3: Scanner resource isn't closed.
        // FIXED: Added scnr.close() to close the Scanner.
        scnr.close();
    }
}

