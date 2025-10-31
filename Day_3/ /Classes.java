// // Write a program that takes input from the user and creates an object of a class named 'Person'. 
// The 'Person' class should have two member variables: 'name' and 'age'. The program should prompt the user to enter their name and age, 
//   create a 'Person' object with the entered values, and then display the name and age of the person.

import java.util.Scanner;

public class SumOfDigits {
    // Recursive function to find sum of digits
    public static int sumOfDigits(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = sumOfDigits(num);
        System.out.println(sum);
        sc.close();
    }
}
