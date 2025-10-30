// Write a program that takes the row & columns input from the user to populate a 2D array and then prints the array.

import java.util.Scanner;

public class MultidimensionalArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Write your code here
        System.out.println("--- 2D Array Creation ---");
        
        System.out.print("How many rows do you want (e.g., 3)? ");
        int rows = scanner.nextInt();
        
        System.out.print("How many columns do you want (e.g., 4)? ");
        int cols = scanner.nextInt();
        
        int[][] matrix = new int[rows][cols];
                
        System.out.println("\n--- Entering Array Elements ---");
        
        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < cols; j++) {
                
                System.out.print("Enter number for Row " + i + ", Column " + j + ": ");
                
                matrix[i][j] = scanner.nextInt();
            }
        }
                
        System.out.println("\n--- Your Final 2D Array ---");
        
        for (int i = 0; i < rows; i++) {
            
            
            for (int j = 0; j < cols; j++) {
                
                System.out.print(matrix[i][j] + "\t"); 
            }
            
            System.out.println();
        }
        scanner.close();
    }
}
