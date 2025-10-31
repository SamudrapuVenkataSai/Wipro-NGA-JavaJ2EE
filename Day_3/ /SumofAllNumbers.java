// Find the sum of the digits using recursion
// Input:4246
// Output:16
// Explanation:4+2+4+6 is 16
// Input:-32
// Output:5
// Explanation:3+2
// Input value ranges in the range of Integer data type.

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
