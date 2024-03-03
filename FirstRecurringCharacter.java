/* First Recurring Character 
* Objective: Find the first character that appears more than once in a string.
* Explanation: Here, you learn to use a set to efficiently track which characters
* have been seen as you iterate through a string. This problem highlights the importance
* of understanding how to iterate through sequences and the usefulness of quick lookup containers like sets.*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RecurringCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a word: "); //prompting user to enter a word
        String word = scanner.nextLine();
        Character letter = checkInput(word); //result of checked input

        if (letter != null) {
            System.out.println("\nFirst repeated letter: " + letter); //if input has repeated letter
        } else {
            System.out.println("\nNo Repeated Letter"); //if input has no repeated letter (null)
        }
    }

    //method to check if user input has repeated character
    public static Character checkInput(String input) {
        Set<Character> charSet = new HashSet<>(); //creating set

        //iterating through each letter in the input
        for (char character : input.toCharArray()) {
            if (charSet.contains(character)) {
                return character;
            } else {
                charSet.add(character); //if letter is not repeated, add the character to the set
            }
        }
        return null;
    }
}
