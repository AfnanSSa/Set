/* Find the Duplicate Number
 * Objective: Identify the duplicate number in an array with n+1 integers, each between 1 and n.

 * Explanation: This problem teaches you how to use data structures like arrays and sets to track
 * seen numbers, and how to apply logical conditions to identify duplicates. It's a good exercise
 * in understanding array traversal and set operations.

 * Analogy: Imagine you're throwing a huge party, and you've invited exactly n guests. Each guest
 * receives an invite with a unique number from 1 to n. But, oops! Due to a mix-up, one extra guest
 * sneaks in with a duplicate invite number. Your job is to find out which number got copied.*/

import java.util.*;

public class DuplicateNumbers {
    public static void main(String[] args) {
        //creating an array
        int[] numArray = {1, 2, 3, 4, 5, 6, 7};
        //creating sets
        Set<Integer> numSet = new HashSet<>(); //a set to contain the array elements
        Set<Integer> duplicates = new HashSet<>(); //set to contain duplicated numbers

        //adding array elements to the set
        for (int number : numArray) { //for each element in the array
            if (!numSet.add(number)) {
                /*if number hasn't been added to the set it means it's duplicated,
                so it will be added to duplicates set*/
                duplicates.add(number);
            }
        }

        if (!duplicates.isEmpty()){
            //if duplicates set is not empty (contains duplicates)
            System.out.println("\nDuplicated number(s): " + duplicates);
        } else {
            //if duplicates set is empty (no duplicates)
            System.out.println("\nNo duplicates found!");
        }
    }
}
