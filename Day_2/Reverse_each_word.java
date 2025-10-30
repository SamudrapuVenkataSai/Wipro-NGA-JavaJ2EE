// // Write a function to reverse each word in a string.
// // Description :- A method has to be created that takes a string as input and 
// extracts each word from that string and then reverse each word individually and gives the output as a reversed string. 

public class WordReverser {

    public static String reverseEachWord(String inputString) {
        
        // 1. Split the input string into an array of words using space as the delimiter
        String[] words = inputString.split(" ");
        
        // Use a StringBuilder to efficiently build the final reversed string
        StringBuilder reversedString = new StringBuilder();
        
        // 2. Iterate through each word in the array
        for (String word : words) {
            
            StringBuilder reversedWord = new StringBuilder(word);
            
            //    b. Use the built-in reverse() method
            reversedWord.reverse();
            
            // 4. Append the reversed word to the final result
            reversedString.append(reversedWord).append(" "); // Append a space after the word
        }
    
        return reversedString.toString().trim();
    }

    public static void main(String[] args) {
        
        // Example 1
        String input1 = "great learning";
        String output1 = reverseEachWord(input1);
        System.out.println("Input: " + input1);
        System.out.println("Output: " + output1); // Expected: taerg gnirnrael

        System.out.println("-------------------------");
        
        // Example 2
        String input2 = "hello guys how are you";
        String output2 = reverseEachWord(input2);
        System.out.println("Input: " + input2);
        System.out.println("Output: " + output2); // Expected: olleh syug woh era uoy
    }
}
