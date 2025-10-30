// You are given a string s. In one move you can change any character to another character.

// You have to make a string which consists of the same character. Find the minimum move to do this task.

// Constraints:

// 1 <= s.length <= 1000

// s consists only of lowercase characters .

import java.util.Scanner;
import java.lang.Math; 

public class StringUnify {

    public static int findMinimumMoves(String s) {
        
        int[] charCounts = new int[26];
        
        for (char c : s.toCharArray()) {
            charCounts[c - 'a']++;
        }
        
        int maxCount = 0;
        
        for (int count : charCounts) {
            maxCount = Math.max(maxCount, count);
        }
        
        int totalLength = s.length();
        int minimumMoves = totalLength - maxCount;
        
        return minimumMoves;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the string (lowercase only): ");
        String inputString = scanner.nextLine();
        
        if (inputString.length() == 0) {
            System.out.println("Minimum moves: 0 (Empty string already unified)");
        } else {
            int result = findMinimumMoves(inputString);
            System.out.println("Output: " + result);
        }
        
        scanner.close();
    }
}
