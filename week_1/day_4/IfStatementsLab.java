package week_1.day_4;

/*
 * If Statements Lab
 * 
 * OBJECTIVE: Practice conditional statements (if, else if, else)
 * 
 * INSTRUCTIONS:
 * 1. Use if statements to make decisions
 * 2. Practice with comparison operators (==, !=, <, >, <=, >=)
 * 3. Combine conditions with logical operators (&&, ||, !)
 * 4. Handle different scenarios with else if and else
 */

import java.util.Scanner;

public class IfStatementsLab {
    public static void main(String[] args) {
        System.out.println("=== If Statements Lab ===\n");
        
        Scanner scanner = new Scanner(System.in);
        
        // TODO: Ask user for their age and determine life stage
        // Categories: Child (under 13), Teenager (13-19), Adult (20-59), Senior (60+)
        
        System.out.println("\n=== Grade Calculator ===");
        
        // TODO: Ask for a test score (0-100) and assign letter grade
        // A: 90-100, B: 80-89, C: 70-79, D: 60-69, F: below 60
        
        System.out.println("\n=== Number Comparison ===");
        
        // TODO: Ask for two numbers and compare them
        // Tell the user which number is greater, or if they're equal
        
        System.out.println("\n=== Challenge: Login System ===");
        
        // TODO: Create a simple login system
        // Set up correct username and password
        String correctUsername = "admin";
        String correctPassword = "password123";
        
        // TODO: Ask user for username and password
        // Check if both are correct and provide appropriate feedback
        // Hint: Use .equals() method to compare strings
        // Hint: Use && (and) operator to check both conditions
        
        scanner.close();
    }
} 